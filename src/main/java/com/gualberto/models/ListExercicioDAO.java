package com.gualberto.models;

import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gualberto.personaltrainer.LoginController;

public class ListExercicioDAO extends BaseDAO {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	public ListaExercicio getById(int id) throws Throwable {
		ListaExercicio listaExercicio = new ListaExercicio();
		prepared = conn.prepareStatement(getSql());
		prepared.setString(1, String.valueOf(id));
		ResultSet rs = prepared.executeQuery();
		if (rs.first()) {
			listaExercicio.setID(rs.getString("ID"));
			listaExercicio.setID(rs.getString("EXERCICIO_1"));
			listaExercicio.setID(rs.getString("EXERCICIO_2"));
			listaExercicio.setID(rs.getString("EXERCICIO_3"));
			listaExercicio.setID(rs.getString("EXERCICIO_4"));
			listaExercicio.setID(rs.getString("EXERCICIO_5"));
			listaExercicio.setID(rs.getString("EXERCICIO_6"));
			listaExercicio.setID(rs.getString("EXERCICIO_7"));
			listaExercicio.setID(rs.getString("EXERCICIO_8"));
			listaExercicio.setID(rs.getString("NOME"));
		}
		return new ListaExercicio();
	}

	private String getSql() {
		return new SQL() {
			{
				SELECT("*");
				FROM("lista_exercicios");
				WHERE("id = ?");
			}
		}.toString();
	}
}
