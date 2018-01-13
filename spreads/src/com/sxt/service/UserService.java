package com.sxt.service;

import java.util.List;

import com.sxt.pojo.User;

public interface UserService {

	//µÇÂ¼
	public User login(String name,String pwd);
	
	
	//Õ¹ÏÖ
	public List<User> findAll();
}
