package com.zebone.dip.metadata.vo;

public class DatasetMapping {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_DATASET_MAPPING.ID_
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_DATASET_MAPPING.FIELD_ID
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    private String fieldId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column P_DATASET_MAPPING.DATASET_ID
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    private String datasetId;
    
    private String fieldName;

    public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_DATASET_MAPPING.ID_
     *
     * @return the value of P_DATASET_MAPPING.ID_
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_DATASET_MAPPING.ID_
     *
     * @param id the value for P_DATASET_MAPPING.ID_
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_DATASET_MAPPING.FIELD_ID
     *
     * @return the value of P_DATASET_MAPPING.FIELD_ID
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    public String getFieldId() {
        return fieldId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_DATASET_MAPPING.FIELD_ID
     *
     * @param fieldId the value for P_DATASET_MAPPING.FIELD_ID
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId == null ? null : fieldId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column P_DATASET_MAPPING.DATASET_ID
     *
     * @return the value of P_DATASET_MAPPING.DATASET_ID
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    public String getDatasetId() {
        return datasetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column P_DATASET_MAPPING.DATASET_ID
     *
     * @param datasetId the value for P_DATASET_MAPPING.DATASET_ID
     *
     * @mbggenerated Fri Jun 28 08:34:54 CST 2013
     */
    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId == null ? null : datasetId.trim();
    }
}