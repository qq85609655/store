package com.zebone.dip.ws.resource.dao;

import com.zebone.btp.core.mybatis.Mapper;
import com.zebone.dip.ws.resource.model.PResourceUserInfo;
import com.zebone.dip.ws.resource.model.PResourceUserInfoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PResourceUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    int countByExample(PResourceUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    int deleteByExample(PResourceUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    int deleteByPrimaryKey(String uId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    int insert(PResourceUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    int insertSelective(PResourceUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    List<PResourceUserInfo> selectByExample(PResourceUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    PResourceUserInfo selectByPrimaryKey(String uId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    int updateByExampleSelective(@Param("record") PResourceUserInfo record, @Param("example") PResourceUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    int updateByExample(@Param("record") PResourceUserInfo record, @Param("example") PResourceUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    int updateByPrimaryKeySelective(PResourceUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_USER_INFO
     *
     * @mbggenerated Mon Mar 31 08:42:14 CST 2014
     */
    int updateByPrimaryKey(PResourceUserInfo record);

	int checkUserUnique(PResourceUserInfo resourceUserInfo);
}