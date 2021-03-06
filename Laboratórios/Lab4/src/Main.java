/*
 * 
 * Questões:
 * 
 * 1) R: O principal benefício da Herança é a reutilização de código, utilizando o
 * 		 encapsulamento como base.
 * 
 * 		 Mas um outro benefício muito útil é a possibilidade de fazer Polimorfismo.
 * 
 * 		 Um exemplo: 
 * 
 * 		 Se temos uma classe Animal, e classes que herdam de Animal como Pato, Gato e etc.
 * 
 * 		 Caso tenhamos: Animal pato, podemos fazer: pato = new Pato; 
 * 					    Animal gato, podemos fazer: gato = new Gato;
 * 
 * 		 Isso nos permite fazer um array de Animal que tenham objetos de tipos diferentes 
 * 		 (que sejam herdados de Animal).
 * 
 * 
 * 2) R: Temos o seguinte erro de compilação:
 * 
 *		 Error: A JNI error has occurred, please check your installation and try again
		 Exception in thread "main" java.lang.VerifyError: Cannot inherit from final class
			at java.lang.ClassLoader.defineClass1(Native Method)
			at java.lang.ClassLoader.defineClass(ClassLoader.java:763)
			at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
			at java.net.URLClassLoader.defineClass(URLClassLoader.java:467)
			at java.net.URLClassLoader.access$100(URLClassLoader.java:73)
			at java.net.URLClassLoader$1.run(URLClassLoader.java:368)
			at java.net.URLClassLoader$1.run(URLClassLoader.java:362)
			at java.security.AccessController.doPrivileged(Native Method)
			at java.net.URLClassLoader.findClass(URLClassLoader.java:361)
			at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
			at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:335)
			at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
			at java.lang.Class.getDeclaredMethods0(Native Method)
			at java.lang.Class.privateGetDeclaredMethods(Class.java:2701)
			at java.lang.Class.privateGetMethodRecursive(Class.java:3048)
			at java.lang.Class.getMethod0(Class.java:3018)
			at java.lang.Class.getMethod(Class.java:1784)
			at sun.launcher.LauncherHelper.validateMainClass(LauncherHelper.java:544)
			at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:526) 
 * 		 
 * 		 Adicionando "final" na classe Grupo, essa classe não vai ter possibilidade
 * 		 de ter herdeiras. Ou seja, ela é a última classe da "família" (que tem como
 * 		 raíz a classe Object).
 * 
 * 		 Logo, como GrupoPublico e GrupoPrivado herdam dessa classe, não vai ser
 * 		 possível compilar esses códigos. 
 * 		
 * 		 Se definirmos GrupoPublico como final, não vai acontecer nada com o código
 * 		 que já temos. Mas se tentarmos herdar dela, teremos problemas.
 * 
 * 
 * 3) R: A classe GrupoPublico foi chamada para a, b e c.
 * 		
 * 		 Alterando parar ficar sem static, acontece o mesmo resultado. Ou seja, a classe GrupoPublico
 *  	 é a chamada.
 * 		 
 * Observação: Se não tivermos cuidado com os atributos do toString, teremos
 * Stackoverflow constantes. Principalmente no relacionamento Caroneiro 1<->1 Perfil;
 * Caronante 1<->1 Perfil; Usuario 1<->1 Perfil; Grupos n<->n Usuario.
 * 
 */

public class Main {

	public static void main(String[] args) {
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
		
		Grupo grupo = new Grupo("Só os que tem família unida", "Aqui tem pessoas que tem família unida.");
		
		grupo.adicionarMembro(usuario00);
		grupo.adicionarMembro(usuario01);
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
		
		System.out.println(caronante00);
		System.out.println(caronante01);
		System.out.println(perfil00);
		System.out.println(perfil01);

		// 4.2 3)
		System.out.println("Gerador de ID do Usuário: " + Usuario.getGeradorId());

		System.out.println(usuario00);

		// 4.2 3)
		System.out.println("Gerador de ID do Usuário: " + Usuario.getGeradorId());

		System.out.println(usuario01);
		
		// 4.2 3)
		System.out.println("Gerador de ID do Usuário: " + Usuario.getGeradorId());
		
		// 4.2 3)
		System.out.println("Gerador de ID do Grupo: " + Grupo.getGeradorId());
		System.out.println(grupo);

		// 4.2 3)
		System.out.println("Gerador de ID do Grupo: " + Grupo.getGeradorId());
		System.out.println(grupoPrivado);

		// 4.2 3)
		System.out.println("Gerador de ID do Grupo: " + Grupo.getGeradorId());
		System.out.println(grupoPublico);

		// 4.2 3)
		System.out.println("Gerador de ID do Grupo: " + Grupo.getGeradorId());
		
		/* Questão 3)
		 * Grupo a = new Grupo("nome", "descricao");
		 * GrupoPublico b = new GrupoPublico("nome", "descricao");
		 * GrupoPublico c = new GrupoPublico("nome2", "descricao2");
		 * 
		 * a = b;
		 * b = c;
		 * 
		 * System.out.println(a.getTestStatic());
		 * System.out.println(b.getTestStatic());
		 * System.out.println(c.getTestStatic());
		 */
	}

}
