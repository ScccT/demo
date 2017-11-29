package com.example.demo02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.RandomAccess;

public class Demo {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.baidu.com/img/bd_logo1.png");
		
		InputStream is = url.openStream();
		RandomAccessFile raf = new RandomAccessFile("¶®ÄãµÄ","rw");
		
		//10000
		//0-1000
		//1001-2000
		
		File file = new File("F:\\°Ù¶È.png");
		OutputStream os = new FileOutputStream(file);
		
		byte[] b = new byte[1024];
		int length = 0;
		while(-1 != (length = is.read(b))) {
			os.write(b,0,length);
		}
		
		os.close();
		is.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
