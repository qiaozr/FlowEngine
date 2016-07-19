package com.allinpay.flow.dao;

import com.allinpay.flow.model.TbBpsTxLog;
import com.allinpay.flow.model.TbBpsTxLogExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBpsTxLogMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    int countByExample(TbBpsTxLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    int deleteByExample(TbBpsTxLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal entityOid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    int insert(TbBpsTxLog record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    int insertSelective(TbBpsTxLog record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    List<TbBpsTxLog> selectByExample(TbBpsTxLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    TbBpsTxLog selectByPrimaryKey(BigDecimal entityOid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record")
    TbBpsTxLog record, @Param("example")
    TbBpsTxLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    int updateByExample(@Param("record")
    TbBpsTxLog record, @Param("example")
    TbBpsTxLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbBpsTxLog record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table TB_BPS_TX_LOG
     * @mbggenerated
     */
    int updateByPrimaryKey(TbBpsTxLog record);
}