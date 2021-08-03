package com.zb.bean;

import java.io.Serializable;
import java.util.Date;

public class ExamRecord implements Serializable {
    private Integer id;

    private Integer examStuid;

    private Integer examSubjectid;

    private Date examBegintime;

    private Date examEndtime;

    private Integer examDruation;

    private Float examScore;

    private Integer examState;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExamStuid() {
        return examStuid;
    }

    public void setExamStuid(Integer examStuid) {
        this.examStuid = examStuid;
    }

    public Integer getExamSubjectid() {
        return examSubjectid;
    }

    public void setExamSubjectid(Integer examSubjectid) {
        this.examSubjectid = examSubjectid;
    }

    public Date getExamBegintime() {
        return examBegintime;
    }

    public void setExamBegintime(Date examBegintime) {
        this.examBegintime = examBegintime;
    }

    public Date getExamEndtime() {
        return examEndtime;
    }

    public void setExamEndtime(Date examEndtime) {
        this.examEndtime = examEndtime;
    }

    public Integer getExamDruation() {
        return examDruation;
    }

    public void setExamDruation(Integer examDruation) {
        this.examDruation = examDruation;
    }

    public Float getExamScore() {
        return examScore;
    }

    public void setExamScore(Float examScore) {
        this.examScore = examScore;
    }

    public Integer getExamState() {
        return examState;
    }

    public void setExamState(Integer examState) {
        this.examState = examState;
    }
}