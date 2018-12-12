package com.videorecord.entity;

import java.util.Date;

public class DiskInfo {
    private String diskId;

    private String diskName;

    private String diskCapacity;

    private String diskState;

    private String isFull;

    private Date createTime;

    private String videoType;

    private String remark;

    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId == null ? null : diskId.trim();
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName == null ? null : diskName.trim();
    }

    public String getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity == null ? null : diskCapacity.trim();
    }

    public String getDiskState() {
        return diskState;
    }

    public void setDiskState(String diskState) {
        this.diskState = diskState == null ? null : diskState.trim();
    }

    public String getIsFull() {
        return isFull;
    }

    public void setIsFull(String isFull) {
        this.isFull = isFull == null ? null : isFull.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType == null ? null : videoType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "DiskInfo{" +
                "diskId='" + diskId + '\'' +
                ", diskName='" + diskName + '\'' +
                ", diskCapacity='" + diskCapacity + '\'' +
                ", diskState='" + diskState + '\'' +
                ", isFull='" + isFull + '\'' +
                ", createTime=" + createTime +
                ", videoType='" + videoType + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}