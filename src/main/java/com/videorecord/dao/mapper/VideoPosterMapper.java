package com.videorecord.dao.mapper;

import com.videorecord.entity.VideoPoster;
import com.videorecord.dao.pojo.VideoPosterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoPosterMapper {
    int countByExample(VideoPosterExample example);

    int deleteByExample(VideoPosterExample example);

    int deleteByPrimaryKey(String videoId);

    int insert(VideoPoster record);

    int insertSelective(VideoPoster record);

    List<VideoPoster> selectByExampleWithBLOBs(VideoPosterExample example);

    List<VideoPoster> selectByExample(VideoPosterExample example);

    VideoPoster selectByPrimaryKey(String videoId);

    int updateByExampleSelective(@Param("record") VideoPoster record, @Param("example") VideoPosterExample example);

    int updateByExampleWithBLOBs(@Param("record") VideoPoster record, @Param("example") VideoPosterExample example);

    int updateByExample(@Param("record") VideoPoster record, @Param("example") VideoPosterExample example);

    int updateByPrimaryKeySelective(VideoPoster record);

    int updateByPrimaryKeyWithBLOBs(VideoPoster record);

    int updateByPrimaryKey(VideoPoster record);
}