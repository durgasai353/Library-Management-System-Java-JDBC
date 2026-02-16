package com.dao.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.util.www.DBConnection;

public class Student {
	public void registerStudent(int id, String name) {
		try {
			Connection con=DBConnection.getConnection();
			String query="insert into stu_reg values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2,name);
			pst.setString(3, "Registered");
			pst.executeUpdate();
			System.out.println("Registration Successfull");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
