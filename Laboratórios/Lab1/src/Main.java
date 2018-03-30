/*
 * Questões:
 * 
 * 1) R: Como a descrição do laboratório já recomenda deixar a visibilidade dos atributos das classes como privadas, simplesmente não é executado
 * esse tipo de atribuição.
 * 
 * 		 Erro gerado: 
 * 		 	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 *				The field Usuario.nome is not visible
 *
 *				at Main.main(Main.java:36)
 *
 * 2) R: Eu uso os métodos setters.
 * 
 * 		 Prós:    - Manter o Encapsulamento;
 * 			      - Segurança dos dados;
 *
 * 		 Contras: - Em primeiro momento, parece ser mais simples apenas atribuir a mudança (caso os atributos sejam públicos);
 *
 *		 Caso fizessemos a atribuição direta, o conceito de Encapsulamento seria quebrado.
 *
 * 
 */

public class Main {
	public static void main(String[] args) {
		// criação de 2 objetos usuários:
		Usuario user1 = new Usuario(1, "Darth Vader", "darthvader@starwars.com", "123456", true);
		Usuario user2 = new Usuario(2, "Yoda", "yoda@starwars.com", "654321", true);
		
		// criação de 2 objetos perfil:
		Perfil pf1 = new Perfil('f', "20/11/1980", "São Paulo", "SP", "(11) 9999-9999", true, 10);
		Perfil pf2 = new Perfil('m', "11/09/2001", "New York", "NY", "(11) 0000-0000", true, 0);
		
		// impressão dos objetos:
		System.out.println("Usuário 1: " + user1);
		System.out.println("Usuário 2: " + user2);
		
		System.out.println("Perfil 1: " + pf1);
		System.out.println("Perfil 2: " + pf2);
		
		// Exemplo de atribuição direta:
		// user1.nome = "dv@starwars.com"; - Depois de executado, comentei para não ter problemas. :)
		
	}
}
