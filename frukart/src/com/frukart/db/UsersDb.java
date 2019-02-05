package com.frukart.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersDb {

	public void adduser(String name, String password, String mobile, String place) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/frukart", "postgres","onkar@1993");
		PreparedStatement pstmt = conn.prepareStatement("insert into  users.customer values(?,?,?,?);");
		System.out.println(name+password+mobile+place);
		pstmt.setString(1, name);
		pstmt.setString(2, password);
		pstmt.setString(3, mobile);
		pstmt.setString(4, place);
		pstmt.executeUpdate();
		

	}

}
