package br.com.curso.modelo;

public class Gerente extends Funcionario {

	private String login;
	private String senha;

	@Override
	public double bonificacao() {
		return this.getSalario() + this.getSalario() * 0.3 + 100;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
