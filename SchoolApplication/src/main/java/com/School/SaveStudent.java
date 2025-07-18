package com.School;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SaveStudent extends HttpServlet{

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	
		System.out.println("save method called");
		
		String fname = arg0.getParameter("fname");
		String lname = arg0.getParameter("lname");
		String address = arg0.getParameter("address");
		String phonenum = arg0.getParameter("phonenum");
		String avgmarks = arg0.getParameter("avgmarks");
		
		System.out.println(fname+" "+lname+" "+address+" "+phonenum+" "+avgmarks);
		
		String query="INSERT INTO Student(firstname, lastname, address, avgmarks, phone) VALUES ('"+fname+"','"+lname+"','"+address+"',"+avgmarks+",'"+phonenum+"')";
		
		System.out.println("query-->"+query);
		JDBCConnector jc= new JDBCConnector();
		jc.saveStudent(query);
		
		arg1.sendRedirect("Registration.html");
		
	}
	
}
