package exercicios07.java10092021Polimorfismoeherança;

public class Ex01ClasseCachorro extends Ex01ClasseAnimal {
	public void cachorroCorre() {
		System.out.println("\nO cachorro está correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo");
	}

}
