package hotel;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	final String aux = "(C)adastrar Animal \n" + 
				 "(E)xibir Animal\n" + 
				 "(R)emover Animal\n" + 
				 "(L)ucro Total\n" + 
				 "(N)umero de Hospedes\n" +
				 "(S)air\n" +
				 "Opção ";
	
	String opcao;
	do 
		{
		opcao = Opcao(aux, scan);
		switch (opcao) {
			case("C"):
				System.out.println("teste");
				break;
			case("S"):
				break;
		}
		}
	while (!opcao.equals("O"));
	scan.close();
	
	}
	
	
	private static String Opcao(String aux, Scanner scan) {
		System.out.print(aux);
		String opcao = scan.nextLine().trim().toUpperCase();
		return opcao;	
	}

}

