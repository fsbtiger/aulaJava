package br.com.curso.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {

	public void registraEntrada(Funcionario funcionario) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("\n---------------------Entrada--------------");
		System.out.println("Funcionário: " + funcionario.getNome());
		System.out.println("Data/Hora: " + sdf.format(agora));

	}

	public void registraSaida(Funcionario funcionario) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date agora = new Date();
		System.out.println("\n------------------------ Saída-------------");
		System.out.println("Funcionário :" + funcionario.getNome());
		System.out.println("Data/Hora: " + sdf.format(agora));

	}

}
