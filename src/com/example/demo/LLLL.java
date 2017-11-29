package com.example.demo;

public interface LLLL {

	public void method() ;
	enum Test implements LLLL{
		;//--这个分号一定不可以删除.

		@Override
		public void method() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
