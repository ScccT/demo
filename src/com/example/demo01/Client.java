package com.example.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		try {
			/*
			 * 127.0.0.1 ��һ����·IP��ַ.������
			 * ����д��localhost ���Ǵ�����
			 */
			Socket s = new Socket("127.0.0.1", 998);
			System.out.println("�ͻ��˰󶨷���˳ɹ�");
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			//--�ͻ���ͨ�������������д��Ϣ.
			os.write("��С��".getBytes());
			byte[] buffer = new byte[1024];
			is.read(buffer);
			System.out.println(new String(buffer));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
