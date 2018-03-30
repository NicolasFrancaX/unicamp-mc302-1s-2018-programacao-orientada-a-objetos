/*
 * Questões:
 * 
 * 1) R: Sim. Pois o construtor default é o construtor da classe Object (que por sinal, é vazio).
 * 
 * 2) R: Não. Pois ele é um método de classe, enquanto uma variável não estática é relacionado com o objeto.
 * 		 Como o método estático não precisa de um objeto para ser chamado, ele também não pode usar uma variável que necessita de um objeto.
 * 
 * 3) R: Sim. Pois a variável estática é da classe, e poderia ser chamada mesmo sem objeto (que é necessário para execução de um método não estático).
 * 		 Levando isso em conta, é como se o método não estático simplesmente executasse a variável estática.
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// instanciando objetos
		Caronante caronante = new Caronante();
		
		System.out.println("[Registro do caronante]");
		
		System.out.println("Tempo de habilitacao: ");
		caronante.setTempoHabilitacao(sc.nextInt());
		
		System.out.println("Genero musical favorito: ");
		caronante.setGeneroMusicalFavorito(sc.nextLine());
		
		System.out.println("Placa do veículo: ");
		caronante.setPlacaVeiculo(sc.nextLine());
		
		System.out.println("Carteira de motorista: ");
		caronante.setCarteiraMotorista(sc.nextLine());
		
		System.out.println("Marca do veículo: ");
		caronante.setMarcaVeiculo(sc.nextLine());
		
		System.out.println("Assentos disponíveis: ");
		caronante.setAssentosDisponiveis(sc.nextInt());
		
		System.out.println("Número de caroneiros: ");
		Caronante.setNumCaroneiros(sc.nextInt());
		
		System.out.println("[Dados do caronante] " + caronante.toString());
		
		// Caroneiro()
		Caroneiro caroneiro1 = new Caroneiro();
		
		System.out.println("[Dados do 1º caroneiro] " + caroneiro1.toString());
		
		
		// Caroneiro(String cartaoDeCredito)
		System.out.println("[Registro do 2º caroneiro]");
		
		System.out.println("Cartão de crédito: ");
		Caroneiro caroneiro2 = new Caroneiro(sc.nextLine()) ;

		// Caroneiro(boolean pagamentoEmDinheiro)
		
		System.out.println("Deseja pagar em dinheiro? Se sim, digite 1.");
		Caroneiro caroneiro3 = new Caroneiro(sc.nextInt() == 1);
		
		// impressão dos dados dos objetos
		System.out.println("Caronante: " + caronante);
		System.out.println("Caroneiro 1: " + caroneiro1);
		System.out.println("Caroneiro 2: " + caroneiro2);
		System.out.println("Caroneiro 3: " + caroneiro3);
	}

}
