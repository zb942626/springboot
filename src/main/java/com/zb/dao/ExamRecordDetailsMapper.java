package com.zb.dao;

import com.zb.bean.ExamRecordDetails;

public interface ExamRecordDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamRecordDetails record);

    int insertSelective(ExamRecordDetails record);

    ExamRecordDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamRecordDetails record);

    int updateByPrimaryKey(ExamRecordDetails record);
}