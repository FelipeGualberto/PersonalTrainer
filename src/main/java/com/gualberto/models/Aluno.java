package com.gualberto.models;

public class Aluno {
	int id;
	int id_educador_fisico;
	int peso;
	String altura;
	String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_educador_fisico() {
		return id_educador_fisico;
	}
	public void setId_educador_fisico(int id_educador_fisico) {
		this.id_educador_fisico = id_educador_fisico;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}

}
