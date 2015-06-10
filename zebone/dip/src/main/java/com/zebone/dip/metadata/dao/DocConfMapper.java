package com.zebone.dip.metadata.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import com.zebone.btp.core.mybatis.Mapper;
import com.zebone.dip.metadata.vo.DocConf;
@Mapper
public interface DocConfMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int insert(DocConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int insertSelective(DocConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    DocConf selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int updateByPrimaryKeySelective(DocConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DOC_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int updateByPrimaryKey(DocConf record);
    
    
    /**
     * 获取所有的文档结构
     * @return
     */
    List<DocConf> selectAll();

	/**
	 * @author caixl
	 * @date Jun 29, 2013
	 * @description TODO 获取文档信息列表
	 * @param rowBounds
	 * @param docConf 查询条件
	 * @return List<DocConf>
	 */
	List<DocConf> docvInfoList(RowBounds rowBounds, DocConf docConf);

	/**
	 * @author caixl
	 * @date Jun 29, 2013
	 * @description TODO 获取文档总数
	 * @param docConf 查询条件
	 * @return int
	 */
	int docvInfoCount(DocConf docConf);

	/**
	 * @author caixl
	 * @date Jul 1, 2013
	 * @description TODO 逻辑删除相关文档信息
	 * @param list
	 * @return int
	 */
	int removeDocvInfo(List<String> list);

	/**
	 * @author caixl
	 * @date Jul 2, 2013
	 * @description TODO 根据主键 获取文档相关信息
	 * @param id
	 * @return DocConf
	 */
	DocConf getDocConfById(String id);

	/**
	 * @author caixl
	 * @date Jul 3, 2013
	 * @description TODO 保存xml流到库中
	 * @param docId
	 * @param xml 
	 * @return int
	 */
	int saveDocXmlById(@Param("id")String docId, @Param("docXml")String xml);
	
	
	/**
	 * 根据主键获取文档docxml 
	 * @param id
	 * @return
	 */
	DocConf selectDXByPrimaryKey(String id);

	/**
	 * @author caixl
	 * @date Jul 4, 2013
	 * @description TODO
	 * @param id
	 * @return int
	 */
	int getCountById(@Param("id")String id);

	/**
	 * @author caixl
	 * @date Jul 30, 2013
	 * @description TODO 验证文档是否重复
	 * @param docConf
	 * @return int
	 */
	int validateDocInfo(DocConf docConf);

    /**
     * 根据文档ID判断该文档是否存在数据映射关系
     * @param id
     * @return
     */
    int countMappingInfById(String id);

    List<DocConf> getDocInfoLic();

}