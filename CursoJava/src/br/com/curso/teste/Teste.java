package br.com.curso.teste;
import javax.swing.JOptionPane;

public class Teste {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomeFuncionario[] = new String[5];
		String sexo[] = new String[5];
		double salario[] = new double[5];
		int anoNasc[] = new int[5];
		int idade[] = new int[5];
		int anoAtual;

		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Ano atual:"));

		for (int i = 0; i < 5; i++) {

			nomeFuncionario[i] = JOptionPane.showInputDialog("Funcionário:");
			sexo[i] = JOptionPane.showInputDialog("Selecione: M - Masculino"
					+ " F - Feminino");

			salario[i] = Double.parseDouble(JOptionPane
					.showInputDialog("salario:"));

			anoNasc[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Ano de Nascimento:"));

			switch (sexo[i]) {
			case "M":
				idade[i] = anoAtual - anoNasc[i];

				if (idade[i] >= 30)
					salario[i] = salario[i] + 100;
				else
					salario[i] = salario[i] + 50;

				break;

			case "F":
				idade[i] = anoAtual - anoNasc[i];

				if (idade[i] >= 30)
					salario[i] = salario[i] + 200;
				else
					salario[i] = salario[i] + 80;

				break;

			default:
				System.out.println("Opção inválida");
				break;
			}

		}
		for (int i = 0; i < 5; i++) {
			System.out.println("*******************************");
			System.out.println("Funcionário:"+nomeFuncionario[i]);
			System.out.println("Salário:"+salario[i]);
			System.out.println("Idade: "+idade[i]);
		}
	}

}
