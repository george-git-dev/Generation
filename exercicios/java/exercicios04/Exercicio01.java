package exercicios04.java03092021;
/*1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o 
 * escreva em seguida. Encontre após a maior pontuação e a apresente. */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double notaArray[] = new double[5];
		double maiorNota = 0.0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com uma nota: ");
			notaArray[i] = entrada.nextFloat();

			if (notaArray[i] > maiorNota) {
				maiorNota = notaArray[i];
			}

		}

		System.out.println("A maior nota digitada foi: " + maiorNota);
		entrada.close();
	}

}
