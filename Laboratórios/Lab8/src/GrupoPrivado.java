import java.util.ArrayList;

public class GrupoPrivado extends Grupo {
	private ArrayList<CaronaPrivada> caronas;
	
	public GrupoPrivado() {
		super();
		this.caronas = new ArrayList<CaronaPrivada>();
	}

	public GrupoPrivado(Usuario dono) {
		super(dono);
		this.caronas = new ArrayList<CaronaPrivada>();
	}

	public GrupoPrivado(String nome, String descricao, Usuario dono) {
		super(nome, descricao, dono);
		this.caronas = new ArrayList<CaronaPrivada>();
	}

	public ArrayList<CaronaPrivada> getCaronas() {
		return caronas;
	}

	public void setCaronas(ArrayList<CaronaPrivada> caronas) {
		this.caronas = caronas;
	}

	@Override
	public void adicionarMembro(Usuario usuario) {
		getMembros().add(new GrupoUsuario(this, usuario));
	}

	@Override
	public String toString() {
		String out = "\n";
		out += "- id: " + getId() + "\n";
		out += "- nome: " + getNome() + "\n";
		out += "- descrição: " + getDescricao() + "\n";
		return out;
	}


}
