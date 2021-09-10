package exercicios05.java08092021;



/*
 * Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 * 
 * 
 * */
public class Exercicio02a {

	private int tamanho = 0;
	private double peso = 0.0;
	private String pilotoNome = "";
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getPilotoNome() {
		return pilotoNome;
	}
	public void setPilotoNome(String pilotoNome) {
		this.pilotoNome = pilotoNome;
	}

}
