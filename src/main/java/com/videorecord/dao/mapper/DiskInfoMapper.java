package com.videorecord.dao.mapper;

import com.videorecord.entity.DiskInfo;
import com.videorecord.dao.pojo.DiskInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DiskInfoMapper {
    int countByExample(DiskInfoExample example);

    int deleteByExample(DiskInfoExample example);

    int deleteByPrimaryKey(String diskId);

    int insert(DiskInfo record);

    int insertSelective(DiskInfo record);

    List<DiskInfo> selectByExample(DiskInfoExample example);

    DiskInfo selectByPrimaryKey(String diskId);

    int updateByExampleSelective(@Param("record") DiskInfo record, @Param("example") DiskInfoExample example);

    int updateByExample(@Param("record") DiskInfo record, @Param("example") DiskInfoExample example);

    int updateByPrimaryKeySelective(DiskInfo record);

    int updateByPrimaryKey(DiskInfo record);
}