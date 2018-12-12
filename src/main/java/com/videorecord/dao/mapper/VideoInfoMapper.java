package com.videorecord.dao.mapper;

import com.videorecord.bean.video.req.VideoSearchReqBean;
import com.videorecord.entity.VideoInfo;
import com.videorecord.dao.pojo.VideoInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoInfoMapper {
    int countByExample(VideoInfoExample example);

    int deleteByExample(VideoInfoExample example);

    int deleteByPrimaryKey(String videoId);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    List<VideoInfo> selectByExampleWithBLOBs(VideoInfoExample example);

    List<VideoInfo> selectByExample(VideoInfoExample example);

    VideoInfo selectByPrimaryKey(String videoId);

    int updateByExampleSelective(@Param("record") VideoInfo record, @Param("example") VideoInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") VideoInfo record, @Param("example") VideoInfoExample example);

    int updateByExample(@Param("record") VideoInfo record, @Param("example") VideoInfoExample example);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKeyWithBLOBs(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);

    List<VideoInfo> selectVideoByComplexCondition(VideoSearchReqBean req);

    VideoInfo selectVideoWithResourceByVideoId(String videoId);

    List<VideoInfo> selectChatrData(VideoSearchReqBean req);
}