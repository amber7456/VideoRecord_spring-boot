package com.videorecord.controller;

import com.videorecord.service.PosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

@Controller
public class PosterController {
    @Autowired
    private PosterService posterService;

    @GetMapping(value = "/getPoster/{video_id}")
    public void getPoster(@PathVariable String video_id, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        response.setContentType("image/gif");
        try {
            OutputStream out = response.getOutputStream();
            byte[] b = posterService.getPosterById(video_id);
            out.write(b);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
