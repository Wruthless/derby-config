package org.wruthless;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String urlConnection = "jdbc:derby:wruthless";
        Connection con = DriverManager.getConnection(urlConnection);
        Statement statement = con.createStatement();
        String sql = "CREATE TABLE authors (id INT PRIMARY KEY,first_name VARCHAR(255),last_name VARCHAR(255))";
        statement.execute(sql);
        sql = "INSERT INTO authors VALUES (1, 'arash','ariani')";
        statement.execute(sql);

    }
}