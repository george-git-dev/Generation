package exercicios05.java08092021;

public class Exercicio02b {
	
	public static void main(String[]args) {
		
		Exercicio02a aviao = new Exercicio02a();
		aviao.setPeso(22.680);
		aviao.setTamanho(76);
		aviao.setPilotoNome("George");
		System.out.println("O piloto " + aviao.getPilotoNome() + " controla um avião comercial com peso de " 
		+ aviao.getPeso() + "kg e tamanho de: " + aviao.getTamanho() + "m");
	}
}