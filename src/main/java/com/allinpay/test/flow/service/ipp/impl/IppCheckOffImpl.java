package com.allinpay.test.flow.service.ipp.impl;

import org.springframework.stereotype.Service;

import com.allinpay.test.flow.abstractservice.AbstractIppService;
import com.allinpay.test.flow.vo.FlowSession;

@Service("ippCheckOffImpl")
public class IppCheckOffImpl extends AbstractIppService
{

    public FlowSession process(FlowSession flowSession) throws Exception
    {
        System.out.println("ippcheckOffOk!");
        addRecord(flowSession);
        return flowSession;
    }
}
