package com.bitacademy.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.UsersDao;
import com.bitacademy.jblog.vo.UsersVo;
@Service("usersService")
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersDao usersDao;
	@Override
	public boolean join(UsersVo vo) {
		int insertedCount = usersDao.insert(vo);
		return 1 == insertedCount;
	}
    @Override
    public UsersVo getUser(String id)
    {
    	UsersVo vo=usersDao.selectUser(id);
    	return vo;
    }
    @Override
	public UsersVo getUser(String id, String password) {
		UsersVo vo = usersDao.selectUser(id, password);
		return vo;
	}
}
