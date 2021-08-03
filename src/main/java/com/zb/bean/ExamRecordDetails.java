package com.zb.bean;

import java.io.Serializable;
import java.util.Date;

public class ExamRecordDetails implements Serializable {
    private Integer id;

    private Integer detailsRecordid;

    private Integer detailsQuestionid;

    private String detailsAnswer;

    private Integer deatilsIsright;

    private Date detailsCreatetime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDetailsRecordid() {
        return detailsRecordid;
    }

    public void setDetailsRecordid(Integer detailsRecordid) {
        this.detailsRecordid = detailsRecordid;
    }

    public Integer getDetailsQuestionid() {
        return detailsQuestionid;
    }

    public void setDetailsQuestionid(Integer detailsQuestionid) {
        this.detailsQuestionid = detailsQuestionid;
    }

    public String getDetailsAnswer() {
        return detailsAnswer;
    }

    public void setDetailsAnswer(String detailsAnswer) {
        this.detailsAnswer = detailsAnswer == null ? null : detailsAnswer.trim();
    }

    public Integer getDeatilsIsright() {
        return deatilsIsright;
    }

    public void setDeatilsIsright(Integer deatilsIsright) {
        this.deatilsIsright = deatilsIsright;
    }

    public Date getDetailsCreatetime() {
        return detailsCreatetime;
    }

    public void setDetailsCreatetime(Date detailsCreatetime) {
        this.detailsCreatetime = detailsCreatetime;
    }
}