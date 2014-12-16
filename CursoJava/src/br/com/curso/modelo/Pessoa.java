package br.com.curso.modelo;

import java.util.Calendar;

public class Pessoa {

	private String nome;
	private Calendar dataNascimento;
	private String fone;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

/*
 * public String nome;public String sexo;public int idade;
 * 
 * public Pessoa(String nome, int idade) { this.nome = nome; this.idade = idade;
 * }
 * 
 * public String getNome() { return nome; }
 * 
 * public String getSexo() { return sexo; }
 * 
 * public int getIdade() { return idade; }
 */

