package exercicios04.java03092021;

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

	}

}
