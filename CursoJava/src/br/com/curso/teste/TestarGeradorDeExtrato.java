package br.com.curso.teste;

import java.util.Calendar;

import br.com.curso.modelo.ContaCorrente;
import br.com.curso.modelo.GeradorDeExtrato;
import br.com.curso.modelo.Poupanca;

public class TestarGeradorDeExtrato {

	public static void main(String[] args) {

		GeradorDeExtrato ge = new GeradorDeExtrato();

		Calendar dataAniversario = Calendar.getInstance();
		dataAniversario.set(1982, 10, 16);

		Poupanca p = new Poupanca();
		p.setSaldo(1000);
		p.setDataAniversario(dataAniversario);

		ContaCorrente cc = new ContaCorrente();
		cc.setLimite(200);
		cc.setSaldo(500);

		// Imprimindo extrato de Pupança
		System.out.println("Extrato da Conta Poupança:");
		ge.imprimirExtratoBasisco(p);

		// Imprimir extrato da Conta Corrente
		System.out.println("Extrato da Conta Correntex:");
		ge.imprimirExtratoBasisco(cc);
	}

}
