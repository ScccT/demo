package com.example.demo01;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		//  \t  \n  \��ת���ַ�
		File file = new File("F:\\�绨.txt");		
		System.out.println(file.exists());
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//--��ȡ����·��
		System.out.println(file.getAbsolutePath());
		//--�����ļ��ĸ�Ŀ¼��·��.F:\\ABC\\A.txt
		System.out.println(file.getParentFile().getAbsolutePath());
		//--��ȡ���һ���޸�ʱ��
		System.out.println(file.lastModified());
		//--�ж��ļ��ǲ��������ļ�
		System.out.println(file.isHidden());
		System.out.println(file.isAbsolute());
	
		//--��ȡ�ļ����������ֽ���
		System.out.println(file.length());
		//--��ȡ�����ܴ�С
		System.out.println(file.getTotalSpace());
		//--��ȡ����ʣ���С
		System.out.println(file.getFreeSpace());
		//--��ȡ�ļ�����
		System.out.println(file.getName());
		//--��ȡ�ļ��Ƿ�ɶ�
		System.out.println(file.canRead());
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
