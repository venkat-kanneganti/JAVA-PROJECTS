package com.CollectionsEx;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaCollectionsEx2 {
	
	
	
public void printValues(HashSet al) {
	
	System.out.println("from printValues");
	System.out.println(al);
}
	

	public static void main(String[] args) {
		

		HashSet al= new HashSet();
		
		al.add(123);
		al.add(70);
		al.add(15.5);
		al.add("sravan");
		al.add(91);
		al.add(123);
		
		
		JavaCollectionsEx2 jc= new JavaCollectionsEx2();
		jc.printValues(al);
		
	}
	
}
