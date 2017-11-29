package com.example.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://www.baidu.com");
		//--��ȡURL���Ӷ���
		URLConnection conn = url.openConnection();
		
		//--ͨ�����Ӷ�������ӽ���һϵ�е�����
		//--�Ƿ�ʹ�û���.
		conn.setUseCaches(true);
		//--�������ӳ�ʱʱ��
		conn.setConnectTimeout(5000);
		//--���ö�ȡ��ʱʱ��
		conn.setReadTimeout(5000);
		conn.setRequestProperty("Accept-Charset	", "UTF-8");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
		
		String line = "";
		StringBuilder sBuilder = new StringBuilder();
		while(null != (line = br.readLine())) {
			sBuilder.append(line);
		}
		
		System.out.println(sBuilder.toString());
		
	}

}
