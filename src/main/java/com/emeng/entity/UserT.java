package com.emeng.entity;

public class UserT {
	private Long userId;
	private String realName;
    private String mobile;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
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
