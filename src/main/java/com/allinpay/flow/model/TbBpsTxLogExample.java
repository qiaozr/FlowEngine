package com.allinpay.flow.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbBpsTxLogExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public TbBpsTxLogExample()
    {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public String getOrderByClause()
    {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public void setDistinct(boolean distinct)
    {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public boolean isDistinct()
    {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public Criteria or()
    {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public Criteria createCriteria()
    {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0)
        {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public void clear()
    {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria
    {
        protected List<Criterion> criteria;

        protected GeneratedCriteria()
        {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid()
        {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria()
        {
            return criteria;
        }

        public List<Criterion> getCriteria()
        {
            return criteria;
        }

        protected void addCriterion(String condition)
        {
            if (condition == null)
            {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property)
        {
            if (value == null)
            {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property)
        {
            if (value1 == null || value2 == null)
            {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEntityOidIsNull()
        {
            addCriterion("ENTITY_OID is null");
            return (Criteria) this;
        }

        public Criteria andEntityOidIsNotNull()
        {
            addCriterion("ENTITY_OID is not null");
            return (Criteria) this;
        }

        public Criteria andEntityOidEqualTo(BigDecimal value)
        {
            addCriterion("ENTITY_OID =", value, "entityOid");
            return (Criteria) this;
        }

        public Criteria andEntityOidNotEqualTo(BigDecimal value)
        {
            addCriterion("ENTITY_OID <>", value, "entityOid");
            return (Criteria) this;
        }

        public Criteria andEntityOidGreaterThan(BigDecimal value)
        {
            addCriterion("ENTITY_OID >", value, "entityOid");
            return (Criteria) this;
        }

        public Criteria andEntityOidGreaterThanOrEqualTo(BigDecimal value)
        {
            addCriterion("ENTITY_OID >=", value, "entityOid");
            return (Criteria) this;
        }

        public Criteria andEntityOidLessThan(BigDecimal value)
        {
            addCriterion("ENTITY_OID <", value, "entityOid");
            return (Criteria) this;
        }

        public Criteria andEntityOidLessThanOrEqualTo(BigDecimal value)
        {
            addCriterion("ENTITY_OID <=", value, "entityOid");
            return (Criteria) this;
        }

        public Criteria andEntityOidIn(List<BigDecimal> values)
        {
            addCriterion("ENTITY_OID in", values, "entityOid");
            return (Criteria) this;
        }

        public Criteria andEntityOidNotIn(List<BigDecimal> values)
        {
            addCriterion("ENTITY_OID not in", values, "entityOid");
            return (Criteria) this;
        }

        public Criteria andEntityOidBetween(BigDecimal value1, BigDecimal value2)
        {
            addCriterion("ENTITY_OID between", value1, value2, "entityOid");
            return (Criteria) this;
        }

        public Criteria andEntityOidNotBetween(BigDecimal value1, BigDecimal value2)
        {
            addCriterion("ENTITY_OID not between", value1, value2, "entityOid");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoIsNull()
        {
            addCriterion("WTS_TRACE_NO is null");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoIsNotNull()
        {
            addCriterion("WTS_TRACE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoEqualTo(String value)
        {
            addCriterion("WTS_TRACE_NO =", value, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoNotEqualTo(String value)
        {
            addCriterion("WTS_TRACE_NO <>", value, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoGreaterThan(String value)
        {
            addCriterion("WTS_TRACE_NO >", value, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoGreaterThanOrEqualTo(String value)
        {
            addCriterion("WTS_TRACE_NO >=", value, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoLessThan(String value)
        {
            addCriterion("WTS_TRACE_NO <", value, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoLessThanOrEqualTo(String value)
        {
            addCriterion("WTS_TRACE_NO <=", value, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoLike(String value)
        {
            addCriterion("WTS_TRACE_NO like", value, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoNotLike(String value)
        {
            addCriterion("WTS_TRACE_NO not like", value, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoIn(List<String> values)
        {
            addCriterion("WTS_TRACE_NO in", values, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoNotIn(List<String> values)
        {
            addCriterion("WTS_TRACE_NO not in", values, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoBetween(String value1, String value2)
        {
            addCriterion("WTS_TRACE_NO between", value1, value2, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andWtsTraceNoNotBetween(String value1, String value2)
        {
            addCriterion("WTS_TRACE_NO not between", value1, value2, "wtsTraceNo");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdIsNull()
        {
            addCriterion("TX_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdIsNotNull()
        {
            addCriterion("TX_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdEqualTo(String value)
        {
            addCriterion("TX_TYPE_ID =", value, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdNotEqualTo(String value)
        {
            addCriterion("TX_TYPE_ID <>", value, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdGreaterThan(String value)
        {
            addCriterion("TX_TYPE_ID >", value, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdGreaterThanOrEqualTo(String value)
        {
            addCriterion("TX_TYPE_ID >=", value, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdLessThan(String value)
        {
            addCriterion("TX_TYPE_ID <", value, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdLessThanOrEqualTo(String value)
        {
            addCriterion("TX_TYPE_ID <=", value, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdLike(String value)
        {
            addCriterion("TX_TYPE_ID like", value, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdNotLike(String value)
        {
            addCriterion("TX_TYPE_ID not like", value, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdIn(List<String> values)
        {
            addCriterion("TX_TYPE_ID in", values, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdNotIn(List<String> values)
        {
            addCriterion("TX_TYPE_ID not in", values, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdBetween(String value1, String value2)
        {
            addCriterion("TX_TYPE_ID between", value1, value2, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andTxTypeIdNotBetween(String value1, String value2)
        {
            addCriterion("TX_TYPE_ID not between", value1, value2, "txTypeId");
            return (Criteria) this;
        }

        public Criteria andNextIdIsNull()
        {
            addCriterion("NEXT_ID is null");
            return (Criteria) this;
        }

        public Criteria andNextIdIsNotNull()
        {
            addCriterion("NEXT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNextIdEqualTo(String value)
        {
            addCriterion("NEXT_ID =", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotEqualTo(String value)
        {
            addCriterion("NEXT_ID <>", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdGreaterThan(String value)
        {
            addCriterion("NEXT_ID >", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdGreaterThanOrEqualTo(String value)
        {
            addCriterion("NEXT_ID >=", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdLessThan(String value)
        {
            addCriterion("NEXT_ID <", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdLessThanOrEqualTo(String value)
        {
            addCriterion("NEXT_ID <=", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdLike(String value)
        {
            addCriterion("NEXT_ID like", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotLike(String value)
        {
            addCriterion("NEXT_ID not like", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdIn(List<String> values)
        {
            addCriterion("NEXT_ID in", values, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotIn(List<String> values)
        {
            addCriterion("NEXT_ID not in", values, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdBetween(String value1, String value2)
        {
            addCriterion("NEXT_ID between", value1, value2, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotBetween(String value1, String value2)
        {
            addCriterion("NEXT_ID not between", value1, value2, "nextId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull()
        {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull()
        {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value)
        {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value)
        {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value)
        {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value)
        {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value)
        {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value)
        {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value)
        {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value)
        {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values)
        {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values)
        {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2)
        {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2)
        {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIsNull()
        {
            addCriterion("SYNC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIsNotNull()
        {
            addCriterion("SYNC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSyncFlagEqualTo(String value)
        {
            addCriterion("SYNC_FLAG =", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotEqualTo(String value)
        {
            addCriterion("SYNC_FLAG <>", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagGreaterThan(String value)
        {
            addCriterion("SYNC_FLAG >", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagGreaterThanOrEqualTo(String value)
        {
            addCriterion("SYNC_FLAG >=", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLessThan(String value)
        {
            addCriterion("SYNC_FLAG <", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLessThanOrEqualTo(String value)
        {
            addCriterion("SYNC_FLAG <=", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLike(String value)
        {
            addCriterion("SYNC_FLAG like", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotLike(String value)
        {
            addCriterion("SYNC_FLAG not like", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIn(List<String> values)
        {
            addCriterion("SYNC_FLAG in", values, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotIn(List<String> values)
        {
            addCriterion("SYNC_FLAG not in", values, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagBetween(String value1, String value2)
        {
            addCriterion("SYNC_FLAG between", value1, value2, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotBetween(String value1, String value2)
        {
            addCriterion("SYNC_FLAG not between", value1, value2, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull()
        {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull()
        {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value)
        {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value)
        {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value)
        {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value)
        {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value)
        {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value)
        {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values)
        {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values)
        {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2)
        {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2)
        {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull()
        {
            addCriterion("LAST_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull()
        {
            addCriterion("LAST_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value)
        {
            addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value)
        {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value)
        {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value)
        {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value)
        {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value)
        {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values)
        {
            addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values)
        {
            addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2)
        {
            addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2)
        {
            addCriterion("LAST_UPDATE_TIME not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    public static class Criterion
    {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition()
        {
            return condition;
        }

        public Object getValue()
        {
            return value;
        }

        public Object getSecondValue()
        {
            return secondValue;
        }

        public boolean isNoValue()
        {
            return noValue;
        }

        public boolean isSingleValue()
        {
            return singleValue;
        }

        public boolean isBetweenValue()
        {
            return betweenValue;
        }

        public boolean isListValue()
        {
            return listValue;
        }

        public String getTypeHandler()
        {
            return typeHandler;
        }

        protected Criterion(String condition)
        {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>)
            {
                this.listValue = true;
            }
            else
            {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value)
        {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue)
        {
            this(condition, value, secondValue, null);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_BPS_TX_LOG
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}