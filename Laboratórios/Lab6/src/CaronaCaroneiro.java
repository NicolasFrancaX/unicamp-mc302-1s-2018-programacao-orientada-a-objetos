
public class CaronaCaroneiro {
	private Caroneiro caroneiro;
	private Carona carona;
	private float avaliacao;
	
	public CaronaCaroneiro(Caroneiro caroneiro, Carona carona) {
		this.caroneiro = caroneiro;
		this.carona = carona;
	}

	public CaronaCaroneiro(Caroneiro caroneiro, Carona carona, float avaliacao) {
		this.caroneiro = caroneiro;
		this.carona = carona;
		this.avaliacao = avaliacao;
	}

	public Caroneiro getCaroneiro() {
		return caroneiro;
	}

	public void setCaroneiro(Caroneiro caroneiro) {
		this.caroneiro = caroneiro;
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
		out += "- perfil: " + getCaroneiro().getPerfil() + "\n";
		out += "- caroneiro: " + getCaroneiro() + "\n";
		out += "- avaliacao: " + getAvaliacao() + "\n";
		return out;
	}
}
