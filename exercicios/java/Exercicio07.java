package exercicios.java;

import java.util.Scanner;

/*7. Um sistema de equações lineares do tipo: */

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int a, b, c, d, e, f, x, y;

        System.out.println("Entre com o valor de a: ");
        a = leia.nextInt();
        
        System.out.println("Entre com o valor de b: ");
        b = leia.nextInt();
        
        System.out.println("Entre com o valor de c: ");
        c = leia.nextInt();
        
        System.out.println("Entre com o valor de d: ");
        d = leia.nextInt();
        
        System.out.println("Entre com o valor de e: ");
        E = leia.nextInt();
        
        System.out.println("Entre com o valor de f: ");
        f = leia.nextInt();

        x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        y = ((a * f) - (c * d)) / ((a * e) - (b * d));

        System.out.println("\nO resultado de x é: " + x + " O resultado de y é: " + y);
        
		System.out.println();


		
		System.out.println("FIM DO PROGRAMA !!!");

	}

}
