package com.example.demo.dao.mapperdao1;

import com.example.demo.entity.Machine;
import com.example.demo.entity.MachineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineMapper {
    int countByExample(MachineExample example);

    int deleteByExample(MachineExample example);

    int deleteByPrimaryKey(String m001);

    int insert(Machine record);

    int insertSelective(Machine record);

    List<Machine> selectByExample(MachineExample example);

    Machine selectByPrimaryKey(String m001);

    int updateByExampleSelective(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByExample(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);
}