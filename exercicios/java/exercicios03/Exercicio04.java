package exercicios03.java02092021;
/*
Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as 
opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)) 

 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0;
		int sexo = 0;
		int temperamento = 0;
		int totalPessoas = 0;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int nervosasAcima = 0;
		int calmasMenos = 0;
		
		
			System.out.print("Por favor preencha a pesquisa com as seguintes informações: ");
			
			while(totalPessoas < 150) {

			System.out.println("\nDigite sua idade: ");
			idade = entrada.nextInt();
			System.out.println();
			
							
			System.out.println("\nSexo: (1-feminino / 2-masculino / 3-Outros): ");
			sexo = entrada.nextInt();
			System.out.println();
			
			System.out.println("\nVoçê se considera: (1-calma / 2-nervosa / 3-agressiva)");
			temperamento = entrada.nextInt();
			System.out.println();
			
			
				if(temperamento == 1) {
					
					pessoasCalmas += 1; 
				}
				
				if(temperamento == 2 && sexo == 1) {
					
					mulheresNervosas += 1;
					
				}
				
				if(temperamento == 3 && sexo == 2) {
					
					homensAgressivos += 1;
					
				}
				
				if(temperamento == 1 && sexo == 3) {
					
					outrosCalmos += 1;
					
				}
				
				if(temperamento == 2 && idade >= 40) {
					
					nervosasAcima += 1;
					
				}
				
				if(temperamento == 1 && sexo <= 18) {
					
					calmasMenos += 1;
					
				}
				
				
	
			totalPessoas = totalPessoas + 1;

			}
			
			System.out.println("\nQuantidade de pessoas calmas é: " + pessoasCalmas);
			System.out.println("\nQuantidade de mulheres nervosas é: " + mulheresNervosas);
			System.out.println("\nQuantidade de homens agressivos é: " + homensAgressivos);
			System.out.println("\nQuantidade de outras pessoas calmas é: " + outrosCalmos);
			System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos é: " + nervosasAcima);
			System.out.println("\nQuantidade de pessoas calmas com menos é: " + calmasMenos);


	}

}
