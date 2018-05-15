
public class GrupoUsuario {
	private int id;
	private static int geradorId;
	private Usuario usuario;
	private Grupo grupo;
	
	public GrupoUsuario(Grupo grupo, Usuario usuario) {
		this.id = geradorId;
		geradorId++;
		this.grupo = grupo;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
}
