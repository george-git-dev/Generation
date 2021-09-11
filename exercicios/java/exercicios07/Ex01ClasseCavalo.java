package exercicios07.java10092021Polimorfismoeherança;

public class Ex01ClasseCavalo extends Ex01ClasseAnimal {
	public void cavaloCorre() {
		System.out.println("O cavalo está correndo!");
	}

	@Override
	public void emitirSom() {
		System.out.println("O cavalo está emitindo som!");
	}
}
