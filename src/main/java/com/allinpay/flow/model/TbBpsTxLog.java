package com.allinpay.flow.model;

import com.allinpay.base.holder.BaseHolder;
import java.math.BigDecimal;
import java.util.Date;

public class TbBpsTxLog extends BaseHolder {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TB_BPS_TX_LOG.ENTITY_OID
     * @mbggenerated
     */
    private BigDecimal entityOid;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TB_BPS_TX_LOG.WTS_TRACE_NO
     * @mbggenerated
     */
    private String wtsTraceNo;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TB_BPS_TX_LOG.TX_TYPE_ID
     * @mbggenerated
     */
    private String txTypeId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TB_BPS_TX_LOG.NEXT_ID
     * @mbggenerated
     */
    private String nextId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TB_BPS_TX_LOG.TASK_ID
     * @mbggenerated
     */
    private String taskId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TB_BPS_TX_LOG.SYNC_FLAG
     * @mbggenerated
     */
    private String syncFlag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TB_BPS_TX_LOG.CREATE_TIME
     * @mbggenerated
     */
    private Date createTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column TB_BPS_TX_LOG.LAST_UPDATE_TIME
     * @mbggenerated
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TB_BPS_TX_LOG.ENTITY_OID
     * @return  the value of TB_BPS_TX_LOG.ENTITY_OID
     * @mbggenerated
     */
    public BigDecimal getEntityOid()
    {
        return entityOid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TB_BPS_TX_LOG.ENTITY_OID
     * @param entityOid  the value for TB_BPS_TX_LOG.ENTITY_OID
     * @mbggenerated
     */
    public void setEntityOid(BigDecimal entityOid)
    {
        this.entityOid = entityOid;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TB_BPS_TX_LOG.WTS_TRACE_NO
     * @return  the value of TB_BPS_TX_LOG.WTS_TRACE_NO
     * @mbggenerated
     */
    public String getWtsTraceNo()
    {
        return wtsTraceNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TB_BPS_TX_LOG.WTS_TRACE_NO
     * @param wtsTraceNo  the value for TB_BPS_TX_LOG.WTS_TRACE_NO
     * @mbggenerated
     */
    public void setWtsTraceNo(String wtsTraceNo)
    {
        this.wtsTraceNo = wtsTraceNo == null ? null : wtsTraceNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TB_BPS_TX_LOG.TX_TYPE_ID
     * @return  the value of TB_BPS_TX_LOG.TX_TYPE_ID
     * @mbggenerated
     */
    public String getTxTypeId()
    {
        return txTypeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TB_BPS_TX_LOG.TX_TYPE_ID
     * @param txTypeId  the value for TB_BPS_TX_LOG.TX_TYPE_ID
     * @mbggenerated
     */
    public void setTxTypeId(String txTypeId)
    {
        this.txTypeId = txTypeId == null ? null : txTypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TB_BPS_TX_LOG.NEXT_ID
     * @return  the value of TB_BPS_TX_LOG.NEXT_ID
     * @mbggenerated
     */
    public String getNextId()
    {
        return nextId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TB_BPS_TX_LOG.NEXT_ID
     * @param nextId  the value for TB_BPS_TX_LOG.NEXT_ID
     * @mbggenerated
     */
    public void setNextId(String nextId)
    {
        this.nextId = nextId == null ? null : nextId.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TB_BPS_TX_LOG.TASK_ID
     * @return  the value of TB_BPS_TX_LOG.TASK_ID
     * @mbggenerated
     */
    public String getTaskId()
    {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TB_BPS_TX_LOG.TASK_ID
     * @param taskId  the value for TB_BPS_TX_LOG.TASK_ID
     * @mbggenerated
     */
    public void setTaskId(String taskId)
    {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TB_BPS_TX_LOG.SYNC_FLAG
     * @return  the value of TB_BPS_TX_LOG.SYNC_FLAG
     * @mbggenerated
     */
    public String getSyncFlag()
    {
        return syncFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TB_BPS_TX_LOG.SYNC_FLAG
     * @param syncFlag  the value for TB_BPS_TX_LOG.SYNC_FLAG
     * @mbggenerated
     */
    public void setSyncFlag(String syncFlag)
    {
        this.syncFlag = syncFlag == null ? null : syncFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TB_BPS_TX_LOG.CREATE_TIME
     * @return  the value of TB_BPS_TX_LOG.CREATE_TIME
     * @mbggenerated
     */
    public Date getCreateTime()
    {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TB_BPS_TX_LOG.CREATE_TIME
     * @param createTime  the value for TB_BPS_TX_LOG.CREATE_TIME
     * @mbggenerated
     */
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column TB_BPS_TX_LOG.LAST_UPDATE_TIME
     * @return  the value of TB_BPS_TX_LOG.LAST_UPDATE_TIME
     * @mbggenerated
     */
    public Date getLastUpdateTime()
    {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column TB_BPS_TX_LOG.LAST_UPDATE_TIME
     * @param lastUpdateTime  the value for TB_BPS_TX_LOG.LAST_UPDATE_TIME
     * @mbggenerated
     */
    public void setLastUpdateTime(Date lastUpdateTime)
    {
        this.lastUpdateTime = lastUpdateTime;
    }
}