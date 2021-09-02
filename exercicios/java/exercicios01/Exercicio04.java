package exercicios.java;

import java.util.Scanner;

/*
 4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão. */

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, D, R, S;
	
		System.out.println("Digite 3 números: \n");
		System.out.println("Nº 1: ");
		A = leia.nextInt();
	
		System.out.println("Nº 2: ");
		B = leia.nextInt();
	
		System.out.println("Nº 3: ");
		C = leia.nextInt();
	
		
		R = Math.pow((A + B), 2.0);
		
		S = Math.pow((B + C), 2.0)	;
		
		D = (R + S)/2;
	
		
		System.out.println("\nResultado: "+ D);
		
		System.out.println();


		
		System.out.println("FIM DO PROGRAMA !!!");
	}

}
