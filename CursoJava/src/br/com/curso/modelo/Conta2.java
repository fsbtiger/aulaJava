package br.com.curso.modelo;

public class Conta2 {

	private int numero;
	private double saldo;
	private Agencia agencia;
	private Pessoa pessoa;

	public Conta2(Agencia agencia, Pessoa pessoa) {
		this.agencia = agencia;
		this.pessoa = pessoa;
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void transferir(Conta2 destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}

	// MÉTODOS GET E SET

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
}
