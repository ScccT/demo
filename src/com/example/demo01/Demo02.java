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
		//--获取URL连接对象
		URLConnection conn = url.openConnection();
		
		//--通过连接对象对连接进行一系列的设置
		//--是否使用缓存.
		conn.setUseCaches(true);
		//--设置连接超时时间
		conn.setConnectTimeout(5000);
		//--设置读取超时时间
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
