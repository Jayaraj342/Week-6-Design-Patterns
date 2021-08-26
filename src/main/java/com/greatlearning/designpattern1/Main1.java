package com.greatlearning.designpattern1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) throws SQLException {
        List<User> users = fetchAllUsers(CustomConnection.getConnection().createStatement());
        System.out.println(users);
    }

    private static List<User> fetchAllUsers(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from user");

        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            User user = User.builder()
                    .userId(resultSet.getInt("userId"))
                    .firstName(resultSet.getString("firstName"))
                    .lastName(resultSet.getString("lastName"))
                    .email(resultSet.getString("email"))
                    .build();

            users.add(user);
        }

        return users;
    }
}
