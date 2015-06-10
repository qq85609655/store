package com.zebone.empi.dao;

import com.zebone.btp.core.mybatis.Mapper;
import com.zebone.empi.vo.EmpiUnbindLog;
import com.zebone.empi.vo.EmpiUnbindLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmpiUnbindLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int countByExample(EmpiUnbindLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int deleteByExample(EmpiUnbindLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int insert(EmpiUnbindLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int insertSelective(EmpiUnbindLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    List<EmpiUnbindLog> selectByExampleWithBLOBs(EmpiUnbindLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    List<EmpiUnbindLog> selectByExample(EmpiUnbindLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    EmpiUnbindLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int updateByExampleSelective(@Param("record") EmpiUnbindLog record, @Param("example") EmpiUnbindLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int updateByExampleWithBLOBs(@Param("record") EmpiUnbindLog record, @Param("example") EmpiUnbindLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int updateByExample(@Param("record") EmpiUnbindLog record, @Param("example") EmpiUnbindLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int updateByPrimaryKeySelective(EmpiUnbindLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int updateByPrimaryKeyWithBLOBs(EmpiUnbindLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table E_UNBIND_LOG
     *
     * @mbggenerated Fri Oct 24 08:46:45 CST 2014
     */
    int updateByPrimaryKey(EmpiUnbindLog record);
}