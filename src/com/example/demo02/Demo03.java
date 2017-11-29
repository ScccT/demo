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
			System.out.println("创建文件失败!");
		}
		try {
			d.writeToFile(f1, "Hello");
			d.writeToFile(f2, "World");
			d.writeToFile(f3, d.readFromFile(f1) + d.readFromFile(f2));
		} catch (IOException e) {
			System.out.println("读写文件失败!");
		}catch (IllegalArgumentException e) {
			
		}
	}
	
	/**
	 * 创建文件
	 * 处理逻辑的地方不允许try-catch.将异常抛给调用者
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
	 * 向文件中写入内容 
	 * @param file 要写入的文件
	 * @param content 要写入的内容
	 * @throws FileNotFoundException  构建输出流对象时,如果文件物理磁盘上不存在会产生文件找不到异常.
	 * @throws IOException 在写文件过程,所产生的IO异常
	 */
	public void writeToFile(File file,String content) throws FileNotFoundException,IOException {
		if (file == null || !file.exists() || content == null || content.length() == 0) {
			return;
		}
		
		OutputStream os = new FileOutputStream(file,true);
		os.write(content.getBytes());
		os.close();
		os = null;
		//Ctrl + D删除一行.
	}
	
	/**
	 * 
	 * @param file 要读取的文件
	 * @return 读取的内容.如果读取不多或文件有问题返回空.
	 * @throws IOException 
	 */
	public String readFromFile(File file) throws IllegalArgumentException, IOException{
		if (file == null || !file.exists()) {
			throw new IllegalArgumentException("文件异常");
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
