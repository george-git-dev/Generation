package exercicios.java;

import java.util.Scanner;

/*
 2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
*/

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int dias, ano, mes, dia;

        System.out.println("Entre com a sua idade expressa em dias: ");
        dias = leia.nextInt();

        ano = dias / 365;
        mes = (dias % 365) / 30;
        dia = (dias % 365) % 30;


        System.out.println("Voc� tem " + ano + " anos e "
                + mes + " meses e " + dias + " dias");
		System.out.println();


		
		System.out.println("FIM DO PROGRAMA !!!");
	}

}
