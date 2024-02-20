package com.hibernate.example.entity;

import java.sql.*;

public class TestConnection {
    public static void main(String ar[]){
        final String url = "jdbc:postgresql://localhost/postgres";
        final String user = "postgres";
        final String password = "root";
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {System.out.println(e.getMessage());}
        try{
            String u="abc";
            String p="abc123";
            statement = conn.createStatement();
            String SQLQuery = "SELECT username, password from login where username = '"+u+"'and password = '"+p+"' ";
            rs = statement.executeQuery(SQLQuery);
            while (rs.next()) {
                String uname = rs.getString("username");
                String pas = rs.getString("password");
                System.out.println( uname +" " + pas );
            }
        }
        catch(Exception b){
            System.out.println(b.getMessage());
        }

    }
}
