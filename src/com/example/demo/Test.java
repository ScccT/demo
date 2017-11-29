package com.example.demo;

public class Test {
	public static void main(String[] args) {
		Season s = Season.SPRING;
		
		switch (s) {
		case SPRING:
			s.showSeason();
			break;
		case SUMMER:
			s.showSeason();
			break;
		case AUTUMN:
			s.showSeason();
			break;
		case WINTER:
			s.showSeason();
			break;
		default:
			break;
		}
		
	}
	

}
