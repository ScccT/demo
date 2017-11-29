package com.example.demo02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
	
	private ServerSocket serverSocket;
	private HashMap<String, PrintWriter> maps;
	//--�̳߳�.
	private ExecutorService threadPool;

	/**
	 * 
	 * @param port �˿ں�
	 */
	public ChatServer(int port) {
		try {
			serverSocket = new ServerSocket(port);
			maps = new HashMap<>();
			/**
			 * ��ʼ���̳߳ض���.�趨�̳߳����߳�����Ϊ10.
			 * 
			 * Ĭ���̳߳�����û���̵߳�.ֻ�е��������ʱ�Żᴴ��.
			 * �������������Ҫ<=10 .������10���ֵ��ʱ��.������������ȴ�����.
			 * ���ȴ���������.���������������������״̬.
			 * 
			 */
			threadPool = Executors.newFixedThreadPool(10);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * ����˴���������
	 */
	private void start() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		ChatServer server = new ChatServer(1100);
		server.start();
	}
}
