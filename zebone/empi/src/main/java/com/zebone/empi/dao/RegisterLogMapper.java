package com.zebone.empi.dao;

import com.zebone.btp.core.mybatis.DcMapper;
import com.zebone.btp.core.mybatis.WrcMapper;
import com.zebone.empi.vo.RegisterLog;
import com.zebone.empi.vo.RegisterLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@WrcMapper
public interface RegisterLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    int countByExample(RegisterLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    int deleteByExample(RegisterLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    int insert(RegisterLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    int insertSelective(RegisterLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    List<RegisterLog> selectByExample(RegisterLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    RegisterLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    int updateByExampleSelective(@Param("record") RegisterLog record, @Param("example") RegisterLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    int updateByExample(@Param("record") RegisterLog record, @Param("example") RegisterLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    int updateByPrimaryKeySelective(RegisterLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table R_REGISTER_LOG
     *
     * @mbggenerated Mon Aug 11 14:55:23 CST 2014
     */
    int updateByPrimaryKey(RegisterLog record);
}