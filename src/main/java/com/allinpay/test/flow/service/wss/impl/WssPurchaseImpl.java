package com.allinpay.test.flow.service.wss.impl;

import org.springframework.stereotype.Service;

import com.allinpay.test.flow.abstractservice.AbstractWssService;
import com.allinpay.test.flow.vo.FlowSession;

@Service("wssPurchaseImpl")
public class WssPurchaseImpl extends AbstractWssService
{

    public FlowSession process(FlowSession flowSession) throws Exception
    {
        System.out.println("WssPurchaseImpl success!");
        return flowSession;
    }
}
