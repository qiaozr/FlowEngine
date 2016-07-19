package com.allinpay.test.base.process;

import com.allinpay.test.flow.vo.FlowSession;

public interface Processor
{
    // 任务节点||决策节点执行
    public FlowSession process(FlowSession flowSession) throws Exception;

}
