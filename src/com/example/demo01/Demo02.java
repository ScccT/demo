package com.example.demo01;

import java.io.File;

public class Demo02 {

	public static void main(String[] args) {
		
		File file = new File("F:\\HWUA\\TC25\\学员信息.xlsx");
		
		renameFile(file);
		//delFile(file);
		
	}

	//Ctrl + 1
	private static void renameFile(File file) {
	
		if (file.exists()) {
			file.renameTo(new File("F:\\侯霞霏.xlsx"));
		}
	}

	private static void delFile(File file) {
		if (file.exists() && file.delete()) {
			System.out.println("删除文件成功");
		}else {
			System.out.println("删除文件失败!");
		}
	}
	
	
	
	
	
}
