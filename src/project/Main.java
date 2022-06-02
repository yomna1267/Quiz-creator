package project;

import java.sql.*;


public class Main {
    public static void main(String[] args) {
        Connection con = jdbcConnection.getConnection();
        if(con == null){
            System.out.println("Connection failed");
            return;
        }
        else {
            System.out.println("Connection Success");
        }
        login f1 = new login();

    }
}
