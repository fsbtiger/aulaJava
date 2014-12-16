package br.com.curso.teste;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.curso.modelo.Calculadora;


public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b , resultado=0;
		
		int opcao;
		
		Calculadora calc = new Calculadora();
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor: "));

		opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione 1-Somar |2-Subtrair | 3-Multiplicar | 4-Dividir:"));
																	
		switch (opcao) {
		case 1:
			resultado = calc.somar(a,b);
		break;
		
		case 2:
			resultado = calc.subtrair(a,b);
		break;
		
		case 3:
			resultado = calc.multiplicar(a,b);
		break;
		
		case 4:
			resultado = calc.dividir(a,b);
		break;
		
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida");
		}
																 
		JOptionPane.showMessageDialog(null, "Resultado :"+resultado);             
		
		
		//System.out.println(calc.somar(4,8));
		//System.out.println(calc.subtrair(4.5,10));
		//System.out.println(calc.multiplicar(4.5,10));
		//System.out.println(calc.dividir(5, 6));

	}
}
