package exercicios.java;

import java.util.Scanner;

/*
 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
*/

public class Exercicio01 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);   //c�digo para que o programa capture o que for digitado com o comando "leia"
		int anos, meses, dias;   // declarei qual tipo da vari�vel
		
		int diasAno = 365, diasMes = 30;		
		
		System.out.println("Digite sua idade em: ");    //exibe a msg na tela

		System.out.println("Anos: ");    //exibe a msg na tela
		anos = leia.nextInt();   //captura o que o usu�rio digitar e armazena na vari�vel
		System.out.println();   //usei para pular linha
		
		System.out.println("Meses: ");
		meses = leia.nextInt();
		System.out.println();
		
		System.out.println("Dias: ");
		dias = leia.nextInt();
		System.out.println();
		
		
		dias = (anos * diasAno) + (meses*diasMes) + dias;
		
		System.out.println("Voc� tem " + dias + " dias de vida");

		
		System.out.println("FIM DO PROGRAMA !!!");
		
		

	}

}
