package exercicios05.java08092021;

public class Exercicio01b {
	public static void main(String[]args) {

	/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.*/



			Exercicio01a cliente = new Exercicio01a();
			cliente.setIdade(21);
			cliente.setNome("George");
			cliente.setSexo("Masculino");
			cliente.setUsuario("Ge");
			
			System.out.println("Nome: " + cliente.getNome() + " | idade: " + cliente.getIdade()
			+ " | Sexo: " + cliente.getSexo() + " | Usu�rio: " + cliente.getUsuario());
		}
	}