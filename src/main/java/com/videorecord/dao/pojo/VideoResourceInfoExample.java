package com.videorecord.dao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoResourceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoResourceInfoExample() {
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

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(String value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(String value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(String value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(String value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(String value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLike(String value) {
            addCriterion("video_id like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotLike(String value) {
            addCriterion("video_id not like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<String> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<String> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(String value1, String value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(String value1, String value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("resource_type is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("resource_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("resource_type =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("resource_type <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("resource_type >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("resource_type >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("resource_type <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("resource_type <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("resource_type like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("resource_type not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("resource_type in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("resource_type not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("resource_type between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("resource_type not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceFormatIsNull() {
            addCriterion("resource_format is null");
            return (Criteria) this;
        }

        public Criteria andResourceFormatIsNotNull() {
            addCriterion("resource_format is not null");
            return (Criteria) this;
        }

        public Criteria andResourceFormatEqualTo(String value) {
            addCriterion("resource_format =", value, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatNotEqualTo(String value) {
            addCriterion("resource_format <>", value, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatGreaterThan(String value) {
            addCriterion("resource_format >", value, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatGreaterThanOrEqualTo(String value) {
            addCriterion("resource_format >=", value, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatLessThan(String value) {
            addCriterion("resource_format <", value, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatLessThanOrEqualTo(String value) {
            addCriterion("resource_format <=", value, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatLike(String value) {
            addCriterion("resource_format like", value, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatNotLike(String value) {
            addCriterion("resource_format not like", value, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatIn(List<String> values) {
            addCriterion("resource_format in", values, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatNotIn(List<String> values) {
            addCriterion("resource_format not in", values, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatBetween(String value1, String value2) {
            addCriterion("resource_format between", value1, value2, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceFormatNotBetween(String value1, String value2) {
            addCriterion("resource_format not between", value1, value2, "resourceFormat");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionIsNull() {
            addCriterion("resource_resolution is null");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionIsNotNull() {
            addCriterion("resource_resolution is not null");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionEqualTo(String value) {
            addCriterion("resource_resolution =", value, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionNotEqualTo(String value) {
            addCriterion("resource_resolution <>", value, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionGreaterThan(String value) {
            addCriterion("resource_resolution >", value, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionGreaterThanOrEqualTo(String value) {
            addCriterion("resource_resolution >=", value, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionLessThan(String value) {
            addCriterion("resource_resolution <", value, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionLessThanOrEqualTo(String value) {
            addCriterion("resource_resolution <=", value, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionLike(String value) {
            addCriterion("resource_resolution like", value, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionNotLike(String value) {
            addCriterion("resource_resolution not like", value, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionIn(List<String> values) {
            addCriterion("resource_resolution in", values, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionNotIn(List<String> values) {
            addCriterion("resource_resolution not in", values, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionBetween(String value1, String value2) {
            addCriterion("resource_resolution between", value1, value2, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceResolutionNotBetween(String value1, String value2) {
            addCriterion("resource_resolution not between", value1, value2, "resourceResolution");
            return (Criteria) this;
        }

        public Criteria andResourceSubIsNull() {
            addCriterion("resource_sub is null");
            return (Criteria) this;
        }

        public Criteria andResourceSubIsNotNull() {
            addCriterion("resource_sub is not null");
            return (Criteria) this;
        }

        public Criteria andResourceSubEqualTo(String value) {
            addCriterion("resource_sub =", value, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubNotEqualTo(String value) {
            addCriterion("resource_sub <>", value, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubGreaterThan(String value) {
            addCriterion("resource_sub >", value, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubGreaterThanOrEqualTo(String value) {
            addCriterion("resource_sub >=", value, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubLessThan(String value) {
            addCriterion("resource_sub <", value, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubLessThanOrEqualTo(String value) {
            addCriterion("resource_sub <=", value, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubLike(String value) {
            addCriterion("resource_sub like", value, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubNotLike(String value) {
            addCriterion("resource_sub not like", value, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubIn(List<String> values) {
            addCriterion("resource_sub in", values, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubNotIn(List<String> values) {
            addCriterion("resource_sub not in", values, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubBetween(String value1, String value2) {
            addCriterion("resource_sub between", value1, value2, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubNotBetween(String value1, String value2) {
            addCriterion("resource_sub not between", value1, value2, "resourceSub");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeIsNull() {
            addCriterion("resource_sub_type is null");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeIsNotNull() {
            addCriterion("resource_sub_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeEqualTo(String value) {
            addCriterion("resource_sub_type =", value, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeNotEqualTo(String value) {
            addCriterion("resource_sub_type <>", value, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeGreaterThan(String value) {
            addCriterion("resource_sub_type >", value, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeGreaterThanOrEqualTo(String value) {
            addCriterion("resource_sub_type >=", value, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeLessThan(String value) {
            addCriterion("resource_sub_type <", value, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeLessThanOrEqualTo(String value) {
            addCriterion("resource_sub_type <=", value, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeLike(String value) {
            addCriterion("resource_sub_type like", value, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeNotLike(String value) {
            addCriterion("resource_sub_type not like", value, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeIn(List<String> values) {
            addCriterion("resource_sub_type in", values, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeNotIn(List<String> values) {
            addCriterion("resource_sub_type not in", values, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeBetween(String value1, String value2) {
            addCriterion("resource_sub_type between", value1, value2, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceSubTypeNotBetween(String value1, String value2) {
            addCriterion("resource_sub_type not between", value1, value2, "resourceSubType");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeIsNull() {
            addCriterion("resource_record_time is null");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeIsNotNull() {
            addCriterion("resource_record_time is not null");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeEqualTo(Date value) {
            addCriterion("resource_record_time =", value, "resourceRecordTime");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeNotEqualTo(Date value) {
            addCriterion("resource_record_time <>", value, "resourceRecordTime");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeGreaterThan(Date value) {
            addCriterion("resource_record_time >", value, "resourceRecordTime");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("resource_record_time >=", value, "resourceRecordTime");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeLessThan(Date value) {
            addCriterion("resource_record_time <", value, "resourceRecordTime");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("resource_record_time <=", value, "resourceRecordTime");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeIn(List<Date> values) {
            addCriterion("resource_record_time in", values, "resourceRecordTime");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeNotIn(List<Date> values) {
            addCriterion("resource_record_time not in", values, "resourceRecordTime");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeBetween(Date value1, Date value2) {
            addCriterion("resource_record_time between", value1, value2, "resourceRecordTime");
            return (Criteria) this;
        }

        public Criteria andResourceRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("resource_record_time not between", value1, value2, "resourceRecordTime");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressIsNull() {
            addCriterion("resource_record_address is null");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressIsNotNull() {
            addCriterion("resource_record_address is not null");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressEqualTo(String value) {
            addCriterion("resource_record_address =", value, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressNotEqualTo(String value) {
            addCriterion("resource_record_address <>", value, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressGreaterThan(String value) {
            addCriterion("resource_record_address >", value, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressGreaterThanOrEqualTo(String value) {
            addCriterion("resource_record_address >=", value, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressLessThan(String value) {
            addCriterion("resource_record_address <", value, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressLessThanOrEqualTo(String value) {
            addCriterion("resource_record_address <=", value, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressLike(String value) {
            addCriterion("resource_record_address like", value, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressNotLike(String value) {
            addCriterion("resource_record_address not like", value, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressIn(List<String> values) {
            addCriterion("resource_record_address in", values, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressNotIn(List<String> values) {
            addCriterion("resource_record_address not in", values, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressBetween(String value1, String value2) {
            addCriterion("resource_record_address between", value1, value2, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRecordAddressNotBetween(String value1, String value2) {
            addCriterion("resource_record_address not between", value1, value2, "resourceRecordAddress");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkIsNull() {
            addCriterion("resource_remark is null");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkIsNotNull() {
            addCriterion("resource_remark is not null");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkEqualTo(String value) {
            addCriterion("resource_remark =", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkNotEqualTo(String value) {
            addCriterion("resource_remark <>", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkGreaterThan(String value) {
            addCriterion("resource_remark >", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("resource_remark >=", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkLessThan(String value) {
            addCriterion("resource_remark <", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkLessThanOrEqualTo(String value) {
            addCriterion("resource_remark <=", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkLike(String value) {
            addCriterion("resource_remark like", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkNotLike(String value) {
            addCriterion("resource_remark not like", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkIn(List<String> values) {
            addCriterion("resource_remark in", values, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkNotIn(List<String> values) {
            addCriterion("resource_remark not in", values, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkBetween(String value1, String value2) {
            addCriterion("resource_remark between", value1, value2, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkNotBetween(String value1, String value2) {
            addCriterion("resource_remark not between", value1, value2, "resourceRemark");
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