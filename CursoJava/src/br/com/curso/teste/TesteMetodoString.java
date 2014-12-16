package br.com.curso.teste;

import javax.swing.JOptionPane;

import br.com.curso.modelo.Pessoa;

public class TesteMetodoString {

	public static void main(String[] args) {

		String nomePessoa = JOptionPane.showInputDialog("Insira seu nome").trim();

		if (nomePessoa.length() < 5) {
			JOptionPane.showMessageDialog(null,
					"Quantidade inferior a 5 digitos");
		} else {

			int idade = Integer.parseInt(JOptionPane
					.showInputDialog("Digite a idade"));

			Pessoa pessoa = new Pessoa(nomePessoa, idade);

			JOptionPane.showMessageDialog(null, pessoa.getNome());
		}

	}
}
