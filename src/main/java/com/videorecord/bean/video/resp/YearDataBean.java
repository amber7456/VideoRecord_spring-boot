package com.videorecord.bean.video.resp;

import java.util.List;

public class YearDataBean {

	private String year;

	private String countMsg;

	private List<SeasonDataBean> season;

	@Override
	public String toString() {
		return "YearDataData{" +
				"year='" + year + '\'' +
				", countMsg='" + countMsg + '\'' +
				", season=" + season +
				'}';
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCountMsg() {
		return countMsg;
	}

	public void setCountMsg(String countMsg) {
		this.countMsg = countMsg;
	}

	public List<SeasonDataBean> getSeason() {
		return season;
	}

	public void setSeason(List<SeasonDataBean> season) {
		this.season = season;
	}
}
