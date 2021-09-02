package exercicios02.java01092021;

//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra. 
 
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade = 0;

		System.out.println("Digite sua idade:");
		idade = entrada.nextInt();

		

		if (idade >= 10 && idade <= 14) {
			System.out.println("\nVocê está da categoria infantil!");
			System.out.println("Voçe tem " + idade + " anos de idade");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("\nVocê está da categoria juvenil!");
			System.out.println("Voçe tem " + idade + " anos de idade");
		} else if (idade >= 18) {
			System.out.println("\nVocê está da categoria adulto!");			
			System.out.println("Voçe tem " + idade + " anos de idade");
		} 
		entrada.close();
	}

}
