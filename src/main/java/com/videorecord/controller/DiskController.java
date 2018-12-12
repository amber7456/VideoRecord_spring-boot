package com.videorecord.controller;

import com.videorecord.bean.ResponseBean;
import com.videorecord.bean.disk.DiskReqBean;
import com.videorecord.entity.DiskInfo;
import com.videorecord.service.DiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DiskController {

    @Autowired
    public DiskService diskService;

    @GetMapping(value = "/diskList")
    public String toDiskListPage(DiskReqBean req, Model model) {
        return "disk/diskList";
    }

    @GetMapping(value = "/disks")
    @ResponseBody
    public ResponseBean<List<DiskInfo>> getDiskList(DiskReqBean req) {
        return diskService.getDiskList(req);
    }

    @GetMapping("/disk/{diskId}")
    public String videoDetail(@PathVariable("diskId") String diskId, Model model) {
        DiskInfo diskInfo = diskService.getDiskListByDiskId(diskId);
        model.addAttribute("disk", diskInfo);
        return "disk/diskEdit";
    }

    @GetMapping(value = "/disk")
    public String toDiskAddPage() {
        return "disk/diskAdd";
    }

    @PostMapping(value = "/disk")
    @ResponseBody
    public ResponseBean<Integer> diskAdd(DiskInfo req) {
        return diskService.diskAdd(req);
    }

    @PutMapping(value = "/disk")
    @ResponseBody
    public ResponseBean<Integer> diskEdit(DiskInfo req) {
        return diskService.diskEdit(req);
    }

    @DeleteMapping("/disk/{diskId}")
    @ResponseBody
    public ResponseBean<Integer> diskDel(@PathVariable("diskId") String diskId) {
        return diskService.diskDel(diskId);
    }


}
