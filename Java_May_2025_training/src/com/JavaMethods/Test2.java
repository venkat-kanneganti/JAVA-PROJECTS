package com.JavaMethods;

public class Test2 {

	public static void main(String[] args) {
		
		
		JavaSaleryCalculator js=new JavaSaleryCalculator();
		
		double gssal= js.calGrossSalery(55000);
		
		js.calNetSalery(gssal);
		
		
	}
	
	
	
}
