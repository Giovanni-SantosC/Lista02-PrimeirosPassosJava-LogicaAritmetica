package lista02;

import java.util.Scanner;

public class MediaPonderada {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Primeria Nota: ");
		double nota01 = sc.nextDouble();
		System.out.println("Digite o Peso da Primeira Nota: ");
		int peso01 = sc.nextInt();
		System.out.println("Digite a Segunda Nota: ");
		double nota02 = sc.nextDouble();
		System.out.println("Digite o Peso da Segunda Nota: ");
		int peso02 = sc.nextInt();
		System.out.println("Digite a Terceira Nota: ");
		double nota03 = sc.nextDouble();
		System.out.println("Digite o peso da Terceira Nota: ");
		int peso03 = sc.nextInt();
		
		double nota = (nota01 * peso01) + (nota02 * peso02) + (nota03 * peso03);
		double peso = (peso01 + peso02 + peso03);
		
		System.out.println("Sua Media Ponderada é: " + nota/peso);
		
		sc.close();
		
	}

}
