package com.videorecord.bean.video.resp;

import com.videorecord.entity.VideoInfo;

import java.util.List;


public class SeasonDataBean {

	private String type;

	private List<VideoInfo> videoInfo;

	@Override
	public String toString() {
		return "SeasonDataBean{" +
				"type='" + type + '\'' +
				", videoInfo=" + videoInfo +
				'}';
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<VideoInfo> getVideoInfo() {
		return videoInfo;
	}

	public void setVideoInfo(List<VideoInfo> videoInfo) {
		this.videoInfo = videoInfo;
	}
}
