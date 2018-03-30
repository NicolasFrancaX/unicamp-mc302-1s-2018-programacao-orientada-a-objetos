
public class Caronante {
	private int tempoHabilitacao;
	private String generoMusicalFavorito;
	private String placaVeiculo;
	private String carteiraMotorista;
	private String marcaVeiculo;
	private int assentosDisponiveis;
	private static int numCaroneiros;
	
	public Caronante() {
		this.numCaroneiros++;
	}
	
	public int getTempoHabilitacao() {
		return tempoHabilitacao;
	}
	public void setTempoHabilitacao(int tempoHabilitacao) {
		this.tempoHabilitacao = tempoHabilitacao;
	}
	public String getGeneroMusicalFavorito() {
		return generoMusicalFavorito;
	}
	public void setGeneroMusicalFavorito(String generoMusicalFavorito) {
		this.generoMusicalFavorito = generoMusicalFavorito;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getCarteiraMotorista() {
		return carteiraMotorista;
	}
	public void setCarteiraMotorista(String carteiraMotorista) {
		this.carteiraMotorista = carteiraMotorista;
	}
	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}
	public int getAssentosDisponiveis() {
		return assentosDisponiveis;
	}
	public void setAssentosDisponiveis(int assentosDisponiveis) {
		this.assentosDisponiveis = assentosDisponiveis;
	}
	public static int getNumCaroneiros() {
		return numCaroneiros;
	}
	public static void setNumCaroneiros(int numCaroneiros) {
		Caronante.numCaroneiros = numCaroneiros;
	}
	
	@Override
	public String toString() {
		return "Caronante [tempoHabilitacao=" + tempoHabilitacao + ", generoMusicalFavorito=" + generoMusicalFavorito
				+ ", placaVeiculo=" + placaVeiculo + ", carteiraMotorista=" + carteiraMotorista + ", marcaVeiculo="
				+ marcaVeiculo + ", assentosDisponiveis=" + assentosDisponiveis + "]";
	}
	
	
	
}
