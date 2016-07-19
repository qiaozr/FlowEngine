package com.allinpay.test.flow.execute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.allinpay.flow.busi.service.TbBpsTxLogServiceImpl;
import com.allinpay.flow.demo.FlowEngine;
import com.allinpay.flow.demo.Task;
import com.allinpay.flow.util.FlowTempletsUtils;
import com.allinpay.test.base.process.Processor;
import com.allinpay.test.flow.vo.FlowSession;

/**
 * 流程执行主类
 * 
 * @author Q
 * 
 */
@Service("flowDriver")
public class FlowDriver
{
    /** 模板配置信息 */
    @Autowired
    private FlowInstance flowInstance;
    @Autowired
    private TbBpsTxLogServiceImpl tbBpsTxLogServiceImpl;
    /** 全局Spring 容器 */
    private static WebApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();

    /**
     * 流程引擎执行入口
     * 
     * @param bpsVo
     * @param traceNo
     * @throws Exception
     */
    public FlowSession processTask(FlowSession flowSession) throws Exception
    {
        // 初始化流程配置信息
        flowInstance.initFlowConfig(flowSession);
        FlowEngine flowEngine = FlowTempletsUtils.FLOW_TEMPLET_MAP.get(flowSession.getEngineId());
        while (true)
        {
            // 获取执行节点信息
            Task task = getTaskById(flowEngine, flowSession.getTaskId());
            // 交易为同步交易时 不返回 到end节点处返回，为同步时 执行完start节点返回已受理
            Processor processor = ctx.getBean(task.getBeanName(), Processor.class);
            // 任务执行
            flowSession = processor.process(flowSession);
            // 更新Session中的节点信息
            changeFlowSessionInfo(flowSession, task);
            // 更新流程控制表的执行信息
            tbBpsTxLogServiceImpl.updateTaskId(flowSession);
            // 更新下一步操作节点Id
            flowSession.setTaskId(flowSession.getNextId());
            // 异步流程
            if (flowSession.getContext().getSync().equals("1"))
            {
                if (task.getId().equals(flowEngine.getStart().getId()))
                {
                    new MyThead(flowSession).start();
                    return flowSession;
                }
                // 当前节点为异步操作 退出循环
                if (task.getSync().equals("1"))
                {
                    // 同步操作继续执行
                    break;
                }
            }
            // 执行到end节点返回
            if (task.getId().equals(flowEngine.getEnd().getId()))
            {
                return flowSession;
            }
        }
        return null;
    }

    class MyThead extends Thread
    {
        private FlowSession flowSession;

        public MyThead(FlowSession flowSession)
        {
            this.flowSession = flowSession;
        }

        public FlowSession getFlowSession()
        {
            return flowSession;
        }

        public void setFlowSession(FlowSession flowSession)
        {
            this.flowSession = flowSession;
        }

        public void run()
        {
            try
            {
                processTask(flowSession);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }

    // 更新下一步节点信息
    private void changeFlowSessionInfo(FlowSession flowSession, Task task)
    {
        flowSession.setTaskId(task.getId());
        if (null != task.getBeanMap())
        {
            String nextId = task.getBeanMap().get(flowSession.getDescisionResult()).getNextId();
            flowSession.setNextId(nextId);
        }
        else
        {
            flowSession.setNextId(task.getNextId());
        }
    }

    private Task getTaskById(FlowEngine flowEngine, String taskId)
    {
        Task task = null;
        if (taskId.equals("start"))
        {
            task = flowEngine.getStart();
        }
        else if (taskId.equals("end"))
        {
            task = flowEngine.getEnd();
        }
        else
        {
            task = flowEngine.getBeanMap().get(taskId);
        }
        return task;
    }
}
