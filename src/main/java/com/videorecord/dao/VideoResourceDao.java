package com.videorecord.dao;

import java.util.List;

import com.videorecord.dao.mapper.VideoResourceInfoMapper;
import com.videorecord.dao.pojo.VideoResourceInfoExample;
import com.videorecord.entity.VideoResourceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VideoResourceDao {

    @Autowired
    private VideoResourceInfoMapper videoResourceInfoMapper;

    public List<com.videorecord.entity.VideoResourceInfo> getVideoResourceInfo(String videoId) {
        VideoResourceInfoExample example = new VideoResourceInfoExample();
        VideoResourceInfoExample.Criteria criteria = example.createCriteria();
        criteria.andVideoIdEqualTo(videoId);
        List<VideoResourceInfo> videoResourceInfo = videoResourceInfoMapper.selectByExample(example);
        return videoResourceInfo;
    }

    public int addVideoResource(List<VideoResourceInfo> videoResourceInfo) {
        int result = 0;
        for (int i = 0; i < videoResourceInfo.size(); i++) {
            if (videoResourceInfo.get(i).getResourceType() != null) {
                result = videoResourceInfoMapper.insertSelective(videoResourceInfo.get(i));
            }
        }
        return result;
    }

    public int delVideoResource(String videoId) {
        VideoResourceInfoExample example = new VideoResourceInfoExample();
        VideoResourceInfoExample.Criteria criteria = example.createCriteria();
        criteria.andVideoIdEqualTo(videoId);
        return videoResourceInfoMapper.deleteByExample(example);
    }

}
