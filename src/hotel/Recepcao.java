package hotel;

import java.util.ArrayList;

public class Recepcao {

	private ArrayList<Estadia> estadia;
	
	public Recepcao() {
		this.estadia = new ArrayList<Estadia>();
	}
	
	public void CheckIn(String nome, String tipo, int idade, int dias, double valor) {
		estadia.add(new Estadia(nome, tipo, idade, dias, valor));
		
		// pode ser tambem Estadia x = new Estadia(nome, tipo, idade, dias, valor),
		// estadia.add(x)
		
	}
	
	///public void getCheckOut(String nome) {}
	
	public int getNumDeHospedes() {
		return estadia.size() + 1;
	}
	
	
	// esse lucro total tem que ver modificar, pq quando der o checkout, o valor diminui.
	public double getLucroTotal() {
		double soma = 0;
		for (int i = 0; i < estadia.size(); i++) {
			soma += estadia.get(i).getValor();
		}
		return soma;		
	}
	
}
