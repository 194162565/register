package com.sxt.dao;

import java.util.List;

import com.sxt.pojo.User;

public interface UserDao {
	
	//µÇÂ¼
	public User login(String name,String pwd);

	//Õ¹ÏÖ
	public List<User> findAll();
}
