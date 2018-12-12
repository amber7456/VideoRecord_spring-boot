package com.videorecord.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class VideoInfo {
    private String videoId;

    private String videoName;

    private String videoEpisode;

    private Date videoBroadcastTime;

    private String videoType;

    private String videoSeason;

    private String videoCountry;

    private String videoSource;

    private String videoRemark;

    private Date createTime;

    private Date lastUpdateTime;

    private String haveBdResource;

    private String havePoster;

    private String videoDetailInfo;

    private List<VideoResourceInfo> videoResourceInfo;

    //
    private String year;

    private String count;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoEpisode() {
        return videoEpisode;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setVideoEpisode(String videoEpisode) {
        this.videoEpisode = videoEpisode == null ? null : videoEpisode.trim();
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getVideoBroadcastTime() {
        return videoBroadcastTime;
    }

    public void setVideoBroadcastTime(Date videoBroadcastTime) {
        this.videoBroadcastTime = videoBroadcastTime;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType == null ? null : videoType.trim();
    }

    public String getVideoSeason() {
        return videoSeason;
    }

    public void setVideoSeason(String videoSeason) {
        this.videoSeason = videoSeason == null ? null : videoSeason.trim();
    }

    public String getVideoCountry() {
        return videoCountry;
    }

    public void setVideoCountry(String videoCountry) {
        this.videoCountry = videoCountry == null ? null : videoCountry.trim();
    }

    public String getVideoSource() {
        return videoSource;
    }

    public void setVideoSource(String videoSource) {
        this.videoSource = videoSource == null ? null : videoSource.trim();
    }

    public String getVideoRemark() {
        return videoRemark;
    }

    public void setVideoRemark(String videoRemark) {
        this.videoRemark = videoRemark == null ? null : videoRemark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getHaveBdResource() {
        return haveBdResource;
    }

    public void setHaveBdResource(String haveBdResource) {
        this.haveBdResource = haveBdResource == null ? null : haveBdResource.trim();
    }

    public String getHavePoster() {
        return havePoster;
    }

    public void setHavePoster(String havePoster) {
        this.havePoster = havePoster == null ? null : havePoster.trim();
    }

    public String getVideoDetailInfo() {
        return videoDetailInfo;
    }

    public void setVideoDetailInfo(String videoDetailInfo) {
        this.videoDetailInfo = videoDetailInfo == null ? null : videoDetailInfo.trim();
    }

    public List<VideoResourceInfo> getVideoResourceInfo() {
        return videoResourceInfo;
    }

    public void setVideoResourceInfo(List<VideoResourceInfo> videoResourceInfo) {
        this.videoResourceInfo = videoResourceInfo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "VideoInfo{" +
                "videoId='" + videoId + '\'' +
                ", videoName='" + videoName + '\'' +
                ", videoEpisode='" + videoEpisode + '\'' +
                ", videoBroadcastTime=" + videoBroadcastTime +
                ", videoType='" + videoType + '\'' +
                ", videoSeason='" + videoSeason + '\'' +
                ", videoCountry='" + videoCountry + '\'' +
                ", videoSource='" + videoSource + '\'' +
                ", videoRemark='" + videoRemark + '\'' +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                ", haveBdResource='" + haveBdResource + '\'' +
                ", havePoster='" + havePoster + '\'' +
                ", videoDetailInfo='" + videoDetailInfo + '\'' +
                ", videoResourceInfo=" + videoResourceInfo +
                ", year='" + year + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}