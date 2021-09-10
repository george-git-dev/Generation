package exercicios05.java08092021;


/*Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/

public class Exercicio06b {

	public static void main(String[] args) {
		Exercicio06a conta = new Exercicio06a();
		conta.setCpf("123.456.789-00");
		conta.setNomeCliente("George");
		conta.setIdade(30);
		
		System.out.println("O proprietário do CPF ( " + conta.getCpf() + " ) é o cliente " 
		+ conta.getNomeCliente() + " com idade de " + conta.getIdade() + " anos");
	}

}