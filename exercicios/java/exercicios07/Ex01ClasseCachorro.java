package exercicios07.java10092021Polimorfismoeheran�a;

public class Ex01ClasseCachorro extends Ex01ClasseAnimal {
	public void cachorroCorre() {
		System.out.println("\nO cachorro est� correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro est� latindo");
	}

}
