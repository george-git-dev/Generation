package exercicios02.java01092021;

//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra. 
 
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade = 0;

		System.out.println("Digite sua idade:");
		idade = entrada.nextInt();

		

		if (idade >= 10 && idade <= 14) {
			System.out.println("\nVoc� est� da categoria infantil!");
			System.out.println("Vo�e tem " + idade + " anos de idade");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("\nVoc� est� da categoria juvenil!");
			System.out.println("Vo�e tem " + idade + " anos de idade");
		} else if (idade >= 18) {
			System.out.println("\nVoc� est� da categoria adulto!");			
			System.out.println("Vo�e tem " + idade + " anos de idade");
		} 
		entrada.close();
	}

}
