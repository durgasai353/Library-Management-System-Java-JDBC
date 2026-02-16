package com.dao.www;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.util.www.DBConnection;

public class BookIssue{

    public void issueBook(int issueId, int stuId, int bookId) {
    	 String query1="UPDATE books SET status='Issued' WHERE book_id=?";
    	 String query2= "INSERT INTO issue_table VALUES (?, ?, ?, SYSDATE)";
    	 try (Connection con = DBConnection.getConnection();
                 PreparedStatement pst1 = con.prepareStatement(query1);
    			 PreparedStatement pst2 = con.prepareStatement(query2)){
            pst1.setInt(1, bookId);
            pst1.executeUpdate();
            pst2.setInt(1, issueId);
            pst2.setInt(2, stuId);
            pst2.setInt(3, bookId);

            pst2.executeUpdate();

            System.out.println("✅ Book Issued Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
