package com.example.demo;

public enum Season implements LLLL{
	/*
	 * ÿһ����������Season���͵Ķ���.�ȼ��� new Season()
	 * ����ÿһ�����Ǿ�̬����.
	 */
	SPRING("����"),SUMMER("�ļ�"),AUTUMN("�＾"),WINTER("����");
	
	/*
	 * Illegal modifier for the enum constructor; only private is permitted.
	 * ֻ��˽�к�Ĭ�Ͽ�����������ö�ٵĹ��췽��.
	 */
	
	private String name;
	
	private Season() {
		
	}
	private Season(String name) {
		this.name = name;
	}
	
	public void showSeason() {
		System.out.println(name);
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}
