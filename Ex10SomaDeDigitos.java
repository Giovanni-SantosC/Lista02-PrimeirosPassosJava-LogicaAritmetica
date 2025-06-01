package lista02;

import java.util.Scanner;


public class Ex10SomaDeDigitos {

	public static void main(String[]args) {
		
		Scanner sc =new Scanner(System.in);
	
		System.out.println("Soma De Digitos: ");
		System.out.println("Digite um Numero Inteiro: ");
		int numero = sc.nextInt();
		int somaDosDigitos = 0;
		
		for(int i = 0; numero > 0; i++) {
			
			somaDosDigitos += numero % 10;
			numero = numero / 10;
		}
		
		System.out.println("A Soma De Todos Digitos: " + somaDosDigitos);
		 
		sc.close();
	}
	
}
