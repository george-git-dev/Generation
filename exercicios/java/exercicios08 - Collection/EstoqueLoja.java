package exercicios08.java13092021Collections;

import java.util.ArrayList;

public class EstoqueLoja {

	public static void main(String[] args) {

		String acougue = "Carne";
		String bebidas = "Sucos";
		String higiene = "Shampoo";
		String mercearia = "Feijão";
		
		
		ArrayList<String> loja = new ArrayList<>(); 
		
		loja.add(acougue);
		loja.add(bebidas);
		loja.add(higiene);
		loja.add(mercearia);
		
	System.out.println("Estoque anterior: " + loja);
		
	loja.remove(1);
	
	System.out.println("Estoque atualizado: " + loja);
			
	}

}
