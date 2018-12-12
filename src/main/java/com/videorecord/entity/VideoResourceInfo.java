package com.videorecord.entity;

import java.util.Date;

public class VideoResourceInfo {
    private Integer resourceId;

    private String videoId;

    private String resourceType;

    private String resourceFormat;

    private String resourceResolution;

    private String resourceSub;

    private String resourceSubType;

    private Date resourceRecordTime;

    private String resourceRecordAddress;

    private String resourceRemark;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getResourceFormat() {
        return resourceFormat;
    }

    public void setResourceFormat(String resourceFormat) {
        this.resourceFormat = resourceFormat == null ? null : resourceFormat.trim();
    }

    public String getResourceResolution() {
        return resourceResolution;
    }

    public void setResourceResolution(String resourceResolution) {
        this.resourceResolution = resourceResolution == null ? null : resourceResolution.trim();
    }

    public String getResourceSub() {
        return resourceSub;
    }

    public void setResourceSub(String resourceSub) {
        this.resourceSub = resourceSub == null ? null : resourceSub.trim();
    }

    public String getResourceSubType() {
        return resourceSubType;
    }

    public void setResourceSubType(String resourceSubType) {
        this.resourceSubType = resourceSubType == null ? null : resourceSubType.trim();
    }

    public Date getResourceRecordTime() {
        return resourceRecordTime;
    }

    public void setResourceRecordTime(Date resourceRecordTime) {
        this.resourceRecordTime = resourceRecordTime;
    }

    public String getResourceRecordAddress() {
        return resourceRecordAddress;
    }

    public void setResourceRecordAddress(String resourceRecordAddress) {
        this.resourceRecordAddress = resourceRecordAddress == null ? null : resourceRecordAddress.trim();
    }

    public String getResourceRemark() {
        return resourceRemark;
    }

    public void setResourceRemark(String resourceRemark) {
        this.resourceRemark = resourceRemark == null ? null : resourceRemark.trim();
    }

    @Override
    public String toString() {
        return "VideoResourceInfo{" +
                "resourceId=" + resourceId +
                ", videoId='" + videoId + '\'' +
                ", resourceType='" + resourceType + '\'' +
                ", resourceFormat='" + resourceFormat + '\'' +
                ", resourceResolution='" + resourceResolution + '\'' +
                ", resourceSub='" + resourceSub + '\'' +
                ", resourceSubType='" + resourceSubType + '\'' +
                ", resourceRecordTime=" + resourceRecordTime +
                ", resourceRecordAddress='" + resourceRecordAddress + '\'' +
                ", resourceRemark='" + resourceRemark + '\'' +
                '}';
    }
}