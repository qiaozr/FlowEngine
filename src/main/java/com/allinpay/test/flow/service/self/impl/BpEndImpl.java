package com.allinpay.test.flow.service.self.impl;

import org.springframework.stereotype.Service;

import com.allinpay.test.base.process.Processor;
import com.allinpay.test.flow.vo.Context;
import com.allinpay.test.flow.vo.FlowSession;

@Service("bpEndImpl")
public class BpEndImpl implements Processor
{
    public FlowSession process(FlowSession flowSession) throws Exception
    {
        System.out.println("BpEndImpl.taskProcess success");
        Context context = flowSession.getContext();
        context.setMessage("交易已完成!");
        flowSession.setContext(context);
        return flowSession;
    }
}
