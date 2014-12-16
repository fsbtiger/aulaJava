package br.com.curso.teste;

import br.com.curso.modelo.Agencia;
import br.com.curso.modelo.Conta;
import br.com.curso.modelo.Pessoa;

public class TesteConta {

	public static void main(String[] args) {

		Agencia agencia = new Agencia(104, "Caixa Economica Federal");

		Conta a = new Conta(agencia, new Pessoa(
				"Francisco dos Santos Bandeira", 47));
		a.setNumero(100);
		a.setSaldo(1000);

		Conta a1 = new Conta(new Agencia(100, "Bradesco"), new Pessoa(
				"Marta Pereira dos Santos", 31));
		a1.setNumero(101);
		a1.setSaldo(200);

		System.out.println("Cliente " + a.getPessoa().getNome() + "\n"
				+ "Agência" + a.getAgencia().getNumeroBanco() + " - "
				+ a.getAgencia().getNomeBanco() + "\nConta:" + a.getNumero()
				+ " Saldo de R$ " + a.getSaldo());
		System.out.println("\n");
		System.out.println("Cliente " + a1.getPessoa().getNome() + "\n"
				+ "Agência" + a1.getAgencia().getNumeroBanco() + " - "
				+ a1.getAgencia().getNomeBanco() + "\nConta:" + a1.getNumero()
				+ " Saldo de R$ " + a1.getSaldo());

	}
}
