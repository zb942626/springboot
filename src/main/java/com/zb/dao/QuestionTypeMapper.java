package com.zb.dao;

import com.zb.bean.QuestionType;

public interface QuestionTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionType record);

    int insertSelective(QuestionType record);

    QuestionType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuestionType record);

    int updateByPrimaryKey(QuestionType record);
}