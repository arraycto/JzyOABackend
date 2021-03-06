package com.jzyoa.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.jzyoa.pojo.TbHospital;
import com.jzyoa.pojo.TbHospitalExample;

public interface TbHospitalMapper {
    int countByExample(TbHospitalExample example);

    int deleteByExample(TbHospitalExample example);

    int deleteByPrimaryKey(Integer hosId);

    int insert(TbHospital record);

    int insertSelective(TbHospital record);

    List<TbHospital> selectByExample(TbHospitalExample example);

    TbHospital selectByPrimaryKey(Integer hosId);

    int updateByExampleSelective(@Param("record") TbHospital record, @Param("example") TbHospitalExample example);

    int updateByExample(@Param("record") TbHospital record, @Param("example") TbHospitalExample example);

    int updateByPrimaryKeySelective(TbHospital record);

    int updateByPrimaryKey(TbHospital record);
}