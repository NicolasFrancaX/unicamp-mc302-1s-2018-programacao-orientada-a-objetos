import java.util.Arrays;

public class Carona {
	// private final Caroneiro[] caroneiros;
	private Caroneiro[] caroneiros;
	private final Caronante caronante;
	private double latitudeEncontro;
	private double longitudeEncontro;
	private double latitudeDestino;
	private double longitudeDestino;
	private String horaDiaEncontro;
	private int ocupacaoMaxima;
	private int assentosDisponiveis;

	/*
	 * Não entendi: 
	 * Além disso, atribua o valor do atributo
	 * assentosDisponiveis do caronante, ao valor de ocupacaoMaxima como um possível valor padrão
	 * 
	 */
	
	public Carona(Caronante caronante, double latitudeEncontro, double longitudeEncontro, double latitudeDestino,
			double longitudeDestino, String horaDiaEncontro, int assentosDisponiveis) {
		this.caronante = caronante;
		this.latitudeEncontro = latitudeEncontro;
		this.longitudeEncontro = longitudeEncontro;
		this.latitudeDestino = latitudeDestino;
		this.longitudeDestino = longitudeDestino;
		this.horaDiaEncontro = horaDiaEncontro;
		this.assentosDisponiveis = assentosDisponiveis;
		this.ocupacaoMaxima = assentosDisponiveis;
		this.caroneiros = new Caroneiro[ocupacaoMaxima];
	}

	public Carona(Caronante caronante, double latitudeEncontro, double longitudeEncontro, double latitudeDestino, double longitudeDestino,
			String horaDiaEncontro, int ocupacaoMaxima, int assentosDisponiveis) {
		this.caronante = caronante;
		this.latitudeEncontro = latitudeEncontro;
		this.longitudeEncontro = longitudeEncontro;
		this.latitudeDestino = latitudeDestino;
		this.longitudeDestino = longitudeDestino;
		this.horaDiaEncontro = horaDiaEncontro;
		this.ocupacaoMaxima = ocupacaoMaxima;
		this.assentosDisponiveis = assentosDisponiveis;
		this.caroneiros = new Caroneiro[ocupacaoMaxima];
	}

	public boolean adicionarCaroneiro(Caroneiro caroneiro) {
		if (this.assentosDisponiveis > 0) {
			this.caroneiros[this.ocupacaoMaxima - (this.assentosDisponiveis--)] = caroneiro;
			System.out.println(caroneiro + " - Assento reservado com sucesso.");
			return true;
		}
		
		System.out.println(caroneiro + " - Assento não reservado.");
		return false;
	}
	
	public int verificaOcupacao() {
		return this.ocupacaoMaxima - this.assentosDisponiveis;
	}
	
	public boolean caronaVazia() {
		return this.ocupacaoMaxima - (this.assentosDisponiveis) == 0;
	}

	@Override
	public String toString() {
		String out = "Carona: \n";
		out += "- caronante: " + caronante + "\n";
		out += "- ocupação máxima: " + ocupacaoMaxima + "\n";
		out += "- assentos disponíveis: " + assentosDisponiveis + "\n";
		out += "- caroneiros: " + Arrays.toString(caroneiros) + "\n";
		out += "- latitude do encontro: " + latitudeEncontro + "\n";
		out += "- longitude do encontro: " + longitudeEncontro + "\n";
		out += "- latitude do destino: " + latitudeDestino + "\n";
		out += "- longitute do destino" + longitudeDestino + "\n";
		out += "- hora e dia do encontro: " + horaDiaEncontro + "\n";
		
		return out;
	}

	public Caroneiro[] getCaroneiros() {
		return caroneiros;
	}

	public double getLatitudeEncontro() {
		return latitudeEncontro;
	}

	public void setLatitudeEncontro(double latitudeEncontro) {
		this.latitudeEncontro = latitudeEncontro;
	}

	public double getLongitudeEncontro() {
		return longitudeEncontro;
	}

	public void setLongitudeEncontro(double longitudeEncontro) {
		this.longitudeEncontro = longitudeEncontro;
	}

	public double getLatitudeDestino() {
		return latitudeDestino;
	}

	public void setLatitudeDestino(double latitudeDestino) {
		this.latitudeDestino = latitudeDestino;
	}

	public double getLongitudeDestino() {
		return longitudeDestino;
	}

	public void setLongitudeDestino(double longitudeDestino) {
		this.longitudeDestino = longitudeDestino;
	}

	public String getHoraDiaEncontro() {
		return horaDiaEncontro;
	}

	public void setHoraDiaEncontro(String horaDiaEncontro) {
		this.horaDiaEncontro = horaDiaEncontro;
	}

	public int getOcupacaoMaxima() {
		return ocupacaoMaxima;
	}

	public void setOcupacaoMaxima(int ocupacaoMaxima) {
		this.ocupacaoMaxima = ocupacaoMaxima;
	}

	public int getAssentosDisponiveis() {
		return assentosDisponiveis;
	}

	public void setAssentosDisponiveis(int assentosDisponiveis) {
		this.assentosDisponiveis = assentosDisponiveis;
	}

	public Caronante getCaronante() {
		return caronante;
	}

}
