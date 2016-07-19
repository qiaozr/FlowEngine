package com.allinpay.test.flow.abstractservice;

import java.util.Map;

import com.allinpay.test.base.process.Processor;
import com.allinpay.test.flow.vo.FlowSession;

public abstract class AbstractWasService implements Processor
{
    // 交易入库
    protected void addRecord(FlowSession bpsVo) throws Exception
    {
        System.out.println("trade insert DB");
    }

    // 更新业务流程ID置Log表
    protected void updateCurrentIdToLog(FlowSession bpsVo) throws Exception
    {
        System.out.println("trade updateCurrentIdToLog DB");
    }

    protected Map<String, String> toJson(FlowSession vo) throws Exception
    {
        return null;
    }
}
