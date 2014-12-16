package br.com.curso.modelo;

import java.util.Calendar;

public class Poupanca extends Conta {

	private Calendar dataAniversario;

	public Calendar getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Calendar dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

}
