package com.example.demo02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo01 {
	
	public static void main(String[] args) {
		String str = "HelloWorld";
		OutputStream os = null;
		
		// File.separator 自动匹配正反斜杠    \\
		File file = new File("F:" + File.separator + "如花.txt");
		
		try {
			/*
			 * true 代表已追加的形式写入文件.
			 */
			os = new FileOutputStream(file,true);
			//byte b[], int off, int len
			/*
			 * byte[] 要写入文件的字节数组
			 * int    从字节数组中那一个下标开始.将后续内容录入文件
			 * int    长度. 要写多少个字节进入文件.
			 */
			os.write((str).getBytes(),0,str.length());
			os.write("\r\n".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			os = null;
		}		
	}
}
