package com.videorecord.service;

import com.videorecord.dao.PosterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PosterService {

    @Autowired
    private PosterDao posterDao;

    public byte[] getPosterById(String video_id) {
        return posterDao.getPosterById(video_id);
    }

}
