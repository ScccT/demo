package com.example.demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo03 {
	

	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) {
		Demo03 d = new Demo03();
		String p1 = "C:\\C\\C.txt";
		String p2 = "D:\\D\\D.txt";
		String p3 = "E:\\E\\E.txt";
		
		File f1 = new File(p1);
		File f2 = new File(p2);
		File f3 = new File(p3);
		
		try {
			d.createFile(f1);
			d.createFile(f2);
			d.createFile(f3);			
		} catch (IOException e) {
			System.out.println("�����ļ�ʧ��!");
		}
		try {
			d.writeToFile(f1, "Hello");
			d.writeToFile(f2, "World");
			d.writeToFile(f3, d.readFromFile(f1) + d.readFromFile(f2));
		} catch (IOException e) {
			System.out.println("��д�ļ�ʧ��!");
		}catch (IllegalArgumentException e) {
			
		}
	}
	
	/**
	 * �����ļ�
	 * �����߼��ĵط�������try-catch.���쳣�׸�������
	 * @param file
	 * @throws IOException 
	 */
	public void createFile(File file) throws IOException {
		if (file == null || file.exists()) {
			return ;
		}
		
		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}
		
		file.createNewFile();
		
	}
	
	/**
	 * ���ļ���д������ 
	 * @param file Ҫд����ļ�
	 * @param content Ҫд�������
	 * @throws FileNotFoundException  �������������ʱ,����ļ���������ϲ����ڻ�����ļ��Ҳ����쳣.
	 * @throws IOException ��д�ļ�����,��������IO�쳣
	 */
	public void writeToFile(File file,String content) throws FileNotFoundException,IOException {
		if (file == null || !file.exists() || content == null || content.length() == 0) {
			return;
		}
		
		OutputStream os = new FileOutputStream(file,true);
		os.write(content.getBytes());
		os.close();
		os = null;
		//Ctrl + Dɾ��һ��.
	}
	
	/**
	 * 
	 * @param file Ҫ��ȡ���ļ�
	 * @return ��ȡ������.�����ȡ������ļ������ⷵ�ؿ�.
	 * @throws IOException 
	 */
	public String readFromFile(File file) throws IllegalArgumentException, IOException{
		if (file == null || !file.exists()) {
			throw new IllegalArgumentException("�ļ��쳣");
		}
		
		byte[] buffer = new byte[BUFFER_SIZE]; 
		StringBuilder sBuilder = new StringBuilder();
		int length = 0;
		
		InputStream is = new FileInputStream(file);
		while(-1 != (length = is.read(buffer))) {
			sBuilder.append(new String(buffer,0,length));
		}		
		is.close();
		is = null;		
		
		return sBuilder.toString();
	}
	

}
