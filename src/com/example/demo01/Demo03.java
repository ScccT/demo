package com.example.demo01;

import java.io.File;

public class Demo03 {
	public static void main(String[] args) {
		
		
		File file = new File("F:\\");
		System.out.println(file.length());
		
		//--获取指定目录下的所有File 对象. 需要注意file必须是目录.如果不是目录会返回null
		File[] files = file.listFiles();
		
		System.out.println(files.length);
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}	
	}

}
