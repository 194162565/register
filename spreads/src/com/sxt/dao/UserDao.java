package com.sxt.dao;

import java.util.List;

import com.sxt.pojo.User;

public interface UserDao {
	
	//��¼
	public User login(String name,String pwd);

	//չ��
	public List<User> findAll();
}
