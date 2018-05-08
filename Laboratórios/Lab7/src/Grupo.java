import java.util.ArrayList;

public abstract class Grupo {
	private int id;
	private String nome;
	private String descricao;
	private ArrayList<GrupoUsuario> membros;
	private Usuario dono;
	private static int geradorId;

	// Grupo Fantasma, pra resolver bug...
	// Não é elegante.
	public Grupo() {
	}

	public Grupo(Usuario dono) {
		this.id = geradorId;
		this.membros = new ArrayList<GrupoUsuario>();
		this.dono = dono;
		Grupo.geradorId++;
	}

	public Grupo(String nome, String descricao, Usuario dono) {
		this.id = geradorId;
		this.nome = nome;
		this.descricao = descricao;
		this.membros = new ArrayList<GrupoUsuario>();
		this.dono = dono;
		Grupo.geradorId++;
	}
	
	public abstract void adicionarMembro(Usuario usuario); 
	
	public void alterarDono(Usuario novoDono, Usuario antigoDono) {
		setDono(novoDono);
	}
	
	public Usuario getDono() {
		return dono;
	}

	public void setDono(Usuario dono) {
		this.dono = dono;
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

	public ArrayList<GrupoUsuario> getMembros() {
		return membros;
	}

	public void setMembros(ArrayList<GrupoUsuario> membros) {
		this.membros = membros;
	}

	public static int getGeradorId() {
		return geradorId;
	}

	public static void setGeradorId(int geradorId) {
		Grupo.geradorId = geradorId;
	}

	@Override
	public String toString() {
		String out = "\n";
		out += "- id: " + this.id + "\n";
		out += "- nome: " + this.nome + "\n";
		out += "- dono: " + this.dono + "\n";
		out += "- descrição: " + this.descricao + "\n";
		return out;
	}
}
