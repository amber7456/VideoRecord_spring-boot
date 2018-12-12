package com.videorecord.dao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiskInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiskInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andDiskIdIsNull() {
            addCriterion("disk_id is null");
            return (Criteria) this;
        }

        public Criteria andDiskIdIsNotNull() {
            addCriterion("disk_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiskIdEqualTo(String value) {
            addCriterion("disk_id =", value, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdNotEqualTo(String value) {
            addCriterion("disk_id <>", value, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdGreaterThan(String value) {
            addCriterion("disk_id >", value, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdGreaterThanOrEqualTo(String value) {
            addCriterion("disk_id >=", value, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdLessThan(String value) {
            addCriterion("disk_id <", value, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdLessThanOrEqualTo(String value) {
            addCriterion("disk_id <=", value, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdLike(String value) {
            addCriterion("disk_id like", value, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdNotLike(String value) {
            addCriterion("disk_id not like", value, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdIn(List<String> values) {
            addCriterion("disk_id in", values, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdNotIn(List<String> values) {
            addCriterion("disk_id not in", values, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdBetween(String value1, String value2) {
            addCriterion("disk_id between", value1, value2, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskIdNotBetween(String value1, String value2) {
            addCriterion("disk_id not between", value1, value2, "diskId");
            return (Criteria) this;
        }

        public Criteria andDiskNameIsNull() {
            addCriterion("disk_name is null");
            return (Criteria) this;
        }

        public Criteria andDiskNameIsNotNull() {
            addCriterion("disk_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiskNameEqualTo(String value) {
            addCriterion("disk_name =", value, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameNotEqualTo(String value) {
            addCriterion("disk_name <>", value, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameGreaterThan(String value) {
            addCriterion("disk_name >", value, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameGreaterThanOrEqualTo(String value) {
            addCriterion("disk_name >=", value, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameLessThan(String value) {
            addCriterion("disk_name <", value, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameLessThanOrEqualTo(String value) {
            addCriterion("disk_name <=", value, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameLike(String value) {
            addCriterion("disk_name like", value, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameNotLike(String value) {
            addCriterion("disk_name not like", value, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameIn(List<String> values) {
            addCriterion("disk_name in", values, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameNotIn(List<String> values) {
            addCriterion("disk_name not in", values, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameBetween(String value1, String value2) {
            addCriterion("disk_name between", value1, value2, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskNameNotBetween(String value1, String value2) {
            addCriterion("disk_name not between", value1, value2, "diskName");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityIsNull() {
            addCriterion("disk_capacity is null");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityIsNotNull() {
            addCriterion("disk_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityEqualTo(String value) {
            addCriterion("disk_capacity =", value, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityNotEqualTo(String value) {
            addCriterion("disk_capacity <>", value, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityGreaterThan(String value) {
            addCriterion("disk_capacity >", value, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("disk_capacity >=", value, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityLessThan(String value) {
            addCriterion("disk_capacity <", value, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityLessThanOrEqualTo(String value) {
            addCriterion("disk_capacity <=", value, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityLike(String value) {
            addCriterion("disk_capacity like", value, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityNotLike(String value) {
            addCriterion("disk_capacity not like", value, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityIn(List<String> values) {
            addCriterion("disk_capacity in", values, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityNotIn(List<String> values) {
            addCriterion("disk_capacity not in", values, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityBetween(String value1, String value2) {
            addCriterion("disk_capacity between", value1, value2, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskCapacityNotBetween(String value1, String value2) {
            addCriterion("disk_capacity not between", value1, value2, "diskCapacity");
            return (Criteria) this;
        }

        public Criteria andDiskStateIsNull() {
            addCriterion("disk_state is null");
            return (Criteria) this;
        }

        public Criteria andDiskStateIsNotNull() {
            addCriterion("disk_state is not null");
            return (Criteria) this;
        }

        public Criteria andDiskStateEqualTo(String value) {
            addCriterion("disk_state =", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateNotEqualTo(String value) {
            addCriterion("disk_state <>", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateGreaterThan(String value) {
            addCriterion("disk_state >", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateGreaterThanOrEqualTo(String value) {
            addCriterion("disk_state >=", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateLessThan(String value) {
            addCriterion("disk_state <", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateLessThanOrEqualTo(String value) {
            addCriterion("disk_state <=", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateLike(String value) {
            addCriterion("disk_state like", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateNotLike(String value) {
            addCriterion("disk_state not like", value, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateIn(List<String> values) {
            addCriterion("disk_state in", values, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateNotIn(List<String> values) {
            addCriterion("disk_state not in", values, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateBetween(String value1, String value2) {
            addCriterion("disk_state between", value1, value2, "diskState");
            return (Criteria) this;
        }

        public Criteria andDiskStateNotBetween(String value1, String value2) {
            addCriterion("disk_state not between", value1, value2, "diskState");
            return (Criteria) this;
        }

        public Criteria andIsFullIsNull() {
            addCriterion("is_full is null");
            return (Criteria) this;
        }

        public Criteria andIsFullIsNotNull() {
            addCriterion("is_full is not null");
            return (Criteria) this;
        }

        public Criteria andIsFullEqualTo(String value) {
            addCriterion("is_full =", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotEqualTo(String value) {
            addCriterion("is_full <>", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullGreaterThan(String value) {
            addCriterion("is_full >", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullGreaterThanOrEqualTo(String value) {
            addCriterion("is_full >=", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLessThan(String value) {
            addCriterion("is_full <", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLessThanOrEqualTo(String value) {
            addCriterion("is_full <=", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLike(String value) {
            addCriterion("is_full like", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotLike(String value) {
            addCriterion("is_full not like", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullIn(List<String> values) {
            addCriterion("is_full in", values, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotIn(List<String> values) {
            addCriterion("is_full not in", values, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullBetween(String value1, String value2) {
            addCriterion("is_full between", value1, value2, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotBetween(String value1, String value2) {
            addCriterion("is_full not between", value1, value2, "isFull");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNull() {
            addCriterion("video_type is null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNotNull() {
            addCriterion("video_type is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeEqualTo(String value) {
            addCriterion("video_type =", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotEqualTo(String value) {
            addCriterion("video_type <>", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThan(String value) {
            addCriterion("video_type >", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("video_type >=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThan(String value) {
            addCriterion("video_type <", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThanOrEqualTo(String value) {
            addCriterion("video_type <=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLike(String value) {
            addCriterion("video_type like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotLike(String value) {
            addCriterion("video_type not like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIn(List<String> values) {
            addCriterion("video_type in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotIn(List<String> values) {
            addCriterion("video_type not in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeBetween(String value1, String value2) {
            addCriterion("video_type between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotBetween(String value1, String value2) {
            addCriterion("video_type not between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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