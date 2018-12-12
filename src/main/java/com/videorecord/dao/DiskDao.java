package com.videorecord.dao;

import java.util.Date;
import java.util.List;

import com.videorecord.dao.mapper.DiskInfoMapper;
import com.videorecord.dao.pojo.DiskInfoExample;
import com.videorecord.entity.DiskInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.videorecord.bean.disk.DiskReqBean;
import com.videorecord.util.CommonUtils;

@Repository
public class DiskDao {

    @Autowired
    private DiskInfoMapper diskInfoMapper;

    public PageInfo<DiskInfo> getDiskList(DiskReqBean diskReqBean) {
        Integer pageNum = diskReqBean.getPage() != null ? diskReqBean.getPage() : 1;
        Integer pageSize = diskReqBean.getLimit() != null ? diskReqBean.getLimit() : 10;
        PageHelper.startPage(pageNum, pageSize, true);
        DiskInfoExample example = new DiskInfoExample();
        DiskInfoExample.Criteria criteria = example.createCriteria();
        if (CommonUtils.isNotEmpty(diskReqBean.getDiskName())) {
            criteria.andDiskNameLike("%" + diskReqBean.getDiskName() + "%");
        }
        if (CommonUtils.isNotEmpty(diskReqBean.getVideoType()) && !diskReqBean.getVideoType().equals("ALL")) {
            criteria.andVideoTypeEqualTo(diskReqBean.getVideoType());
        }
        if (CommonUtils.isNotEmpty(diskReqBean.getDiskCapacity()) && !diskReqBean.getDiskCapacity().equals("ALL")) {
            criteria.andDiskCapacityEqualTo(diskReqBean.getDiskCapacity());
        }
        if (CommonUtils.isNotEmpty(diskReqBean.getIsFull()) && !diskReqBean.getIsFull().equals("ALL")) {
            criteria.andIsFullEqualTo(diskReqBean.getIsFull());
        }
        if (CommonUtils.isNotEmpty(diskReqBean.getDiskState()) && !diskReqBean.getDiskState().equals("ALL")) {
            criteria.andDiskStateEqualTo(diskReqBean.getDiskState());
        }
        example.setOrderByClause("create_time, disk_name");
        List<DiskInfo> diskInfoList = diskInfoMapper.selectByExample(example);
        // 将查询结果使用pageInfo包装
        PageInfo<DiskInfo> page = new PageInfo<DiskInfo>(diskInfoList);

        return page;
    }

    public List<DiskInfo> getDiskListByVideoType(String videoType) {
        DiskInfoExample example = new DiskInfoExample();
        DiskInfoExample.Criteria criteria = example.createCriteria();
        if (CommonUtils.isNotEmpty(videoType) && !videoType.equals("ALL")) {
            criteria.andVideoTypeEqualTo(videoType);
        }
        List<DiskInfo> diskInfoList = diskInfoMapper.selectByExample(example);
        return diskInfoList;
    }

    public DiskInfo getDiskListByDiskId(String diskId) {
        return diskInfoMapper.selectByPrimaryKey(diskId);
    }

	public Integer diskAdd(DiskInfo diskInfo) {

		return diskInfoMapper.insertSelective(diskInfo);
	}

    public Integer diskEdit(DiskInfo diskInfo) {
        return diskInfoMapper.updateByPrimaryKeySelective(diskInfo);
    }

    public Integer diskDel(String diskId) {
        return diskInfoMapper.deleteByPrimaryKey(diskId);
    }
}
