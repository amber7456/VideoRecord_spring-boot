package com.videorecord.bean.video.resp;

import java.util.List;

public class VideoListBean {

    private List<YearDataBean> yearData;

    public List<YearDataBean> getYearData() {
        return yearData;
    }

    public void setYearData(List<YearDataBean> yearData) {
        this.yearData = yearData;
    }

    @Override
    public String toString() {
        return "VideoListBean{" +
                "yearData=" + yearData +
                '}';
    }
}
