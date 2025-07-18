package com.School;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCConnector {
	
	public void saveStudent(String query) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "Password@1");
		
		PreparedStatement ps= con.prepareStatement(query);
		ps.execute();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readStudent(String query) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "Password@1");
		
		PreparedStatement ps= con.prepareStatement(query);
		ResultSet rs=  ps.executeQuery();
		System.out.println("got RS object");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
