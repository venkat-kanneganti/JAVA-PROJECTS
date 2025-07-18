package com.PolyMorphism;

public class JavaPolyEx1 {
	
	
	public void method1() {
		
		System.out.println("method1");
	}
	
	public void method1(String name) {
		
		System.out.println("method1 with String param");
	}
	public void method1(int i) {
		System.out.println("method1 with int param");
		
	}
	
	public void method1(String name,int i) {
		
		System.out.println("method1 with String  int param");
	}
	
public void method1(int i,String name) {
		
		System.out.println("method1 with String  int param");
	}
	
	public static void main(String[] args) {
		
		JavaPolyEx1 jp= new JavaPolyEx1();
		jp.method1(123.0);
		
	}
	

}
