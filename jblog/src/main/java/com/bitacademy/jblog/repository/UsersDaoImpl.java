package com.bitacademy.jblog.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.UsersVo;
@Repository("usersDao")
public class UsersDaoImpl implements UsersDao {
	private static Logger logger = LoggerFactory.getLogger(UsersDaoImpl.class);
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(UsersVo vo) {
		int insertedCount=0;
		insertedCount=sqlSession.insert("users.insert",vo);
		return insertedCount;
	}

	@Override
	public UsersVo selectUser(String id) {
		UsersVo vo=sqlSession.selectOne("users.selectUserById",id);
		return null;
	}

	@Override
	public UsersVo selectUser(String id, String password) {
		Map<String,String>userMap=new HashMap<>();
		userMap.put("id",id);
		userMap.put("password", password);
		UsersVo vo=sqlSession.selectOne("users.selectUserByIdAndPassword",userMap);
		return vo;
	}

}
