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
		 * HttpURLConnection 是 URLConnection的子类.
		 * 通过对URLConnection对象进行强转获取
		 */
		HttpURLConnection hcon = (HttpURLConnection) conn;
		
		//--GET/Post  请求方式
		/*
		 * Get 和 Post 底层是一样的.在上层封装上
		 * Post比Get多封装了一些内容.导致GET和POST在体现上有差异
		 * 
		 * GET:是不对请求内容做加密处理的.
		 * 		GET请求 长度最大值2K+35个字节
		 * POST:把请求封装成请求实体(理解为像加密一样)
		 * 		理论上讲是没有大小限制的，HTTP协议规范也没有进行大小限制，
		 * 		但实际上post所能传递的数据量大小取决于服务器的设置和内存大小。
		 * 
		 * 一般服务端在提供请求接口(该接口不是Java中的interface.就是一个普通的url地址.只是我们把它叫做接口)时
		 * 一般会附带说明文档,表示该接口支持那种请求方式. 
		 */
		hcon.setRequestMethod("GET");
		
		//--时间是毫秒.
		hcon.setConnectTimeout(5000);
		
		//--设置请求的编码格式
		hcon.setRequestProperty("Accept-Charset	", "UTF-8");
		
		
		//--获取响应码
		if(200!=hcon.getResponseCode()){
			 return ;
		}
		
		int size = 0;
		//--请求到的资源的大小 单位是字节
		System.out.println("Length:"+(size = hcon.getContentLength()));
		
		//--获取流向客户端内存的输入流
		//--用字节流读取图片,媒体等二进制内容.
		//--当文本比较多的时候用字符流.特别是读中文
		InputStream is = hcon.getInputStream();
		
		OutputStream os = new FileOutputStream("F:\\BaiDu.png");
		int length = 0;
		double count = 0;
		byte[] buffer = new byte[1027];
		while(-1 != (length = is.read(buffer))) {
			count += length;
			System.out.println("已经读取:" + ((int)((count / size )*100))+"%");
			os.write(buffer,0,length);
			Thread.sleep(500);
		}		
		os.close();
		is.close();
		os = null;
		is = null;
	}

}
