package com.videorecord.controller;

import javax.servlet.http.HttpSession;

import com.videorecord.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.videorecord.bean.ResponseBean;
import com.videorecord.bean.chart.ChartBean;
import com.videorecord.bean.video.req.VideoSearchReqBean;

@RestController
public class ChartController {

	@Autowired
	private ChartService chartService;

	@GetMapping(value = "/chartsData" )
	public ResponseBean<ChartBean> getEchartsData(VideoSearchReqBean req) {
		return chartService.getEchartsData(req);
	}

}
