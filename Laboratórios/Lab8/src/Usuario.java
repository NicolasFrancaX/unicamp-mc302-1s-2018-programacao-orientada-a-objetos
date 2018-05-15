import java.util.ArrayList;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String senha;
	private boolean status;
	private ArrayList<GrupoUsuario> grupos;
	private Perfil perfil;

	private static int geradorId;
	
	public Usuario(String nome, String email, String senha, boolean status,
			Perfil perfil) {
		this.id = geradorId;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.status = status;
		this.grupos = new ArrayList<GrupoUsuario>();
		Usuario.geradorId++;
		this.setPerfil(perfil);
	}
	
	public void atualizarGrupo(Usuario dono, int idGrupo, String nome, String descricao) {
		if (dono.equals(this)) {
			grupos.get(idGrupo).getGrupo().setNome(nome);
			grupos.get(idGrupo).getGrupo().setDescricao(descricao);
		}
	}
	
	public void atualizarGrupo(Usuario dono, int idGrupo, String descricao) {
		if (dono.equals(this)) {
			grupos.get(idGrupo).getGrupo().setDescricao(descricao);
		}
	}

	public boolean removerGrupo(int id) {
		for (int i = 0; i < grupos.size(); i++)
			if (grupos.get(i).getGrupo().getId() == id)
				return grupos.remove(grupos.get(i));
		
		return false;
	}

	public boolean removerGrupo(Grupo grupo) {
		for (int i = 0; i < grupos.size(); i++)
			if (grupos.get(i).getGrupo().equals(grupo))
				return grupos.remove(grupos.get(i));
		
		return false;
	}

	public void adicionarGrupo(Grupo grupo) {
		grupos.add(new GrupoUsuario(grupo, this));
	
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

	public ArrayList<GrupoUsuario> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<GrupoUsuario> grupos) {
		this.grupos = grupos;
	}

	@Override
	public String toString() {
		String out = "\n";
		out += "- id: " + this.id + "\n";
		out += "- nome: " + this.nome + "\n";
		out += "- email: " + this.email + "\n";
		out += "- senha: " + this.senha + "\n";
		out += "- status: " + this.status + "\n";
		out += "- grupos: " + this.grupos + "\n";
		return out;
	}
}
