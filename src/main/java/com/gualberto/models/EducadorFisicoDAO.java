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

public class EducadorFisicoDAO extends BaseDAO {
	boolean returnUser = false;

	public boolean verificaLogin(String login, String senha) throws Exception {
		prepared = conn.prepareStatement("select * from educador_fisico where login = ? AND senha = ?");
		prepared.setString(1, login);
		prepared.setString(2, senha);
		ResultSet rs = prepared.executeQuery();
		if (rs.first()) {
			returnUser = true;
		}
		return returnUser;
	}
	
	public EducadorFisico GET(String login) throws Exception {
		EducadorFisico educadorFisico = new EducadorFisico();
		prepared = conn.prepareStatement("select * from educador_fisico where LOGIN = ?");
		prepared.setString(1, login);
		ResultSet rs = prepared.executeQuery();
		if (rs.first()) {
		educadorFisico.nome =	rs.getString("NOME");
		educadorFisico.ID = rs.getInt("ID");
		}
		return educadorFisico ;
	}
	
	public EducadorFisico UPDATE(String nome, String senha,String login) throws Exception {
		EducadorFisico educadorFisico = new EducadorFisico();
		prepared = conn.prepareStatement("update set NOME = ?, SENHA = ? where LOGIN = ?");
		prepared.setString(1, nome);
		prepared.setString(2, senha);
		prepared.setString(3, login);
		prepared.executeUpdate();
		return educadorFisico ;
	}
}
