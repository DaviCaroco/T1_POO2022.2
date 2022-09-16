package main;
import java.util.Scanner;
import java.math.*;

public class Quest25 {
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    float custo, convite, qnt, qnt_show;

		    System.out.print("\nDiga quanto custa o Teatro: ");
		    custo = sc.nextFloat();
		    System.out.println("O Teatro custa "+custo+" Reais!");
		    System.out.print("\nDiga quanto custa o Ingresso pro Teatro: ");
		    convite = sc.nextFloat();
		    System.out.println("\nO Ingresso custa "+convite+" Reais!");
		    qnt = custo/convite;
		    qnt_show = ((float) (Math.round(100.0)/100.0));

		    System.out.println("\nA quantidade de convites que precisa ser vendidos para alcançar o lucro é "+qnt_show+" Convites!");
  }
}