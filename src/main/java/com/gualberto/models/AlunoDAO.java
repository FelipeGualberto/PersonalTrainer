package com.gualberto.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO extends BaseDAO {

	public List<Aluno> GETALL(int id) throws Exception {

		prepared = conn.prepareStatement("select * from aluno where id_educador_fisico=?");
		prepared.setString(1, String.valueOf(id));
		ResultSet rs = prepared.executeQuery();
		List<Aluno> alunolist = new ArrayList<Aluno>();
		while (rs.next()) {
			Aluno aluno = new Aluno();
			aluno.nome = rs.getString("NOME");
			aluno.peso = rs.getInt("PESO");
			aluno.altura = rs.getString("ALTURA");
			alunolist.add(aluno);

		}
		return alunolist;
	}

}
