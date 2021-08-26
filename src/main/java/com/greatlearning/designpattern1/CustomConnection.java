package com.greatlearning.designpattern1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
    public static final String USER = "root";
    public static final String PASSWORD = "pluralsight";

    private static Connection connection;

    private CustomConnection() {
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }

        return connection;
    }
}
