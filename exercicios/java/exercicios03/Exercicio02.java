package exercicios03.java02092021;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int pares = 0;
		int impares = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("\nDigite o " + i + " �n�mero: ");
			numero = entrada.nextInt();

			if (numero % 2 == 0) {
				pares += 1; 

			} else {
				impares += 1; 
			}
		}
		System.out.println("\nVo�� digitou " + pares + " n�meros pares");
		System.out.println("\nVo�� digitou " + impares + " n�meros impares");

	}

}

