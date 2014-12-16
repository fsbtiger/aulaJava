package br.com.curso.modelo;

public class Veiculo {

	private String placa;
	private String fabricante;
	private String modelo;

	public Veiculo(String placa, String fabricante, String modelo) {
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

}
