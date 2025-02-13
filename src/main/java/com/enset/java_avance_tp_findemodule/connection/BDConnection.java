package com.enset.java_avance_tp_findemodule.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnection {

    static Connection connection;
    static  {
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/java_tp_fin","root","");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}
