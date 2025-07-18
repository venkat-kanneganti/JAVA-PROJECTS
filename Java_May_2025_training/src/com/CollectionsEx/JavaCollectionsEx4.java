package com.CollectionsEx;

import java.util.ArrayList;

public class JavaCollectionsEx4 {

	public void calResult(ArrayList<Student> sdata) {
		
		System.out.println(sdata);
		
		for(Student s:sdata) {
			
			 double marks= s.getAvgmarks();
			
			 if(marks<=35)
				 System.out.println(s.getFname()+" "+s.getLname()+" is failed");
			 else if(marks>35 && marks <=60)
				 System.out.println(s.getFname()+" "+s.getLname()+" is just passed");
			 else if(marks>60 && marks <=100)
				 System.out.println(s.getFname()+" "+s.getLname()+" is passed with distinction");
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setFname("SF1");
		s1.setLname("SL1");
		s1.setEmail("S1@gmail.com");
		s1.setAvgmarks(65);
		
		Student s2=new Student();
		s2.setFname("SF2");
		s2.setLname("SL2");
		s2.setEmail("S2@gmail.com");
		s2.setAvgmarks(80);
		
		Student s3=new Student();
		s3.setFname("SF3");
		s3.setLname("SL3");
		s3.setEmail("S3@gmail.com");
		s3.setAvgmarks(40);
		
		Student s4=new Student();
		s4.setFname("SF4");
		s4.setLname("SL4");
		s4.setEmail("S4@gmail.com");
		s4.setAvgmarks(30);
		
		Student s5=new Student();
		s5.setFname("SF5");
		s5.setLname("SL5");
		s5.setEmail("S5@gmail.com");
		s5.setAvgmarks(50);
		
		Student s6=new Student();
		s6.setFname("SF6");
		s6.setLname("SL6");
		s6.setEmail("S6@gmail.com");
		s6.setAvgmarks(25);
		
		Student s7=new Student();
		s7.setFname("SF7");
		s7.setLname("SL7");
		s7.setEmail("S7@gmail.com");
		s7.setAvgmarks(45);
		
		
		
		ArrayList<Student> sdata= new ArrayList();
		sdata.add(s1);
		sdata.add(s2);
		sdata.add(s3);
		sdata.add(s4);
		sdata.add(s5);
		sdata.add(s6);
		sdata.add(s7);
		
		
		
		JavaCollectionsEx4 j4= new JavaCollectionsEx4();
		j4.calResult(sdata);
		
		
	}
}
