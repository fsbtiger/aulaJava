package br.com.curso.teste;

import java.util.Calendar;
import java.util.Date;

public class TrabalhandoComData {

	public static void main(String[] args) {

		// Date dataAtual = new Date();

		// System.out.println(dataAtual);

		Calendar agora = Calendar.getInstance();

		// System.out.println(agora.getTimeInMillis());
		System.out.println(agora.getTime());
		System.out.println("Dia: " + agora.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês: " + (agora.get(Calendar.MONTH) + 1));
		System.out.println("Ano: " + agora.get(Calendar.YEAR));

		// System.out.println(agora.getTimeZone());

		// Alterando a data do Nascimento
		Calendar dataNasc = Calendar.getInstance();
		// dataNasc.set(Calendar.DAY_OF_MONTH, 07);
		// dataNasc.set(Calendar.MONTH, 06);
		// dataNasc.set(Calendar.YEAR, 1967);

		dataNasc.set(1967, Calendar.JUNE, 07);
		
		// Comparando datas
		System.out.println("Comparando: "+dataNasc.compareTo(agora));
		System.out.println("Comparando: "+agora.compareTo(dataNasc));

		System.out.println(dataNasc.getTime());
		
		// Calculando dias
		
		int dias = 10;
		
		agora.add(Calendar.DAY_OF_MONTH, dias);
		
		System.out.println("Com acrescimo "+agora.getTime());
		System.out.println("A semana "+agora.DAY_OF_WEEK);

	}

}
