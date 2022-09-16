package main;

import javax.swing.JOptionPane;
import java.lang.Double;

public class Quest22 {

	public static void main(String[] args) {
		double salario_min, quantd_kw, valor_kw, valor_reais, valor_desc, desc;
		int controlador;
		
		do {
		String inicial = JOptionPane.showInputDialog(null, "Digite o valor do salário mínimo atual: ");
		String watts  = JOptionPane.showInputDialog(null, "Digite o seu gasto de energia em quilowatts: ");
		
		salario_min = Double.parseDouble(inicial);
		quantd_kw = Double.parseDouble(watts);
		
		valor_kw = salario_min / 5;
		valor_reais  = valor_kw * quantd_kw;
		desc = valor_reais * 15/100;
		valor_desc = valor_reais - desc;
		
		JOptionPane.showMessageDialog(null, "Cada quilowatt lhe custa R$" + valor_kw);
		JOptionPane.showMessageDialog(null, "O valor a ser pago pelo gasto dessa casa é R$" + valor_reais);
		JOptionPane.showMessageDialog(null, "Mas como você tem um desconto de 15%, só pagará R$ " + valor_desc);
		
		String saindo = JOptionPane.showInputDialog(null, "Para calcular novamente digite [0]"
				+ "\nSe você quer sair digite [1]");
		controlador = Integer.parseInt(saindo);
		System.out.println("------------------------------------------------------------------------------");

		} while(controlador == 0);
		if(controlador == 1) {
			JOptionPane.showMessageDialog(null, "Isso é tudo pessoal");
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR!!!"
					+ "\nREINICIE O PROGRAMA!");
		}

	}

}
