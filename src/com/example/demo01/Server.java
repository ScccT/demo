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
			System.out.println("���������,�ȴ��ͻ��˰�");
			//--accept��������������.			
			Socket s = ss.accept();
			System.out.println("�ͻ��˰󶨳ɹ�!");
			System.out.println("�ͻ���IP��ַΪ:" +s.getInetAddress());//--��ȡ�ͻ��˵�IP��ַ.
			
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			byte[] buffer = new byte[1024];
			is.read(buffer);
			System.out.println(new String(buffer));
			
			os.write("�յ�!".getBytes());
			
			
			
			
			
			
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
