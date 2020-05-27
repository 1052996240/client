package com.example.demo.dao.mapperdao1;

import com.example.demo.entity.Euser;
import com.example.demo.entity.EuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EuserMapper {
    int countByExample(EuserExample example);

    int deleteByExample(EuserExample example);

    int deleteByPrimaryKey(String u001);

    int insert(Euser record);

    int insertSelective(Euser record);

    List<Euser> selectByExample(EuserExample example);

    Euser selectByPrimaryKey(String u001);

    int updateByExampleSelective(@Param("record") Euser record, @Param("example") EuserExample example);

    int updateByExample(@Param("record") Euser record, @Param("example") EuserExample example);

    int updateByPrimaryKeySelective(Euser record);

    int updateByPrimaryKey(Euser record);
}