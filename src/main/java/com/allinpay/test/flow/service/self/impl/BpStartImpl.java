package com.allinpay.test.flow.service.self.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allinpay.flow.busi.service.TbBpsTxLogServiceImpl;
import com.allinpay.test.base.process.Processor;
import com.allinpay.test.flow.vo.Context;
import com.allinpay.test.flow.vo.FlowSession;

@Service("bpStartImpl")
public class BpStartImpl implements Processor
{
    @Autowired
    private TbBpsTxLogServiceImpl tbBpsTxLogServiceImpl;

    public FlowSession process(FlowSession flowSession) throws Exception
    {
        System.out.println("BpStartImpl.taskProcess success");
        Context context = flowSession.getContext();
        context.setMessage("业务已受理!");
        flowSession.setContext(context);
        tbBpsTxLogServiceImpl.inertTxLog(flowSession);
        return flowSession;
    }

}
