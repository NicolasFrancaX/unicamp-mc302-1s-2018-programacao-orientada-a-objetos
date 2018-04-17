
public class Main {

	public static void main(String[] args) {

		/* 
		 * Instanciando objetos das demais classes necessárias para a possibilidade da instanciação das classes relacionadas
		 * a Carona.
		 * 
		 */
		
		Caronante caronante00 = new Caronante(0, "Rock", "453-23", "12345", "VW", "Golf");
		Caroneiro caroneiro00 = new Caroneiro("1111111");

		Perfil perfil00 = new Perfil('m', "19/09/1996", "Carapicuíba", "SP", "11945431236", false, 5, caroneiro00,
				caronante00);
		Usuario usuario00 = new Usuario("Nicolas", "nicolasfranca9@gmail.com", "12345", true, perfil00);
		
		caronante00.setPerfil(perfil00);
		caroneiro00.setPerfil(perfil00);
		
		Caronante caronante01 = new Caronante(0, "Samba", "453-22", "123432", "Ford", "K");
		Caroneiro caroneiro01 = new Caroneiro("1111122");

		Perfil perfil01 = new Perfil('f', "19/09/1997", "Carapicuíba", "SP", "11945431237", false, 5, caroneiro01,
				caronante01);
		Usuario usuario01 = new Usuario("Gabriel", "gabriel@gmail.com", "123532", true, perfil01);
		
		caronante01.setPerfil(perfil01);
		caroneiro01.setPerfil(perfil01);
		
		Caronante caronante02 = new Caronante(0, "Eletrônica", "453-24", "12346", "Ford", "Focus");
		Caroneiro caroneiro02 = new Caroneiro("1111112");

		Perfil perfil02 = new Perfil('m', "19/09/1997", "Osasco", "SP", "11945431253", false, 5, caroneiro02,
				caronante02);
		Usuario usuario02 = new Usuario("Bruno", "bruno@gmail.com", "12346", true, perfil02);
		
		caronante02.setPerfil(perfil02);
		caroneiro02.setPerfil(perfil02);

		Grupo grupo = new Grupo("Só os que tem família unida", "Aqui tem pessoas que tem família unida.");
		
		grupo.adicionarMembro(usuario00);
		grupo.adicionarMembro(usuario01);
		grupo.adicionarMembro(usuario02);
		usuario00.adicionarGrupo(grupo);
		usuario01.adicionarGrupo(grupo);

		GrupoPrivado grupoPrivado = new GrupoPrivado("grupoPrivado", "Esse é um grupo privado.");
		GrupoPublico grupoPublico = new GrupoPublico("grupoPublico", "Esse é um grupo publico.");
		
		usuario00.adicionarGrupo(grupoPublico);
		usuario01.adicionarGrupo(grupoPublico);
		grupoPublico.adicionarMembro(usuario00);
		grupoPublico.adicionarMembro(usuario01);

		usuario00.adicionarGrupo(grupoPrivado);
		usuario01.adicionarGrupo(grupoPrivado);
		grupoPrivado.adicionarMembro(usuario00);
		grupoPrivado.adicionarMembro(usuario01);

		/*
		 * Instanciação e utilização das classes caronas e teste do enum MetodoPagamento.
		 *
		 */
		
		Carona carona = new Carona(caronante01, 0, 0, 0, 0, "10:34 12/04/2018", 4, 12);
		
		// Testando carona
		System.out.println("carona (Carona):\n");
		
		// Adicione a forma de pagamento CartaoDeCredito
		System.out.println("Adicionando a forma de Pagamento CartaoDeCredito");
		carona.adicionarFormaPagamento(MetodoPagamento.CARTAODECREDITO);
		
		// Adicione a forma de pagamento Dinheiro
		System.out.println("Adicionando a forma de pagamento Dinheiro");
		carona.adicionarFormaPagamento(MetodoPagamento.DINHEIRO);
		
		// Verificar se todas essas formas de pagamento estão de fato incluidas
		System.out.println("Verficando as formas de pagamento incluidas");
		System.out.println(carona);
		
		// Verifique se a carona é gratuita
		System.out.println("A carona é gratuita?");
		System.out.println(carona.caronaGratuita());		

		// Verifique se a carona aceita Dinheiro
		System.out.println("A carona aceita dinheiro?");
		System.out.println(carona.checarExistenciaFormaPagamento(MetodoPagamento.DINHEIRO));
		
		// Remova a forma de pagamento Dinheiro
		System.out.println("Removendo a forma de pagamento dinheiro");
		carona.removerFormaPagamento(MetodoPagamento.DINHEIRO);
		
		// Adicione a forma de pagamento Gratis
		System.out.println("Adicionando a forma de pagamento Gratis");
		carona.adicionarFormaPagamento(MetodoPagamento.GRATIS);
		
		// Verifique se a carona aceita Dinheiro
		System.out.println("A carona aceita dinheiro?");
		System.out.println(carona.checarExistenciaFormaPagamento(MetodoPagamento.DINHEIRO));
		
		// Verifique se a carona é gratuita
		System.out.println("A carona é gratuita?");
		System.out.println(carona.caronaGratuita());
		
		System.out.println("");
	
		// --------------------- ## --------------------- // 
		
		CaronaPrivada caronaPrivada = new CaronaPrivada(caronante00, 0, 0, 0, 0, "10:35 13/04/2018", 7, 15); // é uma van

		System.out.println("caronaPrivada (CaronaPrivada):\n");

		// Adicione a forma de pagamento CartaoDeCredito
		System.out.println("Adicionando a forma de Pagamento CartaoDeCredito");
		caronaPrivada.adicionarFormaPagamento(MetodoPagamento.CARTAODECREDITO);
		
		// Adicione a forma de pagamento Dinheiro
		System.out.println("Adicionando a forma de pagamento Dinheiro");
		caronaPrivada.adicionarFormaPagamento(MetodoPagamento.DINHEIRO);
		
		// Verifique se a caronaPrivada é gratuita
		System.out.println("A carona é gratuita?");
		System.out.println(caronaPrivada.caronaGratuita());		

		// Verifique se a caronaPrivada aceita Dinheiro
		System.out.println("A carona aceita dinheiro?");
		System.out.println(caronaPrivada.checarExistenciaFormaPagamento(MetodoPagamento.DINHEIRO));
		
		// Remova a forma de pagamento Dinheiro
		System.out.println("Removendo a forma de pagamento dinheiro");
		caronaPrivada.removerFormaPagamento(MetodoPagamento.DINHEIRO);
		
		// Adicione a forma de pagamento Gratis
		System.out.println("Adicionando a forma de pagamento Gratis");
		caronaPrivada.adicionarFormaPagamento(MetodoPagamento.GRATIS);
		
		// Verifique se a caronaPrivada aceita Dinheiro
		System.out.println("A carona aceita dinheiro?");
		System.out.println(caronaPrivada.checarExistenciaFormaPagamento(MetodoPagamento.DINHEIRO));
		
		// Verifique se a caronaPrivada é gratuita
		System.out.println("A carona é gratuita?");
		System.out.println(caronaPrivada.caronaGratuita());
	
		System.out.println("");

		// --------------------- ## --------------------- // 

		CaronaPublica caronaPublica = new CaronaPublica(caronante02, 0, 0, 0, 0, "11:40 14/04/2018", 2, 18/2); // é uma picape

		System.out.println("caronaPublica (CaronaPublica):\n");
		
		// Adicione a forma de pagamento CartaoDeCredito
		System.out.println("Adicionando a forma de Pagamento CartaoDeCredito");
		caronaPublica.adicionarFormaPagamento(MetodoPagamento.CARTAODECREDITO);
		
		// Adicione a forma de pagamento Dinheiro
		System.out.println("Adicionando a forma de pagamento Dinheiro");
		caronaPublica.adicionarFormaPagamento(MetodoPagamento.DINHEIRO);
		
		// Verifique se a caronaPublica.é gratuita
		System.out.println("A carona é gratuita?");
		System.out.println(caronaPublica.caronaGratuita());		

		// Verifique se a caronaPublica.aceita Dinheiro
		System.out.println("A carona aceita dinheiro?");
		System.out.println(caronaPublica.checarExistenciaFormaPagamento(MetodoPagamento.DINHEIRO));
		
		// Remova a forma de pagamento Dinheiro
		System.out.println("Removendo a forma de pagamento dinheiro");
		caronaPublica.removerFormaPagamento(MetodoPagamento.DINHEIRO);
		
		// Adicione a forma de pagamento Gratis
		System.out.println("Adicionando a forma de pagamento Gratis");
		caronaPublica.adicionarFormaPagamento(MetodoPagamento.GRATIS);
		
		// Verifique se a caronaPublica.aceita Dinheiro
		System.out.println("A carona aceita dinheiro?");
		System.out.println(caronaPublica.checarExistenciaFormaPagamento(MetodoPagamento.DINHEIRO));
		
		// Verifique se a caronaPublica.é gratuita
		System.out.println("A carona é gratuita?");
		System.out.println(caronaPublica.caronaGratuita());
	
		System.out.println("");

		// --------------------- ## --------------------- // 
		
		// imprima o conteúdo das três instâncias utilizando seus respectivos métodos toString
		
		System.out.println(carona);
		System.out.println(caronaPrivada);
		System.out.println(caronaPublica);
		
	}

}
