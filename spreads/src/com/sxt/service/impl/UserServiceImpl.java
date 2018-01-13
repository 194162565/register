package com.sxt.service.impl;

import java.util.List;

import com.sxt.dao.UserDao;
import com.sxt.dao.impl.UserDaoImpl;
import com.sxt.pojo.User;
import com.sxt.service.UserService;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();
	
	//��¼
	@Override
	public User login(String name, String pwd) {
		// TODO Auto-generated method stub
		return userDao.login(name, pwd);
	}

	//չ��
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
