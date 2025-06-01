package lista02;

import java.util.Scanner;
import java.lang.Math;

public class JurosCompostos {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Capital Inicial: ");
		double capitalInicial = sc.nextDouble();
		System.out.println("Digite a taxa de juros anuel: ");
		double taxaJuros = sc.nextDouble();
		System.out.println("Digite o numero de anos: ");
		int numeroAnos = sc.nextInt();
		
		double taxaJurosDecimal = taxaJuros/100;
		double montanteFinal = capitalInicial * Math.pow((1 + taxaJurosDecimal),numeroAnos);
		
		System.out.printf("Montante Final: %.2f",montanteFinal);
		
		sc.close();
		
		
		
	}

}
