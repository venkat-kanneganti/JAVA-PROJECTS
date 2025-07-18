package com.StaticEx;

public class JavaStaticEx {
	
	
	static {
		
		System.out.println("inside static block");
	}
	
	public static int k=100;
	
	public static void method1() {
		
		System.out.println("method 1");
	}
		
	
	public static void main(String[] args) {
		JavaStaticEx.method1();
		JavaStaticEx.method1();
		System.out.println(JavaStaticEx.k);
	}

}
