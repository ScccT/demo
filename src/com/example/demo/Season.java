package com.example.demo;

public enum Season implements LLLL{
	/*
	 * 每一个常量都是Season类型的对象.等价于 new Season()
	 * 它们每一个都是静态常量.
	 */
	SPRING("春季"),SUMMER("夏季"),AUTUMN("秋季"),WINTER("冬季");
	
	/*
	 * Illegal modifier for the enum constructor; only private is permitted.
	 * 只有私有和默认可以用于修饰枚举的构造方法.
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
