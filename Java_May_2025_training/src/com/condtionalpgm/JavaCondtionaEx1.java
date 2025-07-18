package com.condtionalpgm;

public class JavaCondtionaEx1 {

	
	public static void main(String[] args) {
		
		int time=20;
		
		if(time >0 && time <12) {
			System.out.println("hello good morning");
			System.out.println("how are you");
		}
		else if(time<=12 && time <=17) {
			System.out.println("hello afternoon");
		}
		else if(time<17 && time <=24)
			System.out.println("good evening");
		else
			System.out.println("invalid time");
		
	}
}
