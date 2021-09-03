package exercicios03.java02092021;


/*
 5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 No final, mostre a soma dos números digitados.(DO...WHILE)
  
 */
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		int numero = -1;
		int acumulador = 0;

        do{
        	
        	System.out.println("\nDigite um número: ");
			numero = entrada.nextInt();
			System.out.println();
			
			acumulador = acumulador + numero;
          
        }while(numero != 0);
        
    	System.out.println("\nA soma dos números digitados é: " + acumulador);

	}

}
