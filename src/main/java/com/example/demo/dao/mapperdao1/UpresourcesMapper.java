package com.example.demo.dao.mapperdao1;

import com.example.demo.entity.Upresources;
import com.example.demo.entity.UpresourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UpresourcesMapper {
    int countByExample(UpresourcesExample example);

    int deleteByExample(UpresourcesExample example);

    int insert(Upresources record);

    int insertSelective(Upresources record);

    List<Upresources> selectByExample(UpresourcesExample example);

    int updateByExampleSelective(@Param("record") Upresources record, @Param("example") UpresourcesExample example);

    int updateByExample(@Param("record") Upresources record, @Param("example") UpresourcesExample example);
}