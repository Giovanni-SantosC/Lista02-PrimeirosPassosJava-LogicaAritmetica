package lista02;

import java.util.Scanner;
import java.lang.Math;

public class EquacaoQuadratica {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor de A da Equação Quadratica: ");
		double numero01 = sc.nextDouble();
		
		System.out.println("Digite o Valor de B da Equação Quadratica: ");
		double numero02 = sc.nextDouble();
		
		System.out.println("Digite o Valor de C da Equação Quadratica: ");
		double numero03 = sc.nextDouble();
		
		double teste = Math.pow(numero02,2);
		double teste01 = teste - 4 * numero01 * numero03;
		double teste3 = teste01 * numero03;
		
		double delta = Math.pow(numero02, 2) - 4 * numero01 * numero03;
		
		System.out.println(delta);
		System.out.println(teste);
		System.out.println(teste01);
		System.out.println(teste3);
		
		
		if(delta > 0) {
			System.out.println("O Seu Valor Contem Mais de Uma Raiz!");
		}
		
		else if(delta == 0) {
			System.out.println("O Seu Valor Contem Somente Uma Raiz!");
		}
		
		else {
			System.out.println("Seu Valor Não tem Raiz!");
		}
		
		sc.close();
	}
	
}
