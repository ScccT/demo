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
	//--线程池.
	private ExecutorService threadPool;

	/**
	 * 
	 * @param port 端口号
	 */
	public ChatServer(int port) {
		try {
			serverSocket = new ServerSocket(port);
			maps = new HashMap<>();
			/**
			 * 初始化线程池对象.设定线程池中线程数量为10.
			 * 
			 * 默认线程池中是没有线程的.只有当任务进入时才会创建.
			 * 进入的任务数量要<=10 .当超过10这个值的时候.多余的任务进入等待队列.
			 * 当等待队列满了.后续向进入的任务进入阻塞状态.
			 * 
			 */
			threadPool = Executors.newFixedThreadPool(10);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * 服务端从这里启动
	 */
	private void start() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		ChatServer server = new ChatServer(1100);
		server.start();
	}
}
