package br.com.curso.modelo;

import org.omg.Messaging.SyncScopeHelper;

public class Emprestimo extends Servico {
	private double valor;
	private double taxa;

	public Emprestimo() {
		System.out.println("Emprestimo...");
	}

	// *@Override
	// public double calcularTaxa() {
	// return this.valor * 0.1;
	// * }

	@Override
	public double calcularTaxa() {
		return super.calcularTaxa() + this.valor * 0.1;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
}