package br.com.curso.modelo;

import java.util.Calendar;

public class Servico {

	private Cliente contratante;
	private Funcionario responsavel;
	private Calendar dataDeContratacao;
	
	
	public Servico() {
		System.out.println("Serviço");
	}
	
	
	//*@Override
	//public double calcularTaxa() {
	//	return this.valor * 0.1;
	//*	}
	public double calcularTaxa(){
		return 5;
		
	}

	public Cliente getContratante() {
		return contratante;
	}

	public void setContratante(Cliente contratante) {
		this.contratante = contratante;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}

	public Calendar getDataDeContratacao() {
		return dataDeContratacao;
	}

	public void setDataDeContratacao(Calendar dataDeContratacao) {
		this.dataDeContratacao = dataDeContratacao;
	}

}
