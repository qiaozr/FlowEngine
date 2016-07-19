package com.allinpay.test.flow.execute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allinpay.flow.busi.service.TbBpsTxLogServiceImpl;
import com.allinpay.flow.demo.FlowEngine;
import com.allinpay.flow.model.TbBpsTxLog;
import com.allinpay.test.flow.vo.FlowSession;

/**
 * 流程模板配置获取
 * 
 * @author Q
 * @since 2016-07-09
 */
@Service("flowTempletConfig")
public class FlowInstance
{
    @Autowired
    private TbBpsTxLogServiceImpl tbBpsTxLogServiceImpl;

    /**
     * 异步交易调用服务 根据sts流水号获取流程执行参数
     * 
     * @param stsTraceNo
     * @return
     */
    public void initFlowConfig(FlowSession flowSession)
    {
        TbBpsTxLog tbBpsTxLog = tbBpsTxLogServiceImpl.getTbBpsLogByTraceNo(flowSession);
        FlowEngine flowEngine = com.allinpay.flow.util.FlowTempletsUtils.FLOW_TEMPLET_MAP
                .get(flowSession.getEngineId());
        if (null == tbBpsTxLog)
        {
            flowSession.setTaskId(flowEngine.getStart().getId());
            flowSession.setNextId(flowEngine.getStart().getNextId());
        }
        else
        {
            flowSession.setTaskId(tbBpsTxLog.getNextId());
        }
    }
}
