package com.allinpay.test.flow.vo;

public class Context
{

    /** 接口同步异步标识 0 同步 1 异步 */
    private String sync = "";
    /** 支付模式 */
    private String payMode = "";
    /** 交易流水号 */
    private String stsTraceNo = "";
    /** 交易返回信息 */
    private String message = "";
    /** 交易类型 */
    private String txTypeId = "";

    public String getTxTypeId()
    {
        return txTypeId;
    }

    public void setTxTypeId(String txTypeId)
    {
        this.txTypeId = txTypeId;
    }

    public String getSync()
    {
        return sync;
    }

    public void setSync(String sync)
    {
        this.sync = sync;
    }

    public String getPayMode()
    {
        return payMode;
    }

    public void setPayMode(String payMode)
    {
        this.payMode = payMode;
    }

    public String getStsTraceNo()
    {
        return stsTraceNo;
    }

    public void setStsTraceNo(String stsTraceNo)
    {
        this.stsTraceNo = stsTraceNo;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

}
