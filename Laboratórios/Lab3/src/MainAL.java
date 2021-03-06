
public class MainAL {
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
		
		CaronaAL carona = new CaronaAL(caronante, 0.1234, 0.12345, 0.2353, 0.134532, "09:04 26/03/2018", 3);
		
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
	}
}
