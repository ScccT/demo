package com.example.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		try {
			/*
			 * 127.0.0.1 是一个回路IP地址.代表本机
			 * 或者写成localhost 都是代表本机
			 */
			Socket s = new Socket("127.0.0.1", 998);
			System.out.println("客户端绑定服务端成功");
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			//--客户端通过输出流向服务端写信息.
			os.write("侯小飞".getBytes());
			byte[] buffer = new byte[1024];
			is.read(buffer);
			System.out.println(new String(buffer));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
