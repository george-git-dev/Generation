package exercicios.java;

import java.util.Scanner;

/*
 4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o. */

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, D, R, S;
	
		System.out.println("Digite 3 n�meros: \n");
		System.out.println("N� 1: ");
		A = leia.nextInt();
	
		System.out.println("N� 2: ");
		B = leia.nextInt();
	
		System.out.println("N� 3: ");
		C = leia.nextInt();
	
		
		R = Math.pow((A + B), 2.0);
		
		S = Math.pow((B + C), 2.0)	;
		
		D = (R + S)/2;
	
		
		System.out.println("\nResultado: "+ D);
		
		System.out.println();


		
		System.out.println("FIM DO PROGRAMA !!!");
	}

}
