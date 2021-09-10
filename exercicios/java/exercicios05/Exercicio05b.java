package exercicios05.java08092021;

/*
Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Exercicio05b {

	public static void main(String[] args) {
		Exercicio05a patinete = new Exercicio05a();
		patinete.setDistanciaPercorrida(50.0);
		patinete.setValor(150.00);
		System.out.println("O patinete custou R$" + patinete.getValor() + " e percorri " + patinete.getDistanciaPercorrida() + "m com ele");
	}

}
