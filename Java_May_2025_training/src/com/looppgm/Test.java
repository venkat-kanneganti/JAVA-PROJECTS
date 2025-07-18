package com.looppgm;

public class Test {
	
	
	
	public void method1() {
		
		System.out.println("I am inside method1");
		
	}

public void method2() {
	
	System.out.println("I am inside method2");
}
	
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		int i=10;
		
		Test t1= new Test();
		
		t1.method2();
		t1.method1();
		
		t1.method2();
		
		Test1 t2=new Test1();
		
		t2.method1();
		
	}
	
	


}
