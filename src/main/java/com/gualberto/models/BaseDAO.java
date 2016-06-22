package com.gualberto.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.gualberto.DB.ConnectionFactory;

public class BaseDAO {
	public ConnectionFactory connection = new ConnectionFactory();
    public Connection conn = connection.getConnection();
    public  Statement statement = null;  
    public PreparedStatement prepared = null;
}
