package com.ClassEx;

public class JavaClassEx2 {
	
	
public void calRestult(Student s) {
		
		double marks= s.getAvgmarks();
		
		if(marks <= 35)
			{System.out.println(s.getFname()+ " "+s.getLname()+" is Failed ");	}
		else if (marks >35 && marks <=60)
		{System.out.println(s.getFname()+ " "+s.getLname()+" is Just passed ");	}
		else if (marks > 60)
		{System.out.println(s.getFname()+ " "+s.getLname()+" is  passed with distinction ");	}
			
		
		
	}


	
	public static void main(String[] args) {
		
		Student s1= new Student();
		
		s1.setFname("SF1");
		s1.setLname("SL1");
		s1.setAddress("Adr1");
		s1.setPhnnum("90234234234");
		s1.setAvgmarks(75);
		
		Student s2= new Student();
		s2.setFname("SF2");
		s2.setLname("SL2");
		s2.setAddress("Adr2");
		s2.setPhnnum("90909877");
		s2.setAvgmarks(65);
		
		Student s3= new Student();
		s3.setFname("SF3");
		s3.setLname("SL3");
		s3.setAddress("Adr3");
		s3.setPhnnum("99887765");
		s3.setAvgmarks(30);
		
		JavaClassEx2 jc= new JavaClassEx2();
		jc.calRestult(s1);
		
	}

}
