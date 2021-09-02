package exercicios.java;

import java.util.Scanner;
/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		consumidor.
	 * */
public class Exercicio08 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
						
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Entre com o custo de Fábrica:");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica*0.28);
		
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		double potencia	= Math.pow(custoConsumidor, 2);
		
		System.out.printf("Custo ao Consumidor: %.2f", custoConsumidor);
		System.out.println();
		System.out.println("Potência: " + potencia);
		
		leia.close();
		
		System.out.println();


		
		System.out.println("FIM DO PROGRAMA !!!");

	}

}
