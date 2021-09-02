package exercicios.java;

import java.util.Scanner;

/*
6. Construa um programa em c que, tendo como dados de entrada dois
 pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles
*/

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

				
		double x1, x2, y1, y2, p1, p2, resultado;

		System.out.println("Digite o Valor de x1: ");
		x1 = leia.nextInt();
		System.out.println("Digite o Valor de x2: ");
		x2 = leia.nextInt();
		System.out.println("Digite o Valor de y1: ");
		y1 = leia.nextInt();
		System.out.println("Digite o Valor de y2: ");
		y2 = leia.nextInt();

		p1 = Math.pow((x2 - x1), 2.0);
		p2 = Math.pow((y2 - y1), 2.0);

		resultado = Math.sqrt(p1 + p2);
		System.out.println("\nO resultado da distância é: " + resultado);
		
		System.out.println();


		
		System.out.println("FIM DO PROGRAMA !!!");
	}

}
