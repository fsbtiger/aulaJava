package br.com.curso.teste;

import br.com.curso.modelo.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p = new Pessoa("Francisco Bandeira", 47);
		p.sexo = "Masculino";

		Pessoa p1 = new Pessoa("Marta Santos", 32);
		p1.sexo = "Feminino";

		/*
		 * System.out.println("Nome "+p.nome);
		 * System.out.println("Sexo: "+p.sexo);
		 * System.out.println("Idade: "+p.idade);
		 */

		System.out.println("Nome:" + p.nome + " do sexo " + p.sexo
				+ " e possue a " + "idade de " + p.idade + " anos");

		System.out.println("Nome:" + p1.nome + " do sexo " + p1.sexo
				+ " e possue a " + "idade de " + p1.idade + " anos");

	}

}
