package com.example.demo02;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

public class Demo02 {
	
	

	
	public static void main(String[] args) {
		InputStream is = null;	
		//--���ڱ�����ļ��ж�ȡ������
		byte[] buffer = new byte[1024];
		StringBuilder sBuilder = new StringBuilder();
		int length = 0;//--���ڼ�¼ÿ�ζ�ȡ���ֽ���.
				
		try {
			try {
				//--����������File����Ҳ������ָ������ļ��ľ���·��.
				/*
				 * ����ļ�û���ϼ�Ŀ¼,�����ϼ�Ŀ¼���Ѿ����ڵ�.
				 * ���������,����ļ�������,���԰����Ǵ����ļ�.
				 *            ����ļ�����,��ֱ�Ӵ��ļ�.
				 */
				is = new FileInputStream("F:\\�绨.txt");
				while(-1 != (length = is.read(buffer))){
					//--�������n��.n-1��.�Ƕ������������.���ǵ�n�β�һ���ܹ�����.
					//--������Ҫ֪��ʵ�ʷ��˶���.
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
