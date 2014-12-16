package br.com.curso.teste;

import javax.swing.JOptionPane;

import br.com.curso.modelo.Usuario;

public class TesteLogin {

	public static void main(String[] args) {

	Usuario usuario = new Usuario("bandeira", "123456");
	
	String login, senha;
	
	login = JOptionPane.showInputDialog("Digite o login: ");
	senha = JOptionPane.showInputDialog("Digite a senha: ");
	
	if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha))
		JOptionPane.showMessageDialog(null, "Usuario logado");
	else
		JOptionPane.showMessageDialog(null, "Login ou senha inválida");
	
	}

}
