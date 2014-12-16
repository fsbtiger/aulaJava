package br.com.curso.modelo;

import java.util.Calendar;

public class Cliente {

	private String nome;
	private Calendar dataNascimento;

	public Cliente(String nome, Calendar dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

}
