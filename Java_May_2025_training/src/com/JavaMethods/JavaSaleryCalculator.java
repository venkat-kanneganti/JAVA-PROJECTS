package com.JavaMethods;

public class JavaSaleryCalculator {
	
	
	
	public void calNetSalery(double gsal) {
		
		double ins=2500;
		double itax= (gsal*10)/100;
		double ptax=500;
		
		double netsal=gsal-ins-itax-ptax;
		System.out.println(netsal);
		
		
	
	}
	
	
	public double calGrossSalery(double bsal) {
		
		
		
		
		double hra =  (bsal*12)/100;
		System.out.println("HRA is "+hra);
		

		double da =  (bsal*17)/100;
		System.out.println("DA is "+da);
		
		double gsal=bsal+hra+da+2500;
		
		System.out.println("Gorss salery is "+gsal);
		
		
		return gsal;
	}
	
	public static void main(String[] args) {
		
		JavaSaleryCalculator js= new JavaSaleryCalculator();
		js.calGrossSalery(15000);
		
		
	}

}
