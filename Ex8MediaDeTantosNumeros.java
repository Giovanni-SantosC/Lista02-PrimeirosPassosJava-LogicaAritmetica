package lista02;

import java.util.Scanner;

public class Ex8MediaDeTantosNumeros {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);	
		
	System.out.println("Media De N Numeros: ");
	
	System.out.println("Digite Quantos Numeros Inteiros Você Quer Inserir:");
	int quantidadeDeNumeros = sc.nextInt();
    int soma = 0;
	
	for(int contagem = 1; contagem <= quantidadeDeNumeros ;contagem++) {
		
		System.out.println("Digite o " + contagem + "º Valor");
		 soma += sc.nextInt();
	}
	
	double media = (double) soma / quantidadeDeNumeros;
	
	System.out.println("O Valor Da Media Dos Valores Inserido: " + media);
	
	sc.close();
	}
	
}
