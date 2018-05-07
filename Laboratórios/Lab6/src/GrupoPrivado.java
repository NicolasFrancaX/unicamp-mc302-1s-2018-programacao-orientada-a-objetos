import java.util.ArrayList;

public class GrupoPrivado extends Grupo {
	private ArrayList<CaronaPrivada> caronas;

	public GrupoPrivado(String nome, String descricao) {
		super(nome, descricao);
	}

	public ArrayList<CaronaPrivada> getCaronas() {
		return caronas;
	}

	public void setCaronas(ArrayList<CaronaPrivada> caronas) {
		this.caronas = caronas;
	}

	/*
	public void adicionarMembro(Usuario usuario) {
		caronas.add(usuario);
	}
	*/

	// Método toString:
	@Override
	public String toString() {
		String out = "\n";
		out += "- id: " + getId() + "\n";
		out += "- nome: " + getNome() + "\n";
		out += "- descrição: " + getDescricao() + "\n";
		// out += "- membros: " + getMembros() + "\n";
		// out += "- caronas: " + this.caronas + "\n";
		return out;
	}

}
