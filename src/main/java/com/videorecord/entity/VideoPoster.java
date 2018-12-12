package com.videorecord.entity;

import java.util.Date;

public class VideoPoster {
    private String videoId;

    private Date uploadTime;

    private byte[] videoPoster;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public byte[] getVideoPoster() {
        return videoPoster;
    }

    public void setVideoPoster(byte[] videoPoster) {
        this.videoPoster = videoPoster;
    }
}