package com.Exception;

public class JavaExceptionsEx2 {
	
	public void wishmessage() {
		
		System.out.println("good morning");
	}
	
	public void arthematicOp(int i,int j) throws Exception{
		
			System.out.println(i/j);
		
	}
	
	public static void main(String[] args) {
		
		
		JavaExceptionsEx2 je= new JavaExceptionsEx2();
		try {
		je.arthematicOp(20, 0);
		}catch (Exception e) {
		e.printStackTrace();
		}
		je.wishmessage();
		System.out.println("execution completed");
		
		
	}

}
