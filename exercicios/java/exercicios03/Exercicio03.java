package exercicios03.java02092021;

/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
*/

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		int idade = 0;
		int menosVinteum = 0;
		int maisCinq = 0;
		
		while(idade != -99) {
			
			System.out.println("\nDigite sua idade: ");
			idade = entrada.nextInt();
			System.out.println();
			
			
			System.out.println("\nVoçê tem: " + idade + " anos de idade.");
		
		
			if(idade <= 21 && idade > 0) {
				
				menosVinteum += 1;
			}
			if(idade >= 50) {
				
				maisCinq += 1;
			}
		}
		System.out.println("\nExistem " + menosVinteum + " pessoas com menos de 21 anos");
		System.out.println("\nExistem " + maisCinq + " pessoas com mais de 50 anos");

		
		
		
		
		
		//System.out.println("\nVoçê digitou " + impares + " números impares");

	}

}
