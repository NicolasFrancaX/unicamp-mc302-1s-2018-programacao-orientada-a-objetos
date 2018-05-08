import java.util.ArrayList;

public class Caronante {
	private int tempoHabilitacao;
	private String generoMusicalFavorito;
	private String placaVeiculo;
	private final String carteiraMotorista; // precisa inicializar essa variável de alguma forma...
	private String marcaVeiculo;
	private String modeloVeiculo;
	private ArrayList<CaronaCaronante> caronas;
	private Perfil perfil;
	
	public Caronante(int tempoHabilitacao, String generoMusicalFavorito,
			String placaVeiculo, String carteiraMotorista, String marcaVeiculo,
			String modeloVeiculo, Perfil perfil) {
		this.tempoHabilitacao = tempoHabilitacao;
		this.generoMusicalFavorito = generoMusicalFavorito;
		this.placaVeiculo = placaVeiculo;
		this.carteiraMotorista = carteiraMotorista;
		this.marcaVeiculo = marcaVeiculo;
		this.modeloVeiculo = modeloVeiculo;
		this.perfil = perfil;
	}

	public Caronante(int tempoHabilitacao, String generoMusicalFavorito,
			String placaVeiculo, String carteiraMotorista, String marcaVeiculo,
			String modeloVeiculo) {
		this.tempoHabilitacao = tempoHabilitacao;
		this.generoMusicalFavorito = generoMusicalFavorito;
		this.placaVeiculo = placaVeiculo;
		this.carteiraMotorista = carteiraMotorista;
		this.marcaVeiculo = marcaVeiculo;
		this.modeloVeiculo = modeloVeiculo;
	}
	
	public Caronante(int tempoHabilitacao, String generoMusicalFavorito,
			String placaVeiculo, String carteiraMotorista, String marcaVeiculo,
			String modeloVeiculo, ArrayList<CaronaCaronante> caronas, Perfil perfil) {
		this.tempoHabilitacao = tempoHabilitacao;
		this.generoMusicalFavorito = generoMusicalFavorito;
		this.placaVeiculo = placaVeiculo;
		this.carteiraMotorista = carteiraMotorista;
		this.marcaVeiculo = marcaVeiculo;
		this.modeloVeiculo = modeloVeiculo;
		this.setCaronas(caronas);
		this.perfil = perfil;
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

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}
	
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public ArrayList<CaronaCaronante> getCaronas() {
		return caronas;
	}

	public void setCaronas(ArrayList<CaronaCaronante> caronas) {
		this.caronas = caronas;
	}

	// Pra resolver isso, eu coloquei uma CaronaPublica como default.
	// mas devo tomar cuidado. Pode não ser a forma correta de resolver.
	Carona oferecerCarona() {
		CaronaCaronante cc = new CaronaCaronante(this);
		Carona carona = new CaronaPublica(cc);
		cc.setCarona(carona);

		return carona;
	}

	@Override
	public String toString() {
		String out = "\n";
		out += "- tempo de habilitação: " + this.tempoHabilitacao + "\n";
		out += "- genero musical favorito: " + this.generoMusicalFavorito + "\n";
		out += "- placa do veículo: " + this.placaVeiculo + "\n";
		out += "- carteira de motorista: " + this.carteiraMotorista + "\n";
		out += "- marca do veículo: " + this.marcaVeiculo + "\n";
		return out;
	}
}
