package com.example.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo01 {

	public static void main(String[] args) {
		
		StringBuilder sBuilder = new StringBuilder();
		//--为了finally中可以调用到三个对象.
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			try {
				URL url = new URL("https://www.baidu.com");
				
				//--非法URL异常. 比如协议不对,比如URL格式不对. 非运行时异常.
				//获取协议
				System.out.println(url.getProtocol());
				//--获取主机地址(如果我们写的是域名,获取的就是域名)
				//--如果我们写的是IP地址.获取的就是IP地址.
				System.out.println(url.getHost());
				//--获取端口号.当没有指明端口号时返回-1
				System.out.println(url.getPort());
				//--附加的用户信息.没有指明返回null			
				System.out.println(url.getUserInfo());
				//Host + Port
				System.out.println(url.getAuthority());
				
				//--打开流.是从服务端流向客户端.对于客户端来说流向内存的是输入流
				//--字节流一般用来读取图片媒体等二进制内容.
				is  = url.openStream();
				//--对上面的字节流进行包装.包装成字符流
				//--.利用转换流将字节流转换成字符流
				isr = new InputStreamReader(is);
				//--.对字符流进行二次包装,包装成缓冲流
				br = new BufferedReader(isr);
				
				String line = "";				
				while (null != (line = br.readLine())) {
					sBuilder.append(line);
				}
			}finally {
				br.close();
				br = null;
			}			
		} catch (MalformedURLException e) {
 			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		
		System.out.println(sBuilder.toString());
		
	}
}
