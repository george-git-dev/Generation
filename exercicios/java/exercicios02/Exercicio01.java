package exercicios02.java01092021;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero1, numero2, numero3;
		int numeroMaior, numeroMenor;
		
		
		System.out.println("Digite 3 n�meros!!! ");

		System.out.println("\nDigite o 1� n�mero: ");
		numero1 = entrada.nextInt();
		System.out.println();

		
		System.out.println("Digite o 2� n�mero: ");
		numero2 = entrada.nextInt();
		System.out.println();
		
		System.out.println("Digite o 3� n�mero: ");
		numero3 = entrada.nextInt();
		System.out.println();
		
		if(numero1 >= numero2 && numero1 >= numero3) {
			
			System.out.println("\nO maior n�mero digitado foi: "+ numero1);			
		}
		else if(numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("\nO maior n�mero digitado foi: "+ numero2);		
		}
		else {
			System.out.println("\nO maior n�mero digitado foi: "+ numero3);		
		}
		
		entrada.close();

	}

}
