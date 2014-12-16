package br.com.curso.teste;

import br.com.curso.modelo.Gerente;
import br.com.curso.modelo.Secretaria;
import br.com.curso.modelo.Vendedor;

public class TesteFuncionario {
	public static void main(String[] args) {

		Secretaria s = new Secretaria();
		s.setNome("Mary Kelly");
		s.setRamal(208);
		s.setSalario(1000);
		
		Gerente g = new Gerente();
		g.setNome("João Paulo");
		g.setLogin("joão");
		g.setSenha("jo123456");
		g.setSalario(1000);
		
		Vendedor v = new Vendedor();
		v.setNome("Paulo André");
		v.setSalario(1000);
		v.setComisao(100);

		System.out.println("Funcionário :"+s.getNome()+
				"\rSalário final: R$ "+s.bonificacao());
		System.out.println("-------------------------");
		System.out.println("Funcionário :"+g.getNome()+
				"\rSalário final: R$ "+g.bonificacao());
		System.out.println("-------------------------");
		System.out.println("Funcionário :"+v.getNome()+
				"\rSalário final: R$ "+v.bonificacao());
		
	}
	
}
