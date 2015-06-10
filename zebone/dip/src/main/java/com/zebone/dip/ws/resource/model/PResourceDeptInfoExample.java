package com.zebone.dip.ws.resource.model;

import java.util.ArrayList;
import java.util.List;

public class PResourceDeptInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public PResourceDeptInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("DEPT_CODE =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("DEPT_CODE <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("DEPT_CODE >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("DEPT_CODE <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("DEPT_CODE like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("DEPT_CODE not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("DEPT_CODE in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("DEPT_CODE not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("DEPT_CODE between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CODE not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptDescIsNull() {
            addCriterion("DEPT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDeptDescIsNotNull() {
            addCriterion("DEPT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDeptDescEqualTo(String value) {
            addCriterion("DEPT_DESC =", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotEqualTo(String value) {
            addCriterion("DEPT_DESC <>", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescGreaterThan(String value) {
            addCriterion("DEPT_DESC >", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_DESC >=", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescLessThan(String value) {
            addCriterion("DEPT_DESC <", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescLessThanOrEqualTo(String value) {
            addCriterion("DEPT_DESC <=", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescLike(String value) {
            addCriterion("DEPT_DESC like", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotLike(String value) {
            addCriterion("DEPT_DESC not like", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescIn(List<String> values) {
            addCriterion("DEPT_DESC in", values, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotIn(List<String> values) {
            addCriterion("DEPT_DESC not in", values, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescBetween(String value1, String value2) {
            addCriterion("DEPT_DESC between", value1, value2, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotBetween(String value1, String value2) {
            addCriterion("DEPT_DESC not between", value1, value2, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("ORG_CODE =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("ORG_CODE <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("ORG_CODE >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("ORG_CODE <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("ORG_CODE like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("ORG_CODE not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("ORG_CODE in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("ORG_CODE not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("ORG_CODE between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeIsNull() {
            addCriterion("PARENT_DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeIsNotNull() {
            addCriterion("PARENT_DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeEqualTo(String value) {
            addCriterion("PARENT_DEPT_CODE =", value, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeNotEqualTo(String value) {
            addCriterion("PARENT_DEPT_CODE <>", value, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeGreaterThan(String value) {
            addCriterion("PARENT_DEPT_CODE >", value, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_DEPT_CODE >=", value, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeLessThan(String value) {
            addCriterion("PARENT_DEPT_CODE <", value, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("PARENT_DEPT_CODE <=", value, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeLike(String value) {
            addCriterion("PARENT_DEPT_CODE like", value, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeNotLike(String value) {
            addCriterion("PARENT_DEPT_CODE not like", value, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeIn(List<String> values) {
            addCriterion("PARENT_DEPT_CODE in", values, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeNotIn(List<String> values) {
            addCriterion("PARENT_DEPT_CODE not in", values, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeBetween(String value1, String value2) {
            addCriterion("PARENT_DEPT_CODE between", value1, value2, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andParentDeptCodeNotBetween(String value1, String value2) {
            addCriterion("PARENT_DEPT_CODE not between", value1, value2, "parentDeptCode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeIsNull() {
            addCriterion("INPUT_ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeIsNotNull() {
            addCriterion("INPUT_ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeEqualTo(String value) {
            addCriterion("INPUT_ORG_CODE =", value, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeNotEqualTo(String value) {
            addCriterion("INPUT_ORG_CODE <>", value, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeGreaterThan(String value) {
            addCriterion("INPUT_ORG_CODE >", value, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_ORG_CODE >=", value, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeLessThan(String value) {
            addCriterion("INPUT_ORG_CODE <", value, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("INPUT_ORG_CODE <=", value, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeLike(String value) {
            addCriterion("INPUT_ORG_CODE like", value, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeNotLike(String value) {
            addCriterion("INPUT_ORG_CODE not like", value, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeIn(List<String> values) {
            addCriterion("INPUT_ORG_CODE in", values, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeNotIn(List<String> values) {
            addCriterion("INPUT_ORG_CODE not in", values, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeBetween(String value1, String value2) {
            addCriterion("INPUT_ORG_CODE between", value1, value2, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputOrgCodeNotBetween(String value1, String value2) {
            addCriterion("INPUT_ORG_CODE not between", value1, value2, "inputOrgCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeIsNull() {
            addCriterion("INPUT_USER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeIsNotNull() {
            addCriterion("INPUT_USER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeEqualTo(String value) {
            addCriterion("INPUT_USER_CODE =", value, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeNotEqualTo(String value) {
            addCriterion("INPUT_USER_CODE <>", value, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeGreaterThan(String value) {
            addCriterion("INPUT_USER_CODE >", value, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_USER_CODE >=", value, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeLessThan(String value) {
            addCriterion("INPUT_USER_CODE <", value, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeLessThanOrEqualTo(String value) {
            addCriterion("INPUT_USER_CODE <=", value, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeLike(String value) {
            addCriterion("INPUT_USER_CODE like", value, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeNotLike(String value) {
            addCriterion("INPUT_USER_CODE not like", value, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeIn(List<String> values) {
            addCriterion("INPUT_USER_CODE in", values, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeNotIn(List<String> values) {
            addCriterion("INPUT_USER_CODE not in", values, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeBetween(String value1, String value2) {
            addCriterion("INPUT_USER_CODE between", value1, value2, "inputUserCode");
            return (Criteria) this;
        }

        public Criteria andInputUserCodeNotBetween(String value1, String value2) {
            addCriterion("INPUT_USER_CODE not between", value1, value2, "inputUserCode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 28 10:50:15 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table P_RESOURCE_DEPT_INFO
     *
     * @mbggenerated Fri Mar 28 10:50:15 CST 2014
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}