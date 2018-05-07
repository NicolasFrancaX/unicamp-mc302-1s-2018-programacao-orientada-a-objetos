import java.util.ArrayList;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String senha;
	private boolean status;
	private ArrayList<Grupo> grupos;
	private Perfil perfil;
	private static int geradorId;
	
	// Método Construtor:
	public Usuario(String nome, String email, String senha, boolean status,
			Perfil perfil) {
		this.id = geradorId;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.status = status;
		this.grupos = new ArrayList<Grupo>();
		Usuario.geradorId++;
		this.setPerfil(perfil);
	}
	
	public void adicionarGrupo(Grupo grupo) {
		grupos.add(grupo);
	}
	
	// Métodos getters and setters:
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public static int getGeradorId() {
		return geradorId;
	}

	public static void setGeradorId(int geradorId) {
		Usuario.geradorId = geradorId;
	}

	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}

	// Método toString:
	@Override
	public String toString() {
		String out = "\n";
		out += "- id: " + this.id + "\n";
		out += "- nome: " + this.nome + "\n";
		out += "- email: " + this.email + "\n";
		out += "- senha: " + this.senha + "\n";
		out += "- status: " + this.status + "\n";
		out += "- grupos: " + this.grupos + "\n";
		// out += "- perfil: " + this.perfil + "\n";
		return out;
	}
}
