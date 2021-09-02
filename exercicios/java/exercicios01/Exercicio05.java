package exercicios.java;

import java.util.Scanner;

/*
5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
 Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.  
*/

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

			
		double nota1, nota2, nota3, peso1, peso2, peso3, mediaPonderada;
	
		peso1 = 2.0;
		peso2 = 3.0;
		peso3 = 5.0;
	
		System.out.println("Escreva a sua Primeira Nota: ");
		nota1 = leia.nextInt();
	
		System.out.println("Escreva a sua Segunda Nota: ");
		nota2 = leia.nextInt();	
		
		System.out.println("Escreva a sua Terceira Nota: ");
		nota3 = leia.nextInt();	
		mediaPonderada = (nota1*peso1+nota2*peso2+nota3*peso3) / (peso1+peso2+peso3);
	
		System.out.println("Média final: " + mediaPonderada);
		
		System.out.println();


		
		System.out.println("FIM DO PROGRAMA !!!");
		
	}
}
