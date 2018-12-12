package com.videorecord.dao;

import com.videorecord.dao.mapper.VideoPosterMapper;
import com.videorecord.entity.VideoPoster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PosterDao {
    @Autowired
    private VideoPosterMapper videoPosterMapper;

    public byte[] getPosterById(String video_id) {
        VideoPoster videoPoster = videoPosterMapper.selectByPrimaryKey(video_id);
        byte[] video_poster = new byte[] {};
        if (videoPoster != null && videoPoster.getVideoPoster() != null) {
            video_poster = videoPoster.getVideoPoster();
        }
        return video_poster;
    }

    public int addPoster(VideoPoster videoPoster) {
        return videoPosterMapper.insertSelective(videoPoster);
    }

    public int delPoster(String video_id) {
        return videoPosterMapper.deleteByPrimaryKey(video_id);
    }
}
