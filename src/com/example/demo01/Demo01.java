package com.example.demo01;

import java.io.File;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) {
		Demo01 d = new Demo01();
		try {
			d.method("F:\\HWUA\\TC25\\ѧԱ��Ϣ.xlsx");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("�����ļ�ʧ��!");
		}
	}
	
	/**
	 * ����·�������ļ������ļ���
	 * @param path
	 * @throws IOException 
	 */
	public void method(String path) throws IllegalArgumentException, IOException{
		
		//StringUtil strman-java
		if (null == path || path.length() == 0) {
			throw new IllegalArgumentException("·�����ͷ�");
		}

		File file = new File(path);
		
		if (file.exists()) {
			System.out.println("�ļ��Ѿ�����!");
			return ;
		}
		
		//--��֤�ϼ�Ŀ¼�Ƿ����.����������򴴽�.
		File parentFile = file.getParentFile();
		if (!parentFile.exists()) {
			parentFile.mkdirs();
		}
		
		//--����������ļ�
		file.createNewFile();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
