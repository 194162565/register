package com.sxt.service;

import java.util.List;

import com.sxt.pojo.User;

public interface UserService {

	//��¼
	public User login(String name,String pwd);
	
	
	//չ��
	public List<User> findAll();
}
