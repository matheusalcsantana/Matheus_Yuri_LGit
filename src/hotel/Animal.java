package hotel;

public class Animal {

	public String nome;
	public String tipo;
	public int idade;
	
	
	public Animal(String nome, String tipo, int idade) {
		if (nome.isEmpty() || nome == null) {
			throw new IllegalArgumentException("Nome de um animal nao pode ser nulo ou vazio");
		}
		if (tipo.isEmpty() || tipo == null) {
			throw new IllegalArgumentException("Tipo de um animal nao pode ser nulo ou vazio");
		}
		if (idade < 0) {
			throw new ArithmeticException("Idade de um animal nao pode ser abaixo de 0");
		}
		
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public String getTipo() {
		return tipo;
	}


	public int getIdade() {
		return idade;
	}


	
}
