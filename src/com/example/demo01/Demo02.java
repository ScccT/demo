package com.example.demo01;

import java.io.File;

public class Demo02 {

	public static void main(String[] args) {
		
		File file = new File("F:\\HWUA\\TC25\\ѧԱ��Ϣ.xlsx");
		
		renameFile(file);
		//delFile(file);
		
	}

	//Ctrl + 1
	private static void renameFile(File file) {
	
		if (file.exists()) {
			file.renameTo(new File("F:\\��ϼ��.xlsx"));
		}
	}

	private static void delFile(File file) {
		if (file.exists() && file.delete()) {
			System.out.println("ɾ���ļ��ɹ�");
		}else {
			System.out.println("ɾ���ļ�ʧ��!");
		}
	}
	
	
	
	
	
}
