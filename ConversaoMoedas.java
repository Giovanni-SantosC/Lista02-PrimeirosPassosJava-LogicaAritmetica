package lista02;

import java.util.Scanner;

public class ConversaoMoedas {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Valor em Reais: ");
		float valorReais = sc.nextFloat();
		System.out.println("Digite o Valor do Dolar: ");
		float taxaDolar = sc.nextFloat();
		System.out.println("Digite o Valor do Euro: ");
		float taxaEuro = sc.nextFloat();
		System.out.println("Digite o Valor da Libra: ");
		float taxaLibra = sc.nextFloat();
		
		float valorDolar = valorReais / taxaDolar;
		float valorEuro = valorReais / taxaEuro;
		float valorLibra = valorReais / taxaLibra;
		
		System.out.printf("Valor em Reais: %.2f\n", valorReais);
		System.out.printf("Valor em Dolares: %.2f\n",valorDolar);
		System.out.printf("Valor em Euro: %.2f\n",valorEuro);
		System.out.printf("Valor em Libra: %.2f\n",valorLibra);
		
		sc.close();
		
		
		
		
	}

}
