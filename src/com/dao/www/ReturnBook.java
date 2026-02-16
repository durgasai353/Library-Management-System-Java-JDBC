package com.dao.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.www.DBConnection;

public class ReturnBook {

    public void returnBook(int returnId, int issueId) {

        String getBookId =
            "SELECT book_id FROM issue_table WHERE issue_id=?";

        String insertReturn =
            "INSERT INTO return_table (return_id, issue_id, return_date) " +
            "VALUES (?, ?, SYSDATE)";

        String updateBook =
            "UPDATE books SET status='Available' WHERE book_id=?";

        try (Connection con = DBConnection.getConnection()) {

            // 1️⃣ Find Book ID from Issue Table
            PreparedStatement pst1 = con.prepareStatement(getBookId);
            pst1.setInt(1, issueId);

            ResultSet rs = pst1.executeQuery();

            int bookId = 0;

            if (rs.next()) {
                bookId = rs.getInt("book_id");
            } else {
                System.out.println("❌ Invalid Issue ID!");
                return;
            }

            // 2️⃣ Insert Return Record
            PreparedStatement pst2 = con.prepareStatement(insertReturn);
            pst2.setInt(1, returnId);
            pst2.setInt(2, issueId);
            pst2.executeUpdate();

            // 3️⃣ Update Book Status to Available
            PreparedStatement pst3 = con.prepareStatement(updateBook);
            pst3.setInt(1, bookId);
            pst3.executeUpdate();

            System.out.println("✅ Book Returned Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
