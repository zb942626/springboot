package com.zb.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;

    private String stuName;

    private String stuPhone;

    private String stuPassword;

    private String stuRemark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone == null ? null : stuPhone.trim();
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword == null ? null : stuPassword.trim();
    }

    public String getStuRemark() {
        return stuRemark;
    }

    public void setStuRemark(String stuRemark) {
        this.stuRemark = stuRemark == null ? null : stuRemark.trim();
    }
}