import java.util.ArrayList;

public class CaronaPrivada extends Carona {
	private ArrayList<GrupoPrivado> grupos;

	public CaronaPrivada(Caronante caronante) {
		super(caronante);
	}

	public CaronaPrivada(Caronante caronante, double latitudeEncontro, double longitudeEncontro, double latitudeDestino,
			double longitudeDestino, String horaDiaEncontro, int ocupacaoMaxima, int assentosDisponiveis, float valor) {
		super(caronante, latitudeEncontro, longitudeEncontro, latitudeDestino, longitudeDestino, horaDiaEncontro,
				ocupacaoMaxima, assentosDisponiveis, valor);
	}

	public CaronaPrivada(Caronante caronante, double latitudeEncontro, double longitudeEncontro, double latitudeDestino,
			double longitudeDestino, String horaDiaEncontro, int ocupacaoMaxima, int assentosDisponiveis) {
		super(caronante, latitudeEncontro, longitudeEncontro, latitudeDestino, longitudeDestino, horaDiaEncontro,
				ocupacaoMaxima, assentosDisponiveis);
	}

	public CaronaPrivada(Caronante caronante, double latitudeEncontro, double longitudeEncontro, double latitudeDestino,
			double longitudeDestino, String horaDiaEncontro, int assentosDisponiveis) {
		super(caronante, latitudeEncontro, longitudeEncontro, latitudeDestino, longitudeDestino, horaDiaEncontro, assentosDisponiveis);
	}
	

	public boolean adicionarCaroneiro(Caroneiro caroneiro) {
		return adicionarCaroneiro(caroneiro);
	}
	
	public boolean adicionarGrupo(GrupoPrivado grupo) {
		return grupos.add(grupo); 
	}

	@Override
	public String toString() {
		String out = "CaronaPublica: \n";
		out += "- caronante: " + getCaronante();
		out += "- valor: " + getValor() + "\n";
		out += "- formas de pagamento" + getFormaPagAceitas() + "\n";
		out += "- ocupação máxima: " + getOcupacaoMaxima() + "\n";
		out += "- assentos disponíveis: " + getAssentosDisponiveis() + "\n";
		out += "- caroneiros: " + getCaroneiros() + "\n";
		out += "- latitude do encontro: " + getLatitudeEncontro() + "\n";
		out += "- longitude do encontro: " + getLongitudeEncontro() + "\n";
		out += "- latitude do destino: " + getLatitudeDestino() + "\n";
		out += "- longitute do destino" + getLongitudeDestino() + "\n";
		out += "- hora e dia do encontro: " + getHoraDiaEncontro() + "\n";
		return out;
	}

}
