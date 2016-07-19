package com.allinpay.flow.domain;

public class TbStsBpLog
{
    /** 交易类型 */
    private String txTypeId;
    /** 下一个节点ID */
    private String nextId;

    public String getTxTypeId()
    {
        return txTypeId;
    }

    public void setTxTypeId(String txTypeId)
    {
        this.txTypeId = txTypeId;
    }

    public String getNextId()
    {
        return nextId;
    }

    public void setNextId(String nextId)
    {
        this.nextId = nextId;
    }

}
