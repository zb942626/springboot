package com.zb.dao;

import com.zb.bean.ExamRecord;

public interface ExamRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamRecord record);

    int insertSelective(ExamRecord record);

    ExamRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamRecord record);

    int updateByPrimaryKey(ExamRecord record);
}