package br.com.curso.teste;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class ValidarData {

	public static void main(String[] args) {

		Calendar diaAtual = Calendar.getInstance();

		String dataInfo = JOptionPane.showInputDialog("Informe a data");

		int dia, mes, ano;

		dia = Integer.parseInt(dataInfo.substring(0, 2));
		mes = Integer.parseInt(dataInfo.substring(3, 5));
		ano = Integer.parseInt(dataInfo.substring(6, 10));

		Calendar dataInfoUser = Calendar.getInstance();
		dataInfoUser.set(ano, mes - 1, dia);

		int comparaData = diaAtual.compareTo(dataInfoUser);

		if (comparaData == 0 || comparaData == -1) {
			JOptionPane.showMessageDialog(null, "Data inferior ou  igual a"
					+ "data atual");
		} else {
			JOptionPane.showConfirmDialog(null, "Inserir uma data futura");
		}

	}
}
