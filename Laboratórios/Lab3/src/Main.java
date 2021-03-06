/*
 * 
 * Questões:
 * 
 * 1) R: Não. A IDE já mostra na linha do setter que não vai compilar.
 * 		 Caso tentemos compilar teremos a saída abaixo:
 * 			Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 * 			The final field Caronante.carteiraMotorista cannot be assigned
 * 
 * 			at Caronante.setCarteiraMotorista(Caronante.java:17)
 * 			at Main.main(Main.java:48)
 * 
 * 		 A modificação não foi possível pois é um atributo com a palavra reservada
 * 		 final, ou seja, depois de atribuido um valor, não é possível alterar ele.
 * 		 Esse valor vai funcionar como uma constante.
 * 		 
 * 2) R: Sim, foi possível. A palavra reservada final significa que não vou poder instanciar nessa
 * 		 variável de novo. Ou seja, só posso instanciar nesse espaço de memória uma
 * 		 vez. Mas não diz nada sobre mudar os atributos desse objeto.
 * 
 * 		 O erro quando tento instanciar outro objeto do mesmo tipo naquela
 * 		 variável:
 * 
 * 			Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 *			The final local variable c cannot be assigned. It must be blank and not using a compound assignment
 *
 *			at Main.main(Main.java:69)
 *
 * 3) R: Não mudou. A explicação é analoga a anterior. Vai dar erro se eu tentar
 * 		 instanciar na mesma variável um objeto do tipo Array de Caroneiros (ou ArrayList),
 * 		 mas o comportamento dos atributos continuam o mesmo, pois eles são alterados no espaço
 * 		 de memória reservado para os atributos do objeto. Então, se eu tentar instanciar o objeto
 * 		 do tipo Array de Caroneiros naquela variável/atributo, ai teremos erros.
 * 
 * 4) R: No caso em que temos um tamanho máximo definido, a vantagem do ArrayList em comparação
 * 		 ao Array normal seria não precisar nos preocuparmos com os indices. 
 * 
 * 		 Em uma solução de Array comum, precisamos de uma lógica para os indices não ultrapassarem
 * 		 o tamanho máximo. Com o ArrayList essa lógica já é pré definida no método add() quando
 * 		 definimos uma ocupação máxima.
 * 
 * 		 Além disso, o objeto do tipo Array é bem cru levando em consideração recursos comparado
 * 		 ao ArrayList, que tem propriedades da classe Collection, tem propriedades de uma
 * 		 LinkedList e também de Array (inclusive, com add/search em O(1)).
 */

public class Main {

	public static void main(String[] args) {
		// Crie um objeto da classe Caronante
		Caronante caronante = new Caronante("0000000");

		// e quatro objetos da classe Caroneiro.
		Caroneiro c0 = new Caroneiro("00000");
		Caroneiro c1 = new Caroneiro("11111");
		Caroneiro c2 = new Caroneiro("22222");
		Caroneiro c3 = new Caroneiro("33333");
		
		/* Construa então um objeto Carona que tem o
		 * caronante criado anteriormente como o atributo
		 * caronante.
		 */
		
		Carona carona = new Carona(caronante, 0.1234, 0.12345, 0.2353, 0.134532, "09:04 26/03/2018", 3);
		
		/* Imprima a saída do método, e verifique
		 * se o retorno foi verdadeiro nas três primeiras
		 * adições, e falsa na última.
		 */

		System.out.println(carona.adicionarCaroneiro(c0));
		System.out.println(carona.adicionarCaroneiro(c1));
		System.out.println(carona.adicionarCaroneiro(c2));
		System.out.println(carona.adicionarCaroneiro(c3));
		
		/* Também imprima o objeto carona (que utilizará
		 * o método toString()), e verifique se só 3 dos
		 * caroneiros foram adicionados.
		 */
		
		System.out.println(carona);
		
		// 1):
		// caronante.setCarteiraMotorista("000000");
		
		// 2):
		// final Caronante c = new Caronante("0000000110");
		// c.setTempoHabilitacao(4);;
		
		// Mostrando que não posso instanciar novamente:
		// c = new Caronante("0202020202");
		
		
	}

}
