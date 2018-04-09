package com.emeng.demo.entity;

public class UserT {
	private Integer userId;
	private String realName;
    private String mobile;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "UserT [userId=" + userId + ", realName=" + realName + ", mobile=" + mobile + "]";
	}
    
}
