package com.example.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	
	public static void main(String[] args) {
		
		ArrayList<Socket> list = new ArrayList<>();
		try {
			ServerSocket ss = new ServerSocket(998);
			System.out.println("服务端启动,等待客户端绑定");
			//--accept方法是阻塞方法.			
			Socket s = ss.accept();
			System.out.println("客户端绑定成功!");
			System.out.println("客户端IP地址为:" +s.getInetAddress());//--获取客户端的IP地址.
			
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			byte[] buffer = new byte[1024];
			is.read(buffer);
			System.out.println(new String(buffer));
			
			os.write("收到!".getBytes());
			
			
			
			
			
			
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
