package com.ArraysEx;

public class JavaArraysEx2 {
	
	
	public void printNumbers(int array[]) {
		
		System.out.println(array[3]);
	}
	
	
	public static void main(String[] args) {
		
		int i=10;
		int k=20;
		int j=45;
		int h=90;
		int l=80;
		int n=33;
		int v=10;
		
		
		int arr[] = new int[7];
		
		arr[0]=i;
		arr[1]=k;
		arr[2]=j;
		arr[3]=h;
		arr[4]=l;
		arr[5]=n;
		arr[6]=v;
		
		arr[8]=50;
		
		JavaArraysEx2 ja= new JavaArraysEx2();
		ja.printNumbers(arr);
		
		
	}

}
