package exercicios05.java08092021;

/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/

public class Exercicio03b {

	public static void main(String[] args) {
		Exercicio03a TV = new Exercicio03a();
		TV.setNomeProduto("TV");
		TV.setPreco(1199.99);
		System.out.println("O produto " + TV.getNomeProduto() + " custa R$" + TV.getPreco());
	}

}