package exercicios05.java08092021;

/*Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

public class Exercicio04b {

	public static void main(String[] args) {
		Exercicio04a gerente = new Exercicio04a();
		gerente.setFuncao("Gerente");
		gerente.setSalario(4950.00);
		System.out.println("A função do funcionário é: " + gerente.getFuncao() + " com salário de R$" + gerente.getSalario());
	}

}
