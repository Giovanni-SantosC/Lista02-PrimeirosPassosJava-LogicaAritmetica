package lista02;

import java.util.Scanner;
public class AreaPerimetroTriangulo {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Base do Seu Triângulo :");
		float base = sc.nextFloat();
		System.out.println("Digite a Altura do seu Triângulo :");
		float altura = sc.nextFloat();
		
		float area = base * altura / 2;
		
		System.out.println("Digite o 1º Lado do Triângulo :");
		float lado01 = sc.nextFloat();
		System.out.println("Digite o 2º Lado do Triângulo :");
		float lado02 = sc.nextFloat();
		System.out.println("Digite o 3º Lado do Triângulo :");
		float lado03 = sc.nextFloat();
		
		float perimetro = lado01 + lado02 + lado03;
		
		System.out.println("A Area do seu Triângulo é :" + area);
		System.out.println("O Perimetro do seu Triângulo é :" + perimetro);
		
		
		sc.close();
	}

}
