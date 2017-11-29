package com.example.demo02;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

public class Demo02 {
	
	

	
	public static void main(String[] args) {
		InputStream is = null;	
		//--用于保存从文件中读取的内容
		byte[] buffer = new byte[1024];
		StringBuilder sBuilder = new StringBuilder();
		int length = 0;//--用于记录每次读取的字节数.
				
		try {
			try {
				//--参数可以是File对象也可以是指向这个文件的绝对路径.
				/*
				 * 如果文件没有上级目录,或者上级目录是已经存在的.
				 * 这种情况下,如果文件不存在,可以帮我们创建文件.
				 *            如果文件存在,则直接打开文件.
				 */
				is = new FileInputStream("F:\\如花.txt");
				while(-1 != (length = is.read(buffer))){
					//--如果读了n次.n-1次.是读满整个数组的.但是第n次不一定能够放满.
					//--所以需要知道实际放了多少.
					//byte bytes[], int offset, int length
					sBuilder.append(new String(buffer,0,length));
				}			
			}finally {
				is.close();
				is = null;
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(sBuilder.toString());
		
		
		
		
		
		
	}

}
