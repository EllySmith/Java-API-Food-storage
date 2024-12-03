package com.example.foodmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/foodmanager?socket=/tmp/mysql.sock";
    private static final String USERNAME = "foodmanager"; 
    private static final String PASSWORD = "food123"; 

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected to MySQL database successfully.");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
        return connection;
    }
}

