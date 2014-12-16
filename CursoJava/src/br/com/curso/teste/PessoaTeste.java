package br.com.curso.teste;

import java.util.Calendar;

import br.com.curso.modelo.PessoaFisica;
import br.com.curso.modelo.PessoaJuridica;

public class PessoaTeste {

	public static void main(String[] args) {

		PessoaFisica pf = new PessoaFisica();
		pf.setCpf("999.999.999-99");
		pf.setNome("João Pereira");
		pf.setDataNascimento(Calendar.getInstance());
		pf.setEmail("joao@joao.com");
		pf.setSexo("Masculino");
		pf.setFone("(88)8888.8888");

		PessoaJuridica pj = new PessoaJuridica();
		pj.setCnpj("999.999.999/0001-99");
		pj.setNome("Zumbi Software");
		pj.setDataNascimento(Calendar.getInstance());
		pj.setInscricaoEstadual("ISENTO");
		pj.setFone("(86)8888.8888");

		System.out.println("Nome: " + pf.getNome() + " CPF " + pf.getCpf()+ " Fone:"+pf.getFone());
		System.out.println("Nome: " + pj.getNome() + " CNPJ " + pj.getCnpj()
				+ " Fone:" + pj.getFone());

	}
}
