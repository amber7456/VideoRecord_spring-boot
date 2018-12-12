package com.videorecord.bean.disk;

public class DiskReqBean {

    private String diskId;

    private String diskName;

    private String diskCapacity; //硬盘容量

    private String diskState;

    private String isFull;

    private String videoType;

    private String remark;

    private Integer page;

    private Integer limit;

    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public String getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    public String getDiskState() {
        return diskState;
    }

    public void setDiskState(String diskState) {
        this.diskState = diskState;
    }

    public String getIsFull() {
        return isFull;
    }

    public void setIsFull(String isFull) {
        this.isFull = isFull;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "DiskReqBean{" +
                "diskId='" + diskId + '\'' +
                ", diskName='" + diskName + '\'' +
                ", diskCapacity='" + diskCapacity + '\'' +
                ", diskState='" + diskState + '\'' +
                ", isFull='" + isFull + '\'' +
                ", videoType='" + videoType + '\'' +
                ", remark='" + remark + '\'' +
                ", page=" + page +
                ", limit=" + limit +
                '}';
    }
}
