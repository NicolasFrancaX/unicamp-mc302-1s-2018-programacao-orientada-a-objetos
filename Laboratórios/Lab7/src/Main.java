/*
 * 
 * Questões:
 * 
 * 1) R: 
 * 
 * Vantagens:
 * - Evita termos um Stackoverflow por chamadas recursivas sem parâmetro
 * saída.
 * - Facilita a consulta de um dado de um tipo para outro.
 * - Possibilita relacionamentos muito pra muitos.
 * 
 * Desvantagens:
 * - Criação de uma nova classe/abstração;
 * - Uso de memória;
 *   
 * 2) R:
 * 
 * Sim. Poderiamos colocar as notas como ArrayList da classe Carona em si. 
 * 
 * A desvantagem dessa abordagem é a dificuldade para acessar de quem é a nota.
 * 
 * Teriamos que aplicar uma lógica de indices, o que não é difícil, mas não
 * utiliza de fato os conceitos de OOP.
 * 
 * 3) R:
 * 
 * Não é possível de forma prática (a menos que você crie uma carona
 * manualmente).
 * 
 * Não é possível de forma prática pois a única pessoa que de fato
 * cria a carona de uma forma real é o Caronante.
 * 
 * E como eu não deixei possível a setagem de outro Caronante (por isso,
 * o meu CaronaCaronante é final e eu não tenho setCaronante), não
 * vai ser possível ter esse tipo de inconsistência.
 * 
 */

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		// Usuário 1
		Caronante caronante00 = new Caronante(0, "Rock", "453-23", "12345", "VW", "Golf");
		Caroneiro caroneiro00 = new Caroneiro("1111111");

		Perfil perfil00 = new Perfil('m', "19/09/1996", "Carapicuíba", "SP", "11945431236", false, 5, caroneiro00,
				caronante00);
		Usuario usuario00 = new Usuario("Nicolas", "nicolasfranca9@gmail.com", "12345", true, perfil00);
		
		perfil00.setUsuario(usuario00);
		caronante00.setPerfil(perfil00);
		caroneiro00.setPerfil(perfil00);
		
		// Usuário 2
		
		Caronante caronante01 = new Caronante(0, "Samba", "453-22", "123432", "Ford", "K");
		Caroneiro caroneiro01 = new Caroneiro("1111122");

		Perfil perfil01 = new Perfil('f', "19/09/1997", "Carapicuíba", "SP", "11945431237", false, 5, caroneiro01,
				caronante01);
		Usuario usuario01 = new Usuario("Gabriel", "gabriel@gmail.com", "123532", true, perfil01);
		
		perfil01.setUsuario(usuario01);
		caronante01.setPerfil(perfil01);
		caroneiro01.setPerfil(perfil01);
		
		// Usuário 3
		
		Caronante caronante02 = new Caronante(0, "Eletrônica", "453-24", "12346", "Ford", "Focus");
		Caroneiro caroneiro02 = new Caroneiro("1111112");

		Perfil perfil02 = new Perfil('m', "19/09/1997", "Osasco", "SP", "11945431253", false, 5, caroneiro02,
				caronante02);
		Usuario usuario02 = new Usuario("Bruno", "bruno@gmail.com", "12346", true, perfil02);
		
		perfil02.setUsuario(usuario02);
		caronante02.setPerfil(perfil02);
		caroneiro02.setPerfil(perfil02);
		
		// Usuário 4
		
		
		Caronante caronante03 = new Caronante(0, "Synthwave", "453-29", "123526", "Audi", "A8");
		Caroneiro caroneiro03 = new Caroneiro("111123232312");

		Perfil perfil03 = new Perfil('m', "19/09/1987", "Ribeirão Preto", "SP", "11945332253", false, 5, caroneiro03,
				caronante03);
		Usuario usuario03 = new Usuario("Ricardo", "ricardo@gmail.com", "12246", true, perfil03);
		
		perfil03.setUsuario(usuario03);
		caronante03.setPerfil(perfil03);
		caroneiro03.setPerfil(perfil03);
		
		usuarios.add(usuario00);
		usuarios.add(usuario01);
		usuarios.add(usuario02);
		usuarios.add(usuario03);

		Carona carona = usuario00.getPerfil().getCaronante().oferecerCarona();
		
		// Vou fazer para jogar direto um usuário depois
		carona.adicionarCaroneiro(usuario01.getPerfil().getCaroneiro());
		carona.adicionarCaroneiro(usuario02.getPerfil().getCaroneiro());
		carona.adicionarCaroneiro(usuario03.getPerfil().getCaroneiro());
		
		System.out.println(carona.atribuirNotaCaroneiro(usuario01.getId(), 10));
		System.out.println(carona.atribuirNotaCaroneiro(usuario02.getId(), 0));
		System.out.println(carona.atribuirNotaCaroneiro(usuario03.getId(), 5));
		System.out.println(carona.atribuirNotaCaronante(10));
		
		System.out.println(carona.atribuirNotaCaroneiro(50, 10));
		
		System.out.println("Avaliação Caroneiro 0: " + carona.getCaroneiros().get(0).getAvaliacao()); // 10
		System.out.println("Avaliação Caroneiro 1: " + carona.getCaroneiros().get(1).getAvaliacao()); // 0
		System.out.println("Avaliação Caroneiro 2: " + carona.getCaroneiros().get(2).getAvaliacao()); // 5
		System.out.println("Avaliação Caronante: " + carona.getCaronante().getAvaliacao()); // 10

		// Imprimindo informações de todos os usuários:
		usuarios.forEach((u)->System.out.println(u));
		
		// Imprimindo informações da carona:
		System.out.println(carona);

	}
}
