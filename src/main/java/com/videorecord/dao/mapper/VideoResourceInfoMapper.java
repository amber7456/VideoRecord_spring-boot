package com.videorecord.dao.mapper;

import com.videorecord.entity.VideoResourceInfo;
import com.videorecord.dao.pojo.VideoResourceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoResourceInfoMapper {
    int countByExample(VideoResourceInfoExample example);

    int deleteByExample(VideoResourceInfoExample example);

    int deleteByPrimaryKey(Integer resourceId);

    int insert(VideoResourceInfo record);

    int insertSelective(VideoResourceInfo record);

    List<VideoResourceInfo> selectByExample(VideoResourceInfoExample example);

    VideoResourceInfo selectByPrimaryKey(Integer resourceId);

    int updateByExampleSelective(@Param("record") VideoResourceInfo record, @Param("example") VideoResourceInfoExample example);

    int updateByExample(@Param("record") VideoResourceInfo record, @Param("example") VideoResourceInfoExample example);

    int updateByPrimaryKeySelective(VideoResourceInfo record);

    int updateByPrimaryKey(VideoResourceInfo record);
}