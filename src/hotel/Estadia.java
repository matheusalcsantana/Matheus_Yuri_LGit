package hotel;

public class Estadia {

	public Animal animal;
	public double valor;
	public int dias;
	
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
		
	}


	public double getValor() {
		return valor;
	}


	public int getDias() {
		return dias;
	}
	
	public String getNome() {
		return animal.getNome();
	}


	public String getTipo() {
		return animal.getTipo();
	}


	public int getIdade() {
		return animal.getIdade();
	}
	
	public String toString() {
		return this.getNome() + ", " + this.getTipo() + ", " + this.getDias() + " com o preço de R$ " + getValor();

	}
	
}
