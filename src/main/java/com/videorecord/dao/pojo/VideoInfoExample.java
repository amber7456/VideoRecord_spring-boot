package com.videorecord.dao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoInfoExample() {
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

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeIsNull() {
            addCriterion("video_episode is null");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeIsNotNull() {
            addCriterion("video_episode is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeEqualTo(String value) {
            addCriterion("video_episode =", value, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeNotEqualTo(String value) {
            addCriterion("video_episode <>", value, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeGreaterThan(String value) {
            addCriterion("video_episode >", value, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeGreaterThanOrEqualTo(String value) {
            addCriterion("video_episode >=", value, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeLessThan(String value) {
            addCriterion("video_episode <", value, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeLessThanOrEqualTo(String value) {
            addCriterion("video_episode <=", value, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeLike(String value) {
            addCriterion("video_episode like", value, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeNotLike(String value) {
            addCriterion("video_episode not like", value, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeIn(List<String> values) {
            addCriterion("video_episode in", values, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeNotIn(List<String> values) {
            addCriterion("video_episode not in", values, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeBetween(String value1, String value2) {
            addCriterion("video_episode between", value1, value2, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoEpisodeNotBetween(String value1, String value2) {
            addCriterion("video_episode not between", value1, value2, "videoEpisode");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeIsNull() {
            addCriterion("video_broadcast_time is null");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeIsNotNull() {
            addCriterion("video_broadcast_time is not null");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeEqualTo(Date value) {
            addCriterion("video_broadcast_time =", value, "videoBroadcastTime");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeNotEqualTo(Date value) {
            addCriterion("video_broadcast_time <>", value, "videoBroadcastTime");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeGreaterThan(Date value) {
            addCriterion("video_broadcast_time >", value, "videoBroadcastTime");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("video_broadcast_time >=", value, "videoBroadcastTime");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeLessThan(Date value) {
            addCriterion("video_broadcast_time <", value, "videoBroadcastTime");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeLessThanOrEqualTo(Date value) {
            addCriterion("video_broadcast_time <=", value, "videoBroadcastTime");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeIn(List<Date> values) {
            addCriterion("video_broadcast_time in", values, "videoBroadcastTime");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeNotIn(List<Date> values) {
            addCriterion("video_broadcast_time not in", values, "videoBroadcastTime");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeBetween(Date value1, Date value2) {
            addCriterion("video_broadcast_time between", value1, value2, "videoBroadcastTime");
            return (Criteria) this;
        }

        public Criteria andVideoBroadcastTimeNotBetween(Date value1, Date value2) {
            addCriterion("video_broadcast_time not between", value1, value2, "videoBroadcastTime");
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

        public Criteria andVideoSeasonIsNull() {
            addCriterion("video_season is null");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonIsNotNull() {
            addCriterion("video_season is not null");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonEqualTo(String value) {
            addCriterion("video_season =", value, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonNotEqualTo(String value) {
            addCriterion("video_season <>", value, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonGreaterThan(String value) {
            addCriterion("video_season >", value, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("video_season >=", value, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonLessThan(String value) {
            addCriterion("video_season <", value, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonLessThanOrEqualTo(String value) {
            addCriterion("video_season <=", value, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonLike(String value) {
            addCriterion("video_season like", value, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonNotLike(String value) {
            addCriterion("video_season not like", value, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonIn(List<String> values) {
            addCriterion("video_season in", values, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonNotIn(List<String> values) {
            addCriterion("video_season not in", values, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonBetween(String value1, String value2) {
            addCriterion("video_season between", value1, value2, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoSeasonNotBetween(String value1, String value2) {
            addCriterion("video_season not between", value1, value2, "videoSeason");
            return (Criteria) this;
        }

        public Criteria andVideoCountryIsNull() {
            addCriterion("video_country is null");
            return (Criteria) this;
        }

        public Criteria andVideoCountryIsNotNull() {
            addCriterion("video_country is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCountryEqualTo(String value) {
            addCriterion("video_country =", value, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryNotEqualTo(String value) {
            addCriterion("video_country <>", value, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryGreaterThan(String value) {
            addCriterion("video_country >", value, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryGreaterThanOrEqualTo(String value) {
            addCriterion("video_country >=", value, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryLessThan(String value) {
            addCriterion("video_country <", value, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryLessThanOrEqualTo(String value) {
            addCriterion("video_country <=", value, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryLike(String value) {
            addCriterion("video_country like", value, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryNotLike(String value) {
            addCriterion("video_country not like", value, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryIn(List<String> values) {
            addCriterion("video_country in", values, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryNotIn(List<String> values) {
            addCriterion("video_country not in", values, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryBetween(String value1, String value2) {
            addCriterion("video_country between", value1, value2, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoCountryNotBetween(String value1, String value2) {
            addCriterion("video_country not between", value1, value2, "videoCountry");
            return (Criteria) this;
        }

        public Criteria andVideoSourceIsNull() {
            addCriterion("video_source is null");
            return (Criteria) this;
        }

        public Criteria andVideoSourceIsNotNull() {
            addCriterion("video_source is not null");
            return (Criteria) this;
        }

        public Criteria andVideoSourceEqualTo(String value) {
            addCriterion("video_source =", value, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceNotEqualTo(String value) {
            addCriterion("video_source <>", value, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceGreaterThan(String value) {
            addCriterion("video_source >", value, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceGreaterThanOrEqualTo(String value) {
            addCriterion("video_source >=", value, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceLessThan(String value) {
            addCriterion("video_source <", value, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceLessThanOrEqualTo(String value) {
            addCriterion("video_source <=", value, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceLike(String value) {
            addCriterion("video_source like", value, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceNotLike(String value) {
            addCriterion("video_source not like", value, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceIn(List<String> values) {
            addCriterion("video_source in", values, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceNotIn(List<String> values) {
            addCriterion("video_source not in", values, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceBetween(String value1, String value2) {
            addCriterion("video_source between", value1, value2, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoSourceNotBetween(String value1, String value2) {
            addCriterion("video_source not between", value1, value2, "videoSource");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkIsNull() {
            addCriterion("video_remark is null");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkIsNotNull() {
            addCriterion("video_remark is not null");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkEqualTo(String value) {
            addCriterion("video_remark =", value, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkNotEqualTo(String value) {
            addCriterion("video_remark <>", value, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkGreaterThan(String value) {
            addCriterion("video_remark >", value, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("video_remark >=", value, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkLessThan(String value) {
            addCriterion("video_remark <", value, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkLessThanOrEqualTo(String value) {
            addCriterion("video_remark <=", value, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkLike(String value) {
            addCriterion("video_remark like", value, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkNotLike(String value) {
            addCriterion("video_remark not like", value, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkIn(List<String> values) {
            addCriterion("video_remark in", values, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkNotIn(List<String> values) {
            addCriterion("video_remark not in", values, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkBetween(String value1, String value2) {
            addCriterion("video_remark between", value1, value2, "videoRemark");
            return (Criteria) this;
        }

        public Criteria andVideoRemarkNotBetween(String value1, String value2) {
            addCriterion("video_remark not between", value1, value2, "videoRemark");
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

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceIsNull() {
            addCriterion("have_bd_resource is null");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceIsNotNull() {
            addCriterion("have_bd_resource is not null");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceEqualTo(String value) {
            addCriterion("have_bd_resource =", value, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceNotEqualTo(String value) {
            addCriterion("have_bd_resource <>", value, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceGreaterThan(String value) {
            addCriterion("have_bd_resource >", value, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceGreaterThanOrEqualTo(String value) {
            addCriterion("have_bd_resource >=", value, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceLessThan(String value) {
            addCriterion("have_bd_resource <", value, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceLessThanOrEqualTo(String value) {
            addCriterion("have_bd_resource <=", value, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceLike(String value) {
            addCriterion("have_bd_resource like", value, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceNotLike(String value) {
            addCriterion("have_bd_resource not like", value, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceIn(List<String> values) {
            addCriterion("have_bd_resource in", values, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceNotIn(List<String> values) {
            addCriterion("have_bd_resource not in", values, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceBetween(String value1, String value2) {
            addCriterion("have_bd_resource between", value1, value2, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHaveBdResourceNotBetween(String value1, String value2) {
            addCriterion("have_bd_resource not between", value1, value2, "haveBdResource");
            return (Criteria) this;
        }

        public Criteria andHavePosterIsNull() {
            addCriterion("have_poster is null");
            return (Criteria) this;
        }

        public Criteria andHavePosterIsNotNull() {
            addCriterion("have_poster is not null");
            return (Criteria) this;
        }

        public Criteria andHavePosterEqualTo(String value) {
            addCriterion("have_poster =", value, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterNotEqualTo(String value) {
            addCriterion("have_poster <>", value, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterGreaterThan(String value) {
            addCriterion("have_poster >", value, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterGreaterThanOrEqualTo(String value) {
            addCriterion("have_poster >=", value, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterLessThan(String value) {
            addCriterion("have_poster <", value, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterLessThanOrEqualTo(String value) {
            addCriterion("have_poster <=", value, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterLike(String value) {
            addCriterion("have_poster like", value, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterNotLike(String value) {
            addCriterion("have_poster not like", value, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterIn(List<String> values) {
            addCriterion("have_poster in", values, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterNotIn(List<String> values) {
            addCriterion("have_poster not in", values, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterBetween(String value1, String value2) {
            addCriterion("have_poster between", value1, value2, "havePoster");
            return (Criteria) this;
        }

        public Criteria andHavePosterNotBetween(String value1, String value2) {
            addCriterion("have_poster not between", value1, value2, "havePoster");
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