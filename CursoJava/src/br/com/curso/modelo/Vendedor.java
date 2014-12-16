package br.com.curso.modelo;

public class Vendedor extends Funcionario {

	private double comisao;

	@Override
	public double bonificacao() {
		return super.bonificacao() + this.comisao;

	}

	public double getComisao() {
		return comisao;
	}

	public void setComisao(double comisao) {
		this.comisao = comisao;
	}
}
