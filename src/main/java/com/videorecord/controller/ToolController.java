package com.videorecord.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToolController {

    /**
     * 批量添加页面
     *
     * @return
     */
    @GetMapping(value = "/videoBatchAdd")
    public String toVideoBatchAdd() {
        return "video/videoBatchAdd";
    }
}
