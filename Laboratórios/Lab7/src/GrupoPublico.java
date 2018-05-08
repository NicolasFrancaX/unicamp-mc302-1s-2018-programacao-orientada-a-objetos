import java.util.ArrayList;

public class GrupoPublico extends Grupo {
	private ArrayList<CaronaPublica> caronas;

	public GrupoPublico() {
		super();
		this.caronas = new ArrayList<CaronaPublica>();
	}

	public GrupoPublico(Usuario dono) {
		super(dono);
		this.caronas = new ArrayList<CaronaPublica>();
	}

	public GrupoPublico(String nome, String descricao, Usuario dono) {
		super(nome, descricao, dono);
		this.caronas = new ArrayList<CaronaPublica>();
	}

	public ArrayList<CaronaPublica> getCaronas() {
		return caronas;
	}

	public void setCaronas(ArrayList<CaronaPublica> caronas) {
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
	
	
	// 2)
	
	public void testeDinamico() {
		System.out.println("Teste Dinâmico");
	}
}
