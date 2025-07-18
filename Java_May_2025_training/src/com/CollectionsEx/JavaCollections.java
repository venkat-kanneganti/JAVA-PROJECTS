package com.CollectionsEx;

import java.util.ArrayList;

public class JavaCollections {
	
public void printValues(ArrayList al) {
	
	System.out.println("from printValues");
	System.out.println(al);
}
	
	public static void main(String[] argsz) {


		ArrayList al= new ArrayList();
		
		al.add(123);
		al.add(70);
		al.add(15.5);
		al.add("sravan");
		al.add(91);
		al.add(123);
		
		JavaCollections jc= new JavaCollections();
		jc.printValues(al);
		
	}

}
