package lista02;

import java.util.Scanner;
import java.lang.Math;

public class MediaGeometrica {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Numero: ");
		double numero01 = sc.nextDouble();
		System.out.println("Digite o Segundo Numero: ");
		double numero02 = sc.nextDouble();
		System.out.println("Digite o Terceiro Numero: ");
		double numero03 = sc.nextDouble();
		
		double multiplicacao = numero01 * numero02 * numero03;
		double mediaGeometrica = Math.cbrt((multiplicacao));
		
		System.out.println(multiplicacao);
		System.out.println(numero01);
		System.out.println(numero02);
		System.out.println(numero03);
		
		System.out.printf("Sua Media Geomtrica é: %.2f",mediaGeometrica);
		
		sc.close();
		
	}

}
