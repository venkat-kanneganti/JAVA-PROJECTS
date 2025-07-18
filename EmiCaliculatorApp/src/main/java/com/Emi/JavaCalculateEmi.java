package com.Emi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JavaCalculateEmi extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		System.out.println("Inside Service method");
		String loanamt=  arg0.getParameter("loanamt");
		String tenure=  arg0.getParameter("tenure");
		String rate=  arg0.getParameter("rate");
		
		System.out.println(loanamt+" "+tenure+" "+rate);
		
		try{
			double loaamti= Double.parseDouble(loanamt);
			double tenurei= Double.parseDouble(tenure);
			double ratei= Double.parseDouble(rate);
			
			double emi=(loaamti*ratei)/tenurei;
			
			System.out.println("loan EMI is "+emi);
			
			PrintWriter pw= arg1.getWriter();
			pw.println("loan EMI is "+emi);
		}catch (Exception e) {
			e.printStackTrace();
			PrintWriter pw= arg1.getWriter();
			pw.println("invalid input. Please check");
			
		}
		
		
		
	}

}
