package exercicios.java;

import java.util.Scanner;
/*
 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
 expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		
		int horas, minutos, segundos;

		System.out.println("Informar dura��o: ");
        segundos = leia.nextInt();
			
		horas = segundos / 3600;
		minutos = ((segundos % 3600) / 60);
		segundos = ((segundos % 3600) % 60);

		
		System.out.println("\nO evento durou: " + horas + "h " + minutos + " min " + segundos + " segundos.");
		
		System.out.println();


		
		System.out.println("FIM DO PROGRAMA !!!");
	}

}
