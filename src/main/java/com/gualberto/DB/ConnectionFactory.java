package com.gualberto.DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
    public class ConnectionFactory {
    public Connection getConnection() {
        String driverName = "com.mysql.jdbc.Driver";                        

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            return DriverManager.getConnection(
          "jdbc:mysql://localhost/personaltrainer", "root", "");
        } catch (SQLException e) {
         
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }
    }
}
