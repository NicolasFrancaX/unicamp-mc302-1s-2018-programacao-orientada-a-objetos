import java.util.ArrayList;

// public final class Grupo {
public class Grupo {
	private int id;
	private String nome;
	private String descricao;
	private ArrayList<Usuario> membros;
	private static int geradorId;

	/*
	 * Questão 3)
	 * private static int testStatic = 1;
	 * private int testStatic = 1;
	 * 
	 * public int getTestStatic() {
	 * 		return testStatic;
	 * }
	 */

	public Grupo(String nome, String descricao) {
		this.id = geradorId;
		this.nome = nome;
		this.descricao = descricao;
		this.membros = new ArrayList<Usuario>();
		Grupo.geradorId++;
	}
	
	public void adicionarMembro(Usuario usuario) {
		membros.add(usuario);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Usuario> getMembros() {
		return membros;
	}

	public void setMembros(ArrayList<Usuario> membros) {
		this.membros = membros;
	}

	public static int getGeradorId() {
		return geradorId;
	}

	public static void setGeradorId(int geradorId) {
		Grupo.geradorId = geradorId;
	}

	// Método toString:
	@Override
	public String toString() {
		String out = "Grupo\n";
		out += "- id: " + this.id + "\n";
		out += "- nome: " + this.nome + "\n";
		out += "- descrição: " + this.descricao + "\n";
		// out += "- membros: " + this.membros + "\n";
		return out;
	}
}
