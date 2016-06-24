package com.gualberto.models;

import java.util.Date;

public class HistoryAluno {
	private int id_aluno;
	private int peso;
	private Date data_medicao;
	public int getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Date getData_medicao() {
		return data_medicao;
	}
	public void setData_medicao(Date data_medicao) {
		this.data_medicao = data_medicao;
	}

}
