package exercicios05.java08092021;

/*Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

public class Exercicio04b {

	public static void main(String[] args) {
		Exercicio04a gerente = new Exercicio04a();
		gerente.setFuncao("Gerente");
		gerente.setSalario(4950.00);
		System.out.println("A fun��o do funcion�rio �: " + gerente.getFuncao() + " com sal�rio de R$" + gerente.getSalario());
	}

}
