package com.example.demo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


public class Demo03 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		URL url = new URL("https://www.baidu.com/img/bd_logo1.png");
		URLConnection conn = url.openConnection();
		/*
		 * HttpURLConnection �� URLConnection������.
		 * ͨ����URLConnection�������ǿת��ȡ
		 */
		HttpURLConnection hcon = (HttpURLConnection) conn;
		
		//--GET/Post  ����ʽ
		/*
		 * Get �� Post �ײ���һ����.���ϲ��װ��
		 * Post��Get���װ��һЩ����.����GET��POST���������в���
		 * 
		 * GET:�ǲ����������������ܴ����.
		 * 		GET���� �������ֵ2K+35���ֽ�
		 * POST:�������װ������ʵ��(���Ϊ�����һ��)
		 * 		�����Ͻ���û�д�С���Ƶģ�HTTPЭ��淶Ҳû�н��д�С���ƣ�
		 * 		��ʵ����post���ܴ��ݵ���������Сȡ���ڷ����������ú��ڴ��С��
		 * 
		 * һ���������ṩ����ӿ�(�ýӿڲ���Java�е�interface.����һ����ͨ��url��ַ.ֻ�����ǰ��������ӿ�)ʱ
		 * һ��ḽ��˵���ĵ�,��ʾ�ýӿ�֧����������ʽ. 
		 */
		hcon.setRequestMethod("GET");
		
		//--ʱ���Ǻ���.
		hcon.setConnectTimeout(5000);
		
		//--��������ı����ʽ
		hcon.setRequestProperty("Accept-Charset	", "UTF-8");
		
		
		//--��ȡ��Ӧ��
		if(200!=hcon.getResponseCode()){
			 return ;
		}
		
		int size = 0;
		//--���󵽵���Դ�Ĵ�С ��λ���ֽ�
		System.out.println("Length:"+(size = hcon.getContentLength()));
		
		//--��ȡ����ͻ����ڴ��������
		//--���ֽ�����ȡͼƬ,ý��ȶ���������.
		//--���ı��Ƚ϶��ʱ�����ַ���.�ر��Ƕ�����
		InputStream is = hcon.getInputStream();
		
		OutputStream os = new FileOutputStream("F:\\BaiDu.png");
		int length = 0;
		double count = 0;
		byte[] buffer = new byte[1027];
		while(-1 != (length = is.read(buffer))) {
			count += length;
			System.out.println("�Ѿ���ȡ:" + ((int)((count / size )*100))+"%");
			os.write(buffer,0,length);
			Thread.sleep(500);
		}		
		os.close();
		is.close();
		os = null;
		is = null;
	}

}
