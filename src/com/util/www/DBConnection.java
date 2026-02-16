package com.util.www;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
        "jdbc:oracle:thin:@localhost:1521:XE";

    private static final String USER = "system";
    private static final String PASS = "admin";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

