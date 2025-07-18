package com.ClassEx;

public class JavaClassEx1 {
	
	
	public void calRestult(Student s) {
		
		double marks= s.avgmarks;
		
		if(marks <= 35)
			{System.out.println(s.fname+ " "+s.lname+" is Failed ");	}
		else if (marks >35 && marks <=60)
		{System.out.println(s.fname+ " "+s.lname+" is Just passed ");	}
		else if (marks > 60)
		{System.out.println(s.fname+ " "+s.lname+" is  passed with distinction ");	}
			
		
		
	}

public static void main(String[] args) {
	
	Student s1= new Student();
	
	s1.fname="SF1";
	s1.lname="SL1";
	s1.address="ADR1";
	s1.Phnnum="9342342233";
	s1.avgmarks=75.5;
	
	Student s2= new Student();
	s2.fname="SF2";
	s2.lname="SL2";
	s2.address="ADR2";
	s2.Phnnum="90343242";
	s2.avgmarks=55;

	
	Student s3= new Student();
	s3.fname="SF3";
	s3.lname="SL3";
	s3.address="ADR3";
	s3.Phnnum="943535354";
	s3.avgmarks=30;
	
	JavaClassEx1 jc= new JavaClassEx1();
	jc.calRestult(s3);
	
	
	
}

}
