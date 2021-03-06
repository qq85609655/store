package com.zebone.dip.ws.resource.dao;

import com.zebone.btp.core.mybatis.Mapper;
import com.zebone.dip.ws.resource.model.PResourceDeptLog;
import com.zebone.dip.ws.resource.model.PResourceDeptLogExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PResourceDeptLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    int countByExample(PResourceDeptLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    int deleteByExample(PResourceDeptLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    int insert(PResourceDeptLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    int insertSelective(PResourceDeptLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    List<PResourceDeptLog> selectByExample(PResourceDeptLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    PResourceDeptLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    int updateByExampleSelective(@Param("record") PResourceDeptLog record, @Param("example") PResourceDeptLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    int updateByExample(@Param("record") PResourceDeptLog record, @Param("example") PResourceDeptLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    int updateByPrimaryKeySelective(PResourceDeptLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_LOG
     *
     * @mbggenerated Sat Mar 29 09:34:34 CST 2014
     */
    int updateByPrimaryKey(PResourceDeptLog record);
}