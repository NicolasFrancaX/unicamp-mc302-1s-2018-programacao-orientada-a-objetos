import java.util.ArrayList;

// Questão 2) public final class GrupoPublico extends Grupo {
public class GrupoPublico extends Grupo {
	private ArrayList<CaronaPublica> caronas;

	/*
	 * Questão 3)
	 * private static int testStatic = 2;
	 * private int testStatic = 2;
	 *
	 * public int getTestStatic() {
	 *	return testStatic;
	 * }
	 */
	
	public GrupoPublico(String nome, String descricao) {
		super(nome, descricao);
	}

	/*
	public void adicionarMembro(Usuario usuario) {
		caronas.add(usuario);
	}
	*/
	
	public ArrayList<CaronaPublica> getCaronas() {
		return caronas;
	}

	public void setCaronas(ArrayList<CaronaPublica> caronas) {
		this.caronas = caronas;
	}

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
