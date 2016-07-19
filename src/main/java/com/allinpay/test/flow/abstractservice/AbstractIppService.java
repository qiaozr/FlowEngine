package com.allinpay.test.flow.abstractservice;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.allinpay.flow.busi.service.TbBpsTxLogServiceImpl;
import com.allinpay.test.base.process.Processor;
import com.allinpay.test.flow.vo.FlowSession;

public abstract class AbstractIppService implements Processor
{
    @Autowired
    private TbBpsTxLogServiceImpl tbBpsTxLogServiceImpl;

    // 交易入库
    protected void addRecord(FlowSession bpsVo) throws Exception
    {
        if (tbBpsTxLogServiceImpl != null)
        {
            tbBpsTxLogServiceImpl.printTest("abstrct Test OK");
        }
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
