package com.bitacademy.jblog.vo;

import java.sql.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class UsersVo {
	//필드
	private Long userno;
	private String id;
	private String username;
	private String password;
	private Date joindate;
	
	public UsersVo() {
}

	public Long getUserno() {
		return userno;
	}

	public void setUserno(Long userno) {
		this.userno = userno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "UsersVo [userno=" + userno + ", id=" + id + ", username=" + username + ", password=" + password
				+",joindate="+joindate+"]";
	}
	
}
