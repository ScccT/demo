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
		
		// File.separator �Զ�ƥ������б��    \\
		File file = new File("F:" + File.separator + "�绨.txt");
		
		try {
			/*
			 * true ������׷�ӵ���ʽд���ļ�.
			 */
			os = new FileOutputStream(file,true);
			//byte b[], int off, int len
			/*
			 * byte[] Ҫд���ļ����ֽ�����
			 * int    ���ֽ���������һ���±꿪ʼ.����������¼���ļ�
			 * int    ����. Ҫд���ٸ��ֽڽ����ļ�.
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
