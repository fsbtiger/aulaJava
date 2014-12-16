package br.com.curso.teste;

import java.util.Calendar;

import br.com.curso.modelo.Cliente;
import br.com.curso.modelo.Emprestimo;
import br.com.curso.modelo.Funcionario;
import br.com.curso.modelo.SeguroVeiculo;
import br.com.curso.modelo.Veiculo;

public class TesteServicos {

	public static void main(String[] args) {

		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setContratante(new Cliente("Bandeira", Calendar.getInstance()));
		emprestimo.setResponsavel(new Funcionario("Glesio Santos"));
		emprestimo.setDataDeContratacao(Calendar.getInstance());
		emprestimo.setValor(10000);
		emprestimo.setTaxa(0.5);
		
		SeguroVeiculo seguroVeiculo = new SeguroVeiculo();
		seguroVeiculo.setContratante(new Cliente("Marta", Calendar.getInstance()));
		seguroVeiculo.setResponsavel(new Funcionario("Bandeira"));
		seguroVeiculo.setDataDeContratacao(Calendar.getInstance());
		seguroVeiculo.setFranquia(0.1);
		seguroVeiculo.setValorSeguroVeiculo(25000);
		seguroVeiculo.setVeiculo(new Veiculo("1234-12", "FIAT", "147"));
		
		System.out.println("Relatorio..........");
		
		System.out.println("Cliente :"+emprestimo.getContratante().getNome()+
				"\nData do serviço: "+emprestimo.getDataDeContratacao().getTime()+
				"\nValor do Serviço: "+emprestimo.getValor()+
				"\nTaxa de serviço: "+emprestimo.calcularTaxa());
		
		System.out.println("Cliente :"+seguroVeiculo.getContratante().getNome()+
				"\nData do Serviço "+seguroVeiculo.getDataDeContratacao().getTime()+
				"\nValor do Serviço :"+seguroVeiculo.getValorSeguroVeiculo()+
				"\nTaxa de serviço: "+seguroVeiculo.calcularTaxa());
	}

}
