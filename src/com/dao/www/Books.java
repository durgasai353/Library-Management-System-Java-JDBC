package com.dao.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.www.DBConnection;

public class Books {
public void insertBook(int bid,String bname,String bgenere) {
	try {
	Connection con = DBConnection.getConnection();
	String query="insert into books values(?,?,?,?)";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setInt(1, bid);
	pst.setString(2, bname);
	pst.setString(3, bgenere);
	pst.setString(4, "Available");
	pst.executeUpdate();
	System.out.println("Inserted Successfully");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	public void retrieveBooks() {
		String query = "SELECT * FROM books";

	    try (Connection con = DBConnection.getConnection();
	         PreparedStatement pst = con.prepareStatement(query);
	         ResultSet rs = pst.executeQuery()) {

	        System.out.println("-------Books in Library--------");

	        while (rs.next()) {
	            System.out.println(
	                rs.getInt(1) + " | " +
	                rs.getString(2) + " | " +
	                rs.getString(3) + " | " +
	                rs.getString(4)
	            );
	        }
	    }
		catch(Exception e) {
			e.printStackTrace();
		}

}
}
