package lista02;

import java.util.Scanner;

public class MediaHarmonica {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Primeiro Numero:");
		double numero01 = sc.nextDouble();
		
		System.out.println("Digite o Segundo Numero: ");
		double numero02 = sc.nextDouble();
		
		System.out.println("Digite o Terceiro Numero: ");
		double numero03 = sc.nextDouble();
		
		double mediaHarmonica = 3 / ((1 / numero01) + (1 / numero02) + (1/ numero03));
		
		System.out.println("Sua Media Harmonica é: " + mediaHarmonica);
		
		sc.close();
	}

}
