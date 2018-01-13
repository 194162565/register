package com.sxt.copy;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{
		
		//创建文件夹
		String directoryName = "D:/filen/tese";
		File file = new File(directoryName);
		if(file.exists()){
			System.out.println("=====文件夹已存在=====");
		}else{
			file.mkdirs();
			System.out.println("=====文件夹创建成功=====");
		}
		
		//创建文件
		String fileName = "D:/filen/tese/test.java";
		File files = new File(fileName);
		if(files.exists()){
			System.out.println("=====该文件已存在=====");
		}else{
			files.createNewFile();
			System.out.println("=====创建文件成功=====");
		}
		
		Test test = new Test();
		createFile("thid id", "dsds");
	}
	

	private static void createFile(String filepath,String filr){
		System.out.println("this is test" + filepath);
	}
}
