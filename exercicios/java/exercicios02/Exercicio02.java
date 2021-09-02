package exercicios02.java01092021;

//Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
	
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite três números: ");
	
	num1 = entrada.nextInt();
	num2 = entrada.nextInt();
	num3 = entrada.nextInt();
	entrada.close();
	
	if(num1 < num2 && num1 < num3) {
		System.out.print(num1);
		if (num2 < num3) {
			System.out.println(" " + num2 + " " + num3);
		} else {
			System.out.println(" " + num3 + " " + num2);
		}
	}
	if(num2 < num1 && num2 < num3) {
		System.out.print(num2);
		if (num1 < num3) {
			System.out.println(" " + num1 + " " + num3);
		} else {
			System.out.println(" " + num3 + " " + num1);
		}
	}
	if(num3 < num1 && num3 < num2) {
		System.out.print(num3);
		if (num1 < num2) {
			System.out.println(" " + num1 + " " + num2);
		} else {
			System.out.println(" " + num2 + " " + num1);
		}
	}
}

}
