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
		//--Ϊ��finally�п��Ե��õ���������.
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			try {
				URL url = new URL("https://www.baidu.com");
				
				//--�Ƿ�URL�쳣. ����Э�鲻��,����URL��ʽ����. ������ʱ�쳣.
				//��ȡЭ��
				System.out.println(url.getProtocol());
				//--��ȡ������ַ(�������д��������,��ȡ�ľ�������)
				//--�������д����IP��ַ.��ȡ�ľ���IP��ַ.
				System.out.println(url.getHost());
				//--��ȡ�˿ں�.��û��ָ���˿ں�ʱ����-1
				System.out.println(url.getPort());
				//--���ӵ��û���Ϣ.û��ָ������null			
				System.out.println(url.getUserInfo());
				//Host + Port
				System.out.println(url.getAuthority());
				
				//--����.�Ǵӷ��������ͻ���.���ڿͻ�����˵�����ڴ����������
				//--�ֽ���һ��������ȡͼƬý��ȶ���������.
				is  = url.openStream();
				//--��������ֽ������а�װ.��װ���ַ���
				//--.����ת�������ֽ���ת�����ַ���
				isr = new InputStreamReader(is);
				//--.���ַ������ж��ΰ�װ,��װ�ɻ�����
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
