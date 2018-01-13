package com.sxt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxt.dao.UserDao;
import com.sxt.pojo.User;
import com.sxt.utils.JdbcUtils;

public class UserDaoImpl extends JdbcUtils implements UserDao{

	/**
	 * 登录
	 */
	@Override
	public User login(String name, String pwd) {
		User user = null;
		//声明连接
		Connection conn = null;
		PreparedStatement pstat = null;
		ResultSet re = null;
		try {
			//创建连接
			conn = getConnection();
			String sql = "select * from t_users where name=? and pwd =?";
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, name);
			pstat.setString(2, pwd);
			//发送结果集
			re = pstat.executeQuery();
			//处理结果
			if(re.next()){
				int id1 = re.getInt("id");
				String name1 = re.getString("name");
				String pwd1= re.getString("pwd");
				
				user = new User(id1, name1, pwd1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			colseAll(conn, pstat, re);
		}
		return user;
	}

	
	/**
	 * 展现
	 */
	@Override
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		String sql = "select * form t_users";
		Connection conn = null;
		PreparedStatement pstat = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstat = conn.prepareStatement(sql);
			rs = pstat.executeQuery();
			
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String pwd = rs.getString("pwd");
				
				User user = new User(id, name, pwd);
				list.add(user);
				System.out.println(user);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			colseAll(conn, pstat, rs);
		}
		return list;
	}

}
