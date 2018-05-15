/*
 * 
 * Questões:
 * 
 * 1) R: Apenas se o espaço de memória fosse para Grupo. Dessa forma, retornariamos um GrupoPrivado que
 * tivesse a copia de todos os dados do GrupoPublico anterior. Depois só retornariamos esse resultado.
 * 
 * Se REALMENTE precisasse do espaço de memória como GrupoPrivado, ai só se copiassemos parâmetro por parâmetro,
 * mas seria bem complicado.
 *   
 * 2) R: Depende. Se fizermos downcasting, sim. Dessa forma, mesmo sendo de um tipo Grupo, vamos "forçar"
 * que ele se torne GrupoPublico pra essa execução específica.
 * 
 * Sem isso, não é possível pois o Grupo não tem esse método. Temos que explicitar o uso.
 * 
 * 3) R: Não. Pois elas não são herdeiras entre si. Nem mesmo conseguiriamos instanciar de um tipo para o outro, a menos
 * o GrupoPrivado seja herdeira do GrupoPublico.
 * 
 * Outra forma seria fazer a implementação desse método na classe Grupo.
 * 
 * 4) R: 
 * 
 * Vantagem:
 * 
 * - Usamos o conceito de forma mais "limpa" para a abstração geral, até porque, não tem uma CaronaPublica que também
 * é CaronaPrivada, nem um GrupoPublico que também é GrupoPrivado;
 * - Modularização do código;
 * - Obrigar o desenvolvedor a implementar o método de forma específica para cada herdeiro;
 * - Torna o conceito de Polimorfismo mais limpo;
 * 
 * Desvantagem:
 *
 * - É pouco flexível. Ou seja, ela depende mais dos próprios herdeiros.
 * 
 * Mas esses prós e contras dependem do padrão do projeto.
 * 
 * 
 * 5) R:
 * 
 * É possível sobrecarregar um método em um relacionamento que não é herança, pois
 * o que a sobrecarga faz é permitir o uso de um mesmo nome do método, mudando apenas sua
 * assinatura. As classes tem esse poder.
 * 
 * Sobrescrita só faz sentido em relacionamento de herança. Pois, dessa forma, aquela classe herdeira
 * pode ter seu próprio comportamento para um método com a mesma assinatura que sua mãe.
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
		
		// Preparacao
		usuarios.add(usuario00);
		usuarios.add(usuario01);
		usuarios.add(usuario02);
		usuarios.add(usuario03);
		
		// 2 Grupos
		Grupo grupoPrivado = new GrupoPrivado("a7", "É um grupo organizado", usuario03);
		Grupo grupoPublico = new GrupoPublico("a8", "É um grupo desorganizado.", usuario02);

		// 2 Caronas
		
		Carona caronaPublica = new CaronaPublica(new CaronaCaronante(caronante01));
		Carona caronaPrivada = new CaronaPrivada(new CaronaCaronante(caronante00));
		
		// Associe as caronas com os grupos
		
		((CaronaPrivada)caronaPrivada).adicionarGrupo((GrupoPrivado)grupoPrivado);
		((CaronaPublica)caronaPublica).adicionarGrupo((GrupoPublico)grupoPublico);
		
		// Adicionar 2 usuários / grupo
		
		grupoPrivado.adicionarMembro(usuario03);
		grupoPrivado.adicionarMembro(usuario02);
		grupoPublico.adicionarMembro(usuario01);
		grupoPublico.adicionarMembro(usuario02);
		
		// 1 usuário ofereça carona
		
		Carona carona1 = usuario00.getPerfil().getCaronante().oferecerCarona();
		
		// 1 usuário solicita carona
		usuario02.getPerfil().getCaroneiro().pedirCarona(carona1);
		
		// Gerar avaliação para a carona1
		carona1.atribuirNotaCaronante(5);
		int idCaroneiro1 = carona1.getCaroneiros().get(0).
				getCaroneiro().getPerfil().getUsuario().getId();
		carona1.atribuirNotaCaroneiro(idCaroneiro1, 5);
		System.out.println("\n\nAvaliação da Carona1: ");
		System.out.println(carona1);
		
		
		// Gerar avaliação para a caronaPublica
		caronaPublica.atribuirNotaCaronante(5);
		int idCaroneiroPublica = caronaPublica.getCaroneiros().get(0).
				getCaroneiro().getPerfil().getUsuario().getId();
		caronaPublica.atribuirNotaCaroneiro(idCaroneiroPublica, 5);
		System.out.println("Avaliação da CaronaPublica: ");
		System.out.println(caronaPublica);
		
		// Gerar avaliação para a caronaPrivada
		caronaPrivada.atribuirNotaCaronante(5);
		int idCaroneiroPrivada = caronaPrivada.getCaroneiros().get(0).
				getCaroneiro().getPerfil().getUsuario().getId();
		caronaPrivada.atribuirNotaCaroneiro(idCaroneiroPrivada, 5);
		System.out.println("Avaliação da Carona1: ");
		System.out.println(caronaPrivada);
		
		// Liste todos os usuários de cada grupo
		System.out.println("Listando todos os Usuários de cada Grupo:");
		listeTodosUsuarios(grupoPrivado);
		listeTodosUsuarios(grupoPublico);
		
		// Liste todos os grupos de cada usuário
		System.out.println("Listando todos os Grupos de cada Usuario");
		for (Usuario usuario : usuarios)
			listeTodosGrupos(usuario);
		
		
		// 2)
		
		Grupo a = new GrupoPublico();
		
		// Assim não: a.testeDinamico();
		
		// Assim sim:
		((GrupoPublico)a).testeDinamico();
	}
	
	private static void listeTodosUsuarios(Grupo grupo) {
		for (GrupoUsuario usuario : grupo.getMembros())
			System.out.println(usuario.getUsuario());
	}
	
	private static void listeTodosGrupos(Usuario usuario) {
		for (GrupoUsuario grupo : usuario.getGrupos())
			System.out.println(grupo.getGrupo());
	}
}
