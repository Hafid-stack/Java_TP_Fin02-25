package com.enset.java_avance_tp_findemodule.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnection {

    static Connection connection;
    static  {
        try {
            //add your "jdbc:mysql://localhost:your port/your project name","root if your database does not have credentials "," password empty if you dont have credentials"
            connection= DriverManager.getConnection(//add here);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}
