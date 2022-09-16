package main;

import java.util.Scanner;
import java.math.BigDecimal;

public class Quest3 {

	public static void main(String[] args) {
		Scanner q3 = new Scanner(System.in);
        
        int ps1, ps2, ps3;
        
        float nt1, nt2, nt3;
        
        int controlador;

        do {
        System.out.println();
        System.out.println("Digite sua primeira nota e o peso dela =D");
        nt1 = q3.nextFloat();
        ps1 = q3.nextInt();
        System.out.println();

        System.out.println("Digite sua segunda nota e o peso dela =D");
        nt2 = q3.nextFloat();
        ps2 = q3.nextInt();
        System.out.println();

        System.out.println("Digite sua terceira nota e o peso dela =D");
        nt3 = q3.nextFloat();
        ps3 = q3.nextInt();
        System.out.println();

        double md = (((nt1 * ps1) + (nt2 * ps2) + (nt3 * ps3)) / (ps1 + ps2 + ps3));
        double med = (double) (Math.round(md*100.0)/100.0);
        System.out.println("Sua média é: " + med);

        System.out.println();
        System.out.println("Para voltar ao início digite [0]");
        controlador = q3.nextInt();
        System.out.println("--------------------------------------------------------------------------------------------");
        
        }while(controlador == 0);
        if(controlador == 1) {
        	System.out.println("Isso é tudo pessoal!!!");
        }else {
        	System.out.println("ERROR!!!"
        			+ "\nREINICIE O PROGRAMA!");
        }

	}

}
