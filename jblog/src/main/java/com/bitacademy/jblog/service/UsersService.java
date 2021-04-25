package com.bitacademy.jblog.service;

import com.bitacademy.jblog.vo.UsersVo;

public interface UsersService {
	public boolean join(UsersVo vo);//	가입(INSERT)
	public UsersVo getUser(String id);
	public UsersVo getUser(String id, String password);
}
