package exercicios07.java10092021Polimorfismoeheran�a;

public class Ex01ClasseCavalo extends Ex01ClasseAnimal {
	public void cavaloCorre() {
		System.out.println("O cavalo est� correndo!");
	}

	@Override
	public void emitirSom() {
		System.out.println("O cavalo est� emitindo som!");
	}
}
