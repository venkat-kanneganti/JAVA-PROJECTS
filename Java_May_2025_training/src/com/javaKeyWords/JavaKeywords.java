package com.javaKeyWords;

public class JavaKeywords extends JavaKeywords2 {
	
	final int i=10;
	
	
	public void test1() {
		
		System.out.println("inside test 1");
	}
	
	public static void main(String[] args) {
		
		System.out.println("hello good morning");
		JavaKeywords jk= new JavaKeywords();
		
		
		System.out.println(jk.i);
		
	}

}
