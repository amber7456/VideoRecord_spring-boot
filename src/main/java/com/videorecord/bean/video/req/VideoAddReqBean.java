package com.videorecord.bean.video.req;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.videorecord.entity.VideoResourceInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class VideoAddReqBean {

    private String videoId;

    private String videoName;

    private String videoEpisode;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date videoBroadcastTime;

    private String videoType;

    private String videoSeason;

    private String animationSeason;

    private String dramaSeason;

    private String videoCountry;

    private String videoSource;

    private String videoRemark;

    private Date createTime;

    private Date lastUpdateTime;

    private String haveBdResource;

    private String havePoster;

    private String videoDetailInfo;

    private List<VideoResourceInfo> videoResourceInfo;

    private String[] resourceType;

    private String[] resourceFormat;

    private String[] resourceResolution;

    private String[] resourceSub;

    private String[] resourceSubType;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date[] resourceRecordTime;

    private String[] resourceRecordAddress;

    private String[] resourceRemark;

    public MultipartFile videoPoster;

    private String posterUpdateFlag;

    public String[] getResourceType() {
        return resourceType;
    }

    public void setResourceType(String[] resourceType) {
        this.resourceType = resourceType;
    }

    public String[] getResourceFormat() {
        return resourceFormat;
    }

    public void setResourceFormat(String[] resourceFormat) {
        this.resourceFormat = resourceFormat;
    }

    public String[] getResourceResolution() {
        return resourceResolution;
    }

    public void setResourceResolution(String[] resourceResolution) {
        this.resourceResolution = resourceResolution;
    }

    public String[] getResourceSub() {
        return resourceSub;
    }

    public void setResourceSub(String[] resourceSub) {
        this.resourceSub = resourceSub;
    }

    public String[] getResourceSubType() {
        return resourceSubType;
    }

    public void setResourceSubType(String[] resourceSubType) {
        this.resourceSubType = resourceSubType;
    }

    public Date[] getResourceRecordTime() {
        return resourceRecordTime;
    }

    public void setResourceRecordTime(Date[] resourceRecordTime) {
        this.resourceRecordTime = resourceRecordTime;
    }

    public String[] getResourceRecordAddress() {
        return resourceRecordAddress;
    }

    public void setResourceRecordAddress(String[] resourceRecordAddress) {
        this.resourceRecordAddress = resourceRecordAddress;
    }

    public String[] getResourceRemark() {
        return resourceRemark;
    }

    public void setResourceRemark(String[] resourceRemark) {
        this.resourceRemark = resourceRemark;
    }

    public MultipartFile getVideoPoster() {
        return videoPoster;
    }

    public void setVideoPoster(MultipartFile videoPoster) {
        this.videoPoster = videoPoster;
    }

    public String getPosterUpdateFlag() {
        return posterUpdateFlag;
    }

    public void setPosterUpdateFlag(String posterUpdateFlag) {
        this.posterUpdateFlag = posterUpdateFlag;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoEpisode() {
        return videoEpisode;
    }

    public void setVideoEpisode(String videoEpisode) {
        this.videoEpisode = videoEpisode;
    }

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
        this.videoType = videoType;
    }

    public String getVideoSeason() {
        return videoSeason;
    }

    public void setVideoSeason(String videoSeason) {
        this.videoSeason = videoSeason;
    }

    public String getVideoCountry() {
        return videoCountry;
    }

    public void setVideoCountry(String videoCountry) {
        this.videoCountry = videoCountry;
    }

    public String getVideoSource() {
        return videoSource;
    }

    public void setVideoSource(String videoSource) {
        this.videoSource = videoSource;
    }

    public String getVideoRemark() {
        return videoRemark;
    }

    public void setVideoRemark(String videoRemark) {
        this.videoRemark = videoRemark;
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
        this.haveBdResource = haveBdResource;
    }

    public String getHavePoster() {
        return havePoster;
    }

    public void setHavePoster(String havePoster) {
        this.havePoster = havePoster;
    }

    public String getVideoDetailInfo() {
        return videoDetailInfo;
    }

    public void setVideoDetailInfo(String videoDetailInfo) {
        this.videoDetailInfo = videoDetailInfo;
    }

    public List<VideoResourceInfo> getVideoResourceInfo() {
        return videoResourceInfo;
    }

    public void setVideoResourceInfo(List<VideoResourceInfo> videoResourceInfo) {
        this.videoResourceInfo = videoResourceInfo;
    }

    public String getAnimationSeason() {
        return animationSeason;
    }

    public void setAnimationSeason(String animationSeason) {
        this.animationSeason = animationSeason;
    }

    public String getDramaSeason() {
        return dramaSeason;
    }

    public void setDramaSeason(String dramaSeason) {
        this.dramaSeason = dramaSeason;
    }

    @Override
    public String toString() {
        return "VideoAddReqBean{" +
                "videoId='" + videoId + '\'' +
                ", videoName='" + videoName + '\'' +
                ", videoEpisode='" + videoEpisode + '\'' +
                ", videoBroadcastTime=" + videoBroadcastTime +
                ", videoType='" + videoType + '\'' +
                ", videoSeason='" + videoSeason + '\'' +
                ", animationSeason='" + animationSeason + '\'' +
                ", dramaSeason='" + dramaSeason + '\'' +
                ", videoCountry='" + videoCountry + '\'' +
                ", videoSource='" + videoSource + '\'' +
                ", videoRemark='" + videoRemark + '\'' +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                ", haveBdResource='" + haveBdResource + '\'' +
                ", havePoster='" + havePoster + '\'' +
                ", videoDetailInfo='" + videoDetailInfo + '\'' +
                ", videoResourceInfo=" + videoResourceInfo +
                ", resourceType=" + Arrays.toString(resourceType) +
                ", resourceFormat=" + Arrays.toString(resourceFormat) +
                ", resourceResolution=" + Arrays.toString(resourceResolution) +
                ", resourceSub=" + Arrays.toString(resourceSub) +
                ", resourceSubType=" + Arrays.toString(resourceSubType) +
                ", resourceRecordTime=" + Arrays.toString(resourceRecordTime) +
                ", resourceRecordAddress=" + Arrays.toString(resourceRecordAddress) +
                ", resourceRemark=" + Arrays.toString(resourceRemark) +
                ", videoPoster=" + videoPoster +
                ", posterUpdateFlag='" + posterUpdateFlag + '\'' +
                '}';
    }
}
