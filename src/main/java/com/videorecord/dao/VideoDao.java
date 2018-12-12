package com.videorecord.dao;

import com.videorecord.bean.video.req.VideoListReqBean;
import com.videorecord.bean.video.req.VideoSearchReqBean;
import com.videorecord.dao.mapper.VideoInfoMapper;
import com.videorecord.dao.pojo.VideoInfoExample;
import com.videorecord.entity.VideoInfo;
import com.videorecord.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VideoDao {

    @Autowired
    private VideoInfoMapper videoInfoMapper;

    /**
     * 视频资源列表
     *
     * @param req
     * @return
     */
    public List<VideoInfo> getVideoList(VideoListReqBean req) {
        VideoInfoExample example = new VideoInfoExample();
        VideoInfoExample.Criteria criteria = example.createCriteria();
        if (CommonUtils.isNotEmpty(req.getVideoName())) {
            criteria.andVideoNameLike("%" + req.getVideoName() + "%");
        }
        if (CommonUtils.isNotEmpty(req.getYear())) {
            criteria.andVideoBroadcastTimeBetween(
                    CommonUtils.stringToDate(req.getYear() + "-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss"),
                    CommonUtils.stringToDate(req.getYear() + "-12-31 23:59:59", "yyyy-MM-dd HH:mm:ss"));
        }
        if (CommonUtils.isNotEmpty(req.getVideoType())) {
            criteria.andVideoTypeLike(req.getVideoType() + "%");
        }
        example.setOrderByClause("video_broadcast_time");
        List<VideoInfo> list = videoInfoMapper.selectByExample(example);
        return list;
    }

    public List<VideoInfo> searchVideo(VideoSearchReqBean req) {
        List<VideoInfo> list = new ArrayList<VideoInfo>();
        VideoInfoExample example = new VideoInfoExample();
        VideoInfoExample.Criteria criteria = example.createCriteria();
        criteria.andVideoTypeEqualTo(req.getVideoType());
        // 视频名称搜索的优先级最高，如果有视频名称测不考虑其他搜索条件
        if (CommonUtils.isNotEmpty(req.getVideoName())) {
            criteria.andVideoNameLike("%" + req.getVideoName().trim() + "%");
            list = videoInfoMapper.selectByExample(example);
        } else {
            // 时间范围 是共有查询条件
            String begin = req.getYearRange().split("-")[0].trim();
            String end = req.getYearRange().split("-")[1].trim();
            req.setYearBegin(begin);
            req.setYearEnd(end);

            if (CommonUtils.isNotEmpty(req.getSerializeTime())) {
                if (req.getSerializeTime().equals("1")) {
                    req.setEpisodeBegin("1");
                    req.setEpisodeEnd("19");
                } else if (req.getSerializeTime().equals("2")) {
                    req.setEpisodeBegin("20");
                    req.setEpisodeEnd("30");
                } else if (req.getSerializeTime().equals("3")) {
                    req.setEpisodeBegin("40");
                    req.setEpisodeEnd("70");
                } else if (req.getSerializeTime().equals("4")) {
                    req.setEpisodeBegin("71");
                    req.setEpisodeEnd("99999");
                }
            }

            list = videoInfoMapper.selectVideoByComplexCondition(req);
        }
        return list;
    }


    private boolean isNotEmptyAndNotAll(String str) {
        if (CommonUtils.isNotEmpty(str) && !str.equals("ALL")) {
            return true;
        } else {
            return false;
        }
    }

    public VideoInfo getVideoDetail(String video_id) {
        return videoInfoMapper.selectVideoWithResourceByVideoId(video_id);
    }

    public int addVideo(VideoInfo videoInfo) {
        return videoInfoMapper.insertSelective(videoInfo);
    }

    public int editVideo(VideoInfo videoInfo) {
        return videoInfoMapper.updateByPrimaryKeyWithBLOBs(videoInfo);
    }

    public int delVideo(String video_id) {
        return videoInfoMapper.deleteByPrimaryKey(video_id);
    }


    public List<VideoInfo> getChatrData(VideoSearchReqBean req) {
        String begin = req.getYearRange().split("-")[0].trim();
        String end = req.getYearRange().split("-")[1].trim();
        req.setYearBegin(begin);
        req.setYearEnd(end);
        return videoInfoMapper.selectChatrData(req);
    }

}

