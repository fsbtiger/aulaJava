package br.com.curso.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GeradorDeExtrato {
	
	public void imprimirExtratoBasisco(Conta conta){
		
		SimpleDateFormat formatarData = 
				new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar agora = Calendar.getInstance();
		
		System.out.println("Saldo: R$"+conta.getSaldo()+
				"- "+formatarData.format(agora.getTime()));
	}

}
