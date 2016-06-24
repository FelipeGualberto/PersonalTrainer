package com.gualberto.models;

import java.sql.ResultSet;

public class HistoryAlunoDAO extends BaseDAO {
	
	public HistoryAluno getHistory(int id) throws Throwable {
		HistoryAluno historyAluno = new HistoryAluno();
		prepared = conn.prepareStatement("select * from historico_peso where id_aluno = ?");
		prepared.setString(1, String.valueOf(id));
		ResultSet rs = prepared.executeQuery();
		if (rs.first()) {
		historyAluno.setId_aluno(id);
		historyAluno.setData_medicao(rs.getDate("DATA_MEDICAO"));
		}
		return new HistoryAluno();
	}

}
