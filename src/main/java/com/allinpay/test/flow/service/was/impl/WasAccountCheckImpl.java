package com.allinpay.test.flow.service.was.impl;

import org.springframework.stereotype.Service;

import com.allinpay.test.flow.abstractservice.AbstractWasService;
import com.allinpay.test.flow.vo.FlowSession;

@Service("wasAccountCheckImpl")
public class WasAccountCheckImpl extends AbstractWasService
{

    public FlowSession process(FlowSession flowSession) throws Exception
    {
        System.out.println("WasAccountCheckImpl success!");
        return flowSession;
    }

}
