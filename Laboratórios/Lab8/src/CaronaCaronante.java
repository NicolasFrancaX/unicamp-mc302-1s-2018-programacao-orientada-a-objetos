
public class CaronaCaronante {
	private Caronante caronante;
	private Carona carona;
	private float avaliacao;

	public CaronaCaronante(Caronante caronante) {
		this.caronante = caronante;
	}

	public CaronaCaronante(Caronante caronante, Carona carona, float avaliacao) {
		this.caronante = caronante;
		this.carona = carona;
		this.avaliacao = avaliacao;
	}

	public Caronante getCaronante() {
		return caronante;
	}

	public void setCaronante(Caronante caronante) {
		this.caronante = caronante;
	}

	public Carona getCarona() {
		return carona;
	}

	public void setCarona(Carona carona) {
		this.carona = carona;
	}

	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	@Override
	public String toString() {
		String out = "\n";
		out += "- perfil: " + getCaronante().getPerfil() + "\n";
		out += "- caronante: " + getCaronante() + "\n";
		out += "- avaliacao: " + getAvaliacao() + "\n";
		return out;
	}
}
