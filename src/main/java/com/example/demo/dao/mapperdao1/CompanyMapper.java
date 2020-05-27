package com.example.demo.dao.mapperdao1;

import com.example.demo.entity.Company;
import com.example.demo.entity.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyMapper {
    int countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(String c001);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    Company selectByPrimaryKey(String c001);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}