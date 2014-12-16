package br.com.curso.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = new String("Joao Carlos");
		String nome2 = "Carlos";
		String nomes ="Maria,Carlos,Alberto,Pereira";
		// PRINCIPAIS METODOS
		
		// Contar a quantidade de caracteres numa String
		System.out.println(nome.length());
		
		// Converter uma palavra em MAIUSCULA
		System.out.println(nome.toUpperCase());
		
		// Converter uma palavra em MINUSCULA
		System.out.println(nome.toLowerCase());
		
		// UTILIZADO PARA REMOVER ESPAÇO NO INICIO E FIM
		System.out.println(nome.trim());
		
		// DIVIDI UMA STRING EM VÁRIAS PARTES DE ACORDO COM O DEMILITADOR, NESSE CASO A VIRGULA
		String[] exemploSplit = nomes.split(",");
	   
		System.out.println(exemploSplit[3]);

	   // PARA SUBSTITUIR OS CARACTERES
		System.out.println(nome2.replace("a", "@"));
		
	}
}
