package com.videorecord.service;

import com.github.pagehelper.PageInfo;
import com.videorecord.bean.ResponseBean;
import com.videorecord.bean.disk.DiskReqBean;
import com.videorecord.dao.DiskDao;
import com.videorecord.entity.DiskInfo;
import com.videorecord.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DiskService {

    @Autowired
    private DiskDao diskDao;

    public ResponseBean<List<DiskInfo>> getDiskList(DiskReqBean diskReqBean) {
        ResponseBean<List<DiskInfo>> resp = new ResponseBean<List<DiskInfo>>();
        PageInfo<DiskInfo> page = diskDao.getDiskList(diskReqBean);
        resp.setData(page.getList());
        resp.setCount((int) page.getTotal());
        return resp;
    }

    public DiskInfo getDiskListByDiskId(String diskId) {
        DiskInfo diskInfo = diskDao.getDiskListByDiskId(diskId);
        return diskInfo;
    }


    public ResponseBean<Integer> diskEdit(DiskInfo req) {
        ResponseBean<Integer> resp = new ResponseBean<Integer>();
        resp.setData(diskDao.diskEdit(req));
        return resp;
    }

    public ResponseBean<Integer> diskDel(String diskId) {
        ResponseBean<Integer> resp = new ResponseBean<Integer>();
        resp.setData(diskDao.diskDel(diskId));
        return resp;
    }

    public ResponseBean<Integer> diskAdd(DiskInfo req) {
        ResponseBean<Integer> resp = new ResponseBean<Integer>();
        req.setDiskId(CommonUtils.getID());
        req.setCreateTime(new Date());
        req.setIsFull("未满");
        req.setDiskState("现役");
        resp.setData(diskDao.diskAdd(req));
        return resp;
    }

    public List<DiskInfo> getDiskListByVideoType(String videoType) {
        List<DiskInfo> diskInfoList = diskDao.getDiskListByVideoType(videoType);
        return diskInfoList;
    }

}
