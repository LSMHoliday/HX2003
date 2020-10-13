package it.hxzy.com.cn.domain;

import java.util.Date;

public class GradeModel {
    private Integer id;

    private String gradename;

    private Date createTime;

    private int enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename == null ? null : gradename.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

	@Override
	public String toString() {
		return "GradeModel [id=" + id + ", gradename=" + gradename
				+ ", createTime=" + createTime + ", enabled=" + enabled + "]";
	}
    
    
}