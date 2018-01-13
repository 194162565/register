package com.sxt.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    private static String dbType = "";//数据库类型
	private static String Driver = "";
	private static String Url = "";
	private static String UserName = "";
	private static String PassWord = "";
	
	
	static{
		//创建Properties对象
		Properties prop = new Properties();
		try {
			//读取配置文件
			prop.load(JdbcUtils.class.getClassLoader().getResourceAsStream("db-config.properties"));
			//获取数据库类型
			dbType = prop.getProperty("dbType");
			//获取配置参数信息
			Driver = prop.getProperty(dbType+"Driver");
			Url = prop.getProperty(dbType+"Url");
			UserName = prop.getProperty(dbType+"UserName");
			PassWord = prop.getProperty(dbType+"PassWord");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//创建连接
	public static Connection getConnection(){
		Connection conn = null;
		try {
			//加载驱动
			Class.forName(Driver);
			conn = DriverManager.getConnection(Url, UserName, PassWord);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//关闭流
	public void colseAll(Connection conn,PreparedStatement pstat,ResultSet rs){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(pstat != null){
			try {
				pstat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
		
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}
}
