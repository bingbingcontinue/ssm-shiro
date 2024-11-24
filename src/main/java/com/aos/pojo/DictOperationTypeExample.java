package com.aos.pojo;

import java.util.ArrayList;
import java.util.List;

public class DictOperationTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    public DictOperationTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
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
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
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

        public Criteria andOperationTypeIdIsNull() {
            addCriterion("operation_type_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdIsNotNull() {
            addCriterion("operation_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdEqualTo(Integer value) {
            addCriterion("operation_type_id =", value, "operationTypeId");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdNotEqualTo(Integer value) {
            addCriterion("operation_type_id <>", value, "operationTypeId");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdGreaterThan(Integer value) {
            addCriterion("operation_type_id >", value, "operationTypeId");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_type_id >=", value, "operationTypeId");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdLessThan(Integer value) {
            addCriterion("operation_type_id <", value, "operationTypeId");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("operation_type_id <=", value, "operationTypeId");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdIn(List<Integer> values) {
            addCriterion("operation_type_id in", values, "operationTypeId");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdNotIn(List<Integer> values) {
            addCriterion("operation_type_id not in", values, "operationTypeId");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("operation_type_id between", value1, value2, "operationTypeId");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_type_id not between", value1, value2, "operationTypeId");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameIsNull() {
            addCriterion("operation_type_name is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameIsNotNull() {
            addCriterion("operation_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameEqualTo(String value) {
            addCriterion("operation_type_name =", value, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameNotEqualTo(String value) {
            addCriterion("operation_type_name <>", value, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameGreaterThan(String value) {
            addCriterion("operation_type_name >", value, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("operation_type_name >=", value, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameLessThan(String value) {
            addCriterion("operation_type_name <", value, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameLessThanOrEqualTo(String value) {
            addCriterion("operation_type_name <=", value, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameLike(String value) {
            addCriterion("operation_type_name like", value, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameNotLike(String value) {
            addCriterion("operation_type_name not like", value, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameIn(List<String> values) {
            addCriterion("operation_type_name in", values, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameNotIn(List<String> values) {
            addCriterion("operation_type_name not in", values, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameBetween(String value1, String value2) {
            addCriterion("operation_type_name between", value1, value2, "operationTypeName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNameNotBetween(String value1, String value2) {
            addCriterion("operation_type_name not between", value1, value2, "operationTypeName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dict_operation_type
     *
     * @mbggenerated do_not_delete_during_merge Sun Nov 24 10:03:46 CST 2024
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dict_operation_type
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
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