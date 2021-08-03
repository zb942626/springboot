package com.zb.dao;

import com.zb.bean.Options;

public interface OptionsMapper {
    int deleteByPrimaryKey(Integer optionid);

    int insert(Options record);

    int insertSelective(Options record);

    Options selectByPrimaryKey(Integer optionid);

    int updateByPrimaryKeySelective(Options record);

    int updateByPrimaryKeyWithBLOBs(Options record);

    int updateByPrimaryKey(Options record);
}