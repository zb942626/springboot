package com.zb.bean;

import java.io.Serializable;

public class Options implements Serializable {
    private Integer optionid;

    private Integer questionid;

    private Integer optionorder;

    private String optionpre;

    private String optiontext;

    private static final long serialVersionUID = 1L;

    public Integer getOptionid() {
        return optionid;
    }

    public void setOptionid(Integer optionid) {
        this.optionid = optionid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getOptionorder() {
        return optionorder;
    }

    public void setOptionorder(Integer optionorder) {
        this.optionorder = optionorder;
    }

    public String getOptionpre() {
        return optionpre;
    }

    public void setOptionpre(String optionpre) {
        this.optionpre = optionpre == null ? null : optionpre.trim();
    }

    public String getOptiontext() {
        return optiontext;
    }

    public void setOptiontext(String optiontext) {
        this.optiontext = optiontext == null ? null : optiontext.trim();
    }
}