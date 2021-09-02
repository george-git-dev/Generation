package exercicios02.java01092021;

//Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero1, numero2, numero3;
		int numeroMaior, numeroMenor;
		
		
		System.out.println("Digite 3 números!!! ");

		System.out.println("\nDigite o 1º número: ");
		numero1 = entrada.nextInt();
		System.out.println();

		
		System.out.println("Digite o 2º número: ");
		numero2 = entrada.nextInt();
		System.out.println();
		
		System.out.println("Digite o 3º número: ");
		numero3 = entrada.nextInt();
		System.out.println();
		
		if(numero1 >= numero2 && numero1 >= numero3) {
			
			System.out.println("\nO maior número digitado foi: "+ numero1);			
		}
		else if(numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("\nO maior número digitado foi: "+ numero2);		
		}
		else {
			System.out.println("\nO maior número digitado foi: "+ numero3);		
		}
		
		entrada.close();

	}

}
