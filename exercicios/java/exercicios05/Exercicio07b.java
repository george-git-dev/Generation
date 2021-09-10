package exercicios05.java08092021;

/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Exercicio07b {

	public static void main(String[] args) {
		Exercicio07a paciente = new Exercicio07a();
		paciente.setIdade(30);
		paciente.setNomePaciente("George");
		paciente.setNomeDoenca("Pressão alta");
		
		System.out.println("O paciente " + paciente.getNomePaciente() + " com idade de " 
		+ paciente.getIdade() + " anos, possui a doença: " + paciente.getNomeDoenca());
		
	}

}

