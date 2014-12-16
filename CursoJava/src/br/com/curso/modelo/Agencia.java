package br.com.curso.modelo;

public class Agencia {

	private int numeroBanco;
	private String nomeBanco;

	public Agencia(int numeroBanco, String nomeBanco) {
		this.numeroBanco = numeroBanco;
		this.nomeBanco = nomeBanco;
	}

	public int getNumeroBanco() {
		return numeroBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

}
