package com.looppgm;

public class Test1 {
	
	int i=0;
	
	public void method1() {
		int k=15;
		
		System.out.println("IN Test and Method1");
		System.out.println("k value is ::"+k);
	}
	
	public void method2() {
		
		System.out.println("i value is ::"+i);
		
	}
	
	public static void main(String[] args) {
		
		
		
	
		Test1 t= new Test1();
		
		System.out.println(t.i);
		t.i=30;
		System.out.println(t.i);
		
	}

}
