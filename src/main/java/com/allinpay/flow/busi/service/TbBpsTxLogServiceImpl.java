package com.allinpay.flow.busi.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allinpay.flow.dao.TbBpsTxLogMapper;
import com.allinpay.flow.model.TbBpsTxLog;
import com.allinpay.flow.model.TbBpsTxLogExample;
import com.allinpay.test.flow.vo.FlowSession;

/** 业务流程服务 */
@Service("tbBpsTxLogServiceImpl")
public class TbBpsTxLogServiceImpl
{
    @Autowired
    private TbBpsTxLogMapper tbBpsTxLogMapper;

    public void inertTxLog(FlowSession flowSession) throws Exception
    {
        TbBpsTxLog tbBpsTxLog = new TbBpsTxLog();
        tbBpsTxLog.setWtsTraceNo(flowSession.getContext().getStsTraceNo());
        tbBpsTxLog.setTxTypeId(flowSession.getContext().getTxTypeId());
        tbBpsTxLog.setTaskId(flowSession.getTaskId());
        tbBpsTxLog.setSyncFlag(flowSession.getContext().getSync());
        tbBpsTxLog.setNextId(flowSession.getNextId());
        tbBpsTxLog.setCreateTime(new Date());
        tbBpsTxLog.setLastUpdateTime(new Date());
        tbBpsTxLogMapper.insert(tbBpsTxLog);
        System.out.println("inert BpsTxLog is OK!");
    }

    public void updateTaskId(FlowSession flowSession) throws Exception
    {
        TbBpsTxLog tbBpsTxLog = new TbBpsTxLog();
        tbBpsTxLog.setTaskId(flowSession.getTaskId());
        tbBpsTxLog.setNextId(flowSession.getNextId());
        tbBpsTxLog.setLastUpdateTime(new Date());
        TbBpsTxLogExample example = new TbBpsTxLogExample();
        example.createCriteria().andWtsTraceNoEqualTo(flowSession.getContext().getStsTraceNo());
        int i = tbBpsTxLogMapper.updateByExampleSelective(tbBpsTxLog, example);
        System.out.println("effective lines i =" + i);
    }

    public TbBpsTxLog getTbBpsLogByTraceNo(FlowSession flowSession)
    {
        TbBpsTxLogExample example = new TbBpsTxLogExample();
        example.createCriteria().andWtsTraceNoEqualTo(flowSession.getContext().getStsTraceNo());
        List<TbBpsTxLog> list = tbBpsTxLogMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) return list.get(0);
        return null;
    }

    public void printTest(String aa)
    {
        System.out.println(aa);
    }
}
