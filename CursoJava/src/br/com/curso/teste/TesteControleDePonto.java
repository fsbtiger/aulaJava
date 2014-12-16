package br.com.curso.teste;

import br.com.curso.modelo.ControleDePonto;
import br.com.curso.modelo.Gerente;
import br.com.curso.modelo.Secretaria;

public class TesteControleDePonto {

	public static void main(String[] args) {

		ControleDePonto control = new ControleDePonto();

		Secretaria sec = new Secretaria();
		sec.setNome("Ana Maria");
		sec.setRamal(208);
		sec.setSalario(800);

		control.registraEntrada(sec);
		control.registraSaida(sec);

		Gerente gerente = new Gerente();
		gerente.setNome("João Antônio");
		gerente.setSalario(1000);

		control.registraEntrada(gerente);
		control.registraSaida(gerente);
	}

}
