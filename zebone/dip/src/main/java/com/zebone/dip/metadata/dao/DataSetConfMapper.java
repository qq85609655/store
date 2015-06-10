package com.zebone.dip.metadata.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.zebone.btp.core.mybatis.Mapper;
import com.zebone.dip.metadata.vo.DataSetConf;
@Mapper
public interface DataSetConfMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DATASET_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DATASET_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int insert(DataSetConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DATASET_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int insertSelective(DataSetConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DATASET_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    DataSetConf selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DATASET_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int updateByPrimaryKeySelective(DataSetConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_DATASET_CONF
     *
     * @mbggenerated Tue Jun 25 14:45:52 CST 2013
     */
    int updateByPrimaryKey(DataSetConf record);

    /**
	 * @author caixl
	 * @date Jun 26, 2013
	 * @description TODO 获取数据集列表
	 * @param rowBounds
	 * @param dataSetConf
	 * @return List<DataSetConf>
	 */
	List<DataSetConf> datasetList(RowBounds rowBounds, DataSetConf dataSetConf);

	/**
	 * @author caixl
	 * @date Jun 26, 2013
	 * @description TODO 获取数据集总数
	 * @param dataSetConf
	 * @return int
	 */
	int datasetTotalCount(DataSetConf dataSetConf);

	/**
	 * @author caixl
	 * @date Jun 28, 2013
	 * @description TODO 删除数据集相关信息
	 * @param list
	 * @return int
	 */
	int removeDatasetByIds(List<String> list);

	/**
	 * @author caixl
	 * @date Jul 2, 2013
	 * @description TODO 获取 数据集信息
	 * @return List<String>
	 */
	List<String> getDatasetNames();

	/**
	 * @author caixl
	 * @date Jul 26, 2013
	 * @description TODO 验证是否存在相同版本和同名的数据集
	 * @param dataSetConf
	 * @return int
	 */
	int existsDatasetInfo(DataSetConf dataSetConf);

	/**
	 * 获取数据集信息集合
	 * @param name
	 * @return 
	 * List<DataSetConf>
	 */
	List<DataSetConf> getListByName(String name);

}