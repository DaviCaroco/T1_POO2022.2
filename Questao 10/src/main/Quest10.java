package main;
import java.util.Scanner;
public class Quest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float pi = 3.14F;
        System.out.println("Bem vindo ao Calculando �rea de circulo!");
        System.out.print("Digite o diametro do circulo: ");
        float diame = sc.nextFloat();
        float raio = diame/2;
        System.out.println("O raio do circulo � "+raio+"!");
        float area = pi * (raio * raio);
        System.out.println("O valor d� �rea da circuferencia � "+area+"m�!");
	}
}