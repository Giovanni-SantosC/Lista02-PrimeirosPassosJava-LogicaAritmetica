package lista02;

import java.util.Scanner;
import java.lang.Math;

public class Ex9CalculoPotencia {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculo Da Potencia");
		
		System.out.println("Digite a Base: ");
		int base = sc.nextInt();
		
		System.out.println("Digite o Expoente: ");
		int expoente = sc.nextInt();
		
		double potencia = Math.pow(base , expoente);
		
		System.out.println("Sua Potencia de " + base + "Elevado a " + expoente + " é : " + potencia );
		sc.close();
	}
	
}
