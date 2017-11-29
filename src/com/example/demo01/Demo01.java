package com.example.demo01;

import java.io.File;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) {
		Demo01 d = new Demo01();
		try {
			d.method("F:\\HWUA\\TC25\\学员信息.xlsx");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("创建文件失败!");
		}
	}
	
	/**
	 * 根据路径创建文件或者文件夹
	 * @param path
	 * @throws IOException 
	 */
	public void method(String path) throws IllegalArgumentException, IOException{
		
		//StringUtil strman-java
		if (null == path || path.length() == 0) {
			throw new IllegalArgumentException("路径不和法");
		}

		File file = new File(path);
		
		if (file.exists()) {
			System.out.println("文件已经存在!");
			return ;
		}
		
		//--验证上级目录是否存在.如果不存在则创建.
		File parentFile = file.getParentFile();
		if (!parentFile.exists()) {
			parentFile.mkdirs();
		}
		
		//--创建具体的文件
		file.createNewFile();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
