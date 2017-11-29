package com.example.demo01;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		//  \t  \n  \是转义字符
		File file = new File("F:\\如花.txt");		
		System.out.println(file.exists());
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//--获取绝对路径
		System.out.println(file.getAbsolutePath());
		//--还不文件的父目录的路径.F:\\ABC\\A.txt
		System.out.println(file.getParentFile().getAbsolutePath());
		//--获取最后一次修改时间
		System.out.println(file.lastModified());
		//--判断文件是不是隐藏文件
		System.out.println(file.isHidden());
		System.out.println(file.isAbsolute());
	
		//--获取文件锁包含的字节数
		System.out.println(file.length());
		//--获取磁盘总大小
		System.out.println(file.getTotalSpace());
		//--获取磁盘剩余大小
		System.out.println(file.getFreeSpace());
		//--获取文件名称
		System.out.println(file.getName());
		//--获取文件是否可读
		System.out.println(file.canRead());
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
