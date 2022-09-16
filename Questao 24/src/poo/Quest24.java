package poo;
import javax.swing.JOptionPane;
import java.math.BigDecimal;
public class Quest24 {
	
	public static void main(String[] args) {
		double hora, h, m, conversao;
		int controlador;
				
		JOptionPane.showMessageDialog(null, "Olá, vou te ajudar a saber os minutos de acordo "
						+ "\ncom a hora que digitar."
						+ "\nDigite a hora e os minutos separados por [ . ].");
		do {
			String receberHora  = JOptionPane.showInputDialog(null, "Digite a hora e os minutos");
				
			hora = Double.parseDouble(receberHora);                                                                                         
			h = Math.ceil(hora);
			m = hora - h;
			conversao = (h*60) + (m*100);
			conversao = (double)(Math.round(conversao*100.0)/100.0);
				
			JOptionPane.showMessageDialog(null, "A hora que você digitou equivale a " + conversao + " minutos.");
				
			String saindo = JOptionPane.showInputDialog(null, "Para calcular novamente digite [0]"
						+ "\nSe você quer sair digite [1]");
			controlador = Integer.parseInt(saindo);
			System.out.println("------------------------------------------------------------------------------");
				
				}while(controlador == 0);
				if(controlador == 1){
					JOptionPane.showMessageDialog(null, "Isso é tudo pessoal");
				}
				else {
					JOptionPane.showMessageDialog(null, "ERROR!!!"
							+ "\nREINICIE O PROGRAMA!");
				}
			
	}
}
