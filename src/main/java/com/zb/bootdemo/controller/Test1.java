package com.zb.bootdemo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zb.bean.Student;
import com.zb.dao.StudentMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
@Api(tags = "学生管理")
public class Test1 {

    @Autowired
    StudentMapper studentMapper;
    @GetMapping ("test")
    @ApiOperation(value = "查询所有学生")
    public String test(){
        return "hello";
    }
    @GetMapping("list")
    public Object selectall( Integer index,Integer size){

        index=index==null?1:index;
        size=size==null?10:size;
        PageHelper.startPage(index,size);
        List<Student> selectall = studentMapper.selectall();
        PageInfo<Student> info =new PageInfo<Student>(selectall);
        return info;
    }
}
