package com.allinpay.test.flow.service.self.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allinpay.flow.busi.service.TbBpsTxLogServiceImpl;
import com.allinpay.test.base.process.Processor;
import com.allinpay.test.flow.vo.FlowSession;

@Service("descisionService")
public class DescisionImpl implements Processor
{
    @Autowired
    private TbBpsTxLogServiceImpl tbBpsTxLogServiceImpl;

    public FlowSession process(FlowSession flowSession) throws Exception
    {
        System.out.println("决策节点返回值：" + flowSession.getContext().getPayMode());
        flowSession.setDescisionResult(flowSession.getContext().getPayMode());
        System.out.println("执行决策节点success");
        return flowSession;
    }
}
