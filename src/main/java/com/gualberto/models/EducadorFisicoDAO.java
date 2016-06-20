package com.gualberto.models;

import com.gualberto.DB.ConnectionFactory;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.Servlet;

public class EducadorFisicoDAO {
	ConnectionFactory connection = new ConnectionFactory();
    Connection conn = connection.getConnection();
    private Statement statement = null;  
    PreparedStatement prepared = null;
    boolean returnUser = false;
    
    public boolean verificaLogin(String login, String senha){
    	try{
    	 prepared = conn.prepareStatement("select * from educador_fisico where login = ? AND senha = ?");
    	}catch(Exception e){
    		 e.printStackTrace();
    		 Logger.getLogger("EducadorFisicoDAO").log(Level.SEVERE, null, e.toString());
    	}
      try {
		prepared.setString(1, login);
		prepared.setString(2, senha);
		ResultSet rs=prepared.executeQuery();
		Logger.getLogger("EducadorFisicoDAO").log(Level.SEVERE, login);
		Logger.getLogger("EducadorFisicoDAO").log(Level.SEVERE, senha);
		
		if(rs.first()){
			returnUser = true;
		}else{
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		Logger.getLogger("EducadorFisicoDAO").log(Level.SEVERE, null, e.toString());
		e.printStackTrace();
	}
      
    	return returnUser;
    }
}
