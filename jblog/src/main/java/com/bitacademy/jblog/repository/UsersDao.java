package com.bitacademy.jblog.repository;

import com.bitacademy.jblog.vo.UsersVo;

public interface UsersDao {
	public int insert(UsersVo vo);	//
	public UsersVo selectUser(String id);
	public UsersVo selectUser(String id, String password);
}
