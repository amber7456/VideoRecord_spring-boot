package com.videorecord.controller;

import com.videorecord.bean.ResponseBean;
import com.videorecord.bean.video.req.VideoAddReqBean;
import com.videorecord.bean.video.req.VideoListReqBean;
import com.videorecord.bean.video.req.VideoSearchReqBean;
import com.videorecord.bean.video.resp.VideoListBean;
import com.videorecord.entity.DiskInfo;
import com.videorecord.entity.VideoInfo;
import com.videorecord.service.DiskService;
import com.videorecord.service.VideoService;
import com.videorecord.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class VideoController {

    @Autowired
    private VideoService videoService;

    @Autowired
    private DiskService diskService;

    /**
     * 资源列表
     *
     * @return
     */
    @GetMapping(value = "/videoList")
    public String videoList(VideoListReqBean req, Model model) {
        // 为查询参数赋初值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        if (CommonUtils.isEmpty(req.getYear())) {
            req.setYear(sdf.format(date));
        }
        if (CommonUtils.isEmpty(req.getVideoType())) {
            req.setVideoType("动画");
        }
        //查询资源返回前端
        VideoListBean videoList = videoService.getVideoList(req);

        model.addAttribute("nowYear", sdf.format(date));
        model.addAttribute("videoList", videoList);
        model.addAttribute("req", req);
        return "video/videoList";
    }

    /**
     * 资源详情
     *
     * @param type
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/video/{type}/{id}")
    public String videoDetail(@PathVariable("type") String type, @PathVariable("id") String id, Model model) {
        String resultUrl = "";
        if (type.equals("detail")) {
            resultUrl = "video/videoDetail";
        }
        if (type.equals("edit")) {
            resultUrl = "video/videoEdit";
        }
        // 查询硬盘列表，填充页面查询条件
        List<DiskInfo> diskList = diskService.getDiskListByVideoType("ALL");
        VideoInfo videoInfo = videoService.getVideoDetail(id);
        model.addAttribute("video", videoInfo);
        model.addAttribute("diskList", diskList);
        return resultUrl;
    }

    /**
     * 资源检索
     *
     * @return
     */
    @GetMapping(value = "/videos")
    public String searchVideo(VideoSearchReqBean req, Model model) {
        // 查询硬盘列表，填充页面查询条件
        List<DiskInfo> diskList = diskService.getDiskListByVideoType("ALL");
        // 为查询参数赋初值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        if (CommonUtils.isEmpty(req.getYearRange())) {
            Integer nowYear = Integer.valueOf(sdf.format(date));
            req.setVideoType("动画");
            req.setYearRange((nowYear - 5) + " - " + nowYear);
        }
        VideoListBean videoList = videoService.searchVideo(req);
        model.addAttribute("videoList", videoList);
        model.addAttribute("diskList", diskList);
        model.addAttribute("req", req);
        return "video/videoSearch";
    }


    /**
     * 跳转到添加页面
     *
     * @param req
     * @param model
     * @return
     */
    @GetMapping(value = "/video")
    public String toVideoAdd(VideoAddReqBean req, Model model) {
        // 查询硬盘列表，填充页面
        if (CommonUtils.isEmpty(req.getVideoType())) {
            req.setVideoType("动画");
        }
        List<DiskInfo> diskList = diskService.getDiskListByVideoType("ALL");
        model.addAttribute("diskList", diskList);
        model.addAttribute("req", req);
        return "video/videoAdd";
    }

    /**
     * 添加资源
     *
     * @param req
     * @return
     */
    @PostMapping(value = "/video")
    @ResponseBody //
    public ResponseBean<Integer> videoAdd(VideoAddReqBean req) throws IOException {
        ResponseBean<Integer> resp = new ResponseBean<Integer>();
        Integer r = videoService.addVideo(req);
        resp.setData(r);
        return resp;
    }

    @PutMapping(value = "/video")
    @ResponseBody //
    public ResponseBean<Integer> videoEdit(VideoAddReqBean req, MultipartFile videoPoster) throws IOException {
        ResponseBean<Integer> resp = new ResponseBean<Integer>();
        /**
         * PUT 请求方式获取不到在包装类中的文件类型参数，
         * 只能提出来，再重新set进去
         */
        req.setVideoPoster(videoPoster);
        Integer r = videoService.editVideo(req);
        resp.setData(r);
        return resp;
    }

    @DeleteMapping(value = "/video/{videoId}")
    @ResponseBody
    public ResponseBean<Integer> videoDel(@PathVariable String videoId) {
        ResponseBean<Integer> resp = new ResponseBean<Integer>();
        Integer r = videoService.delVideo(videoId);
        resp.setData(r);
        return resp;
    }


    /**
     * 图表分析
     *
     * @return
     */
    @GetMapping(value = "/videoCharts")
    public String toVideoCharts(VideoSearchReqBean req, Model model) {
        // 为查询参数赋初值
        if (CommonUtils.isEmpty(req.getVideoType())) {
            req.setVideoType("动画");
        }
        model.addAttribute("req", req);
        return "video/videoCharts";
    }


}
