package com.example.demo01;

import java.io.File;

public class Demo03 {
	public static void main(String[] args) {
		
		
		File file = new File("F:\\");
		System.out.println(file.length());
		
		//--��ȡָ��Ŀ¼�µ�����File ����. ��Ҫע��file������Ŀ¼.�������Ŀ¼�᷵��null
		File[] files = file.listFiles();
		
		System.out.println(files.length);
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}	
	}

}
