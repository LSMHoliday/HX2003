package it.hxzy.com.cn.domain;

public class TimeModel {
    private Integer id;

    private String lessionTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLessionTime() {
        return lessionTime;
    }

    public void setLessionTime(String lessionTime) {
        this.lessionTime = lessionTime == null ? null : lessionTime.trim();
    }
}