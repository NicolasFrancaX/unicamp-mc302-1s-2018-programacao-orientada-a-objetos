import java.util.ArrayList;

public abstract class Carona {
	private ArrayList<CaronaCaroneiro> caroneiros;
	private final CaronaCaronante caronante;
	private double latitudeEncontro;
	private double longitudeEncontro;
	private double latitudeDestino;
	private double longitudeDestino;
	private String horaDiaEncontro;
	private int ocupacaoMaxima;
	private float valor;
	private int assentosDisponiveis;
	private ArrayList<MetodoPagamento> formaPagAceitas;

	public Carona(CaronaCaronante caronante) {
		this.caronante = caronante;
		this.caroneiros = new ArrayList<CaronaCaroneiro>(4);
		this.formaPagAceitas = new ArrayList<MetodoPagamento>();
		this.ocupacaoMaxima = 4;
		this.assentosDisponiveis = 4;
	}
	
	public Carona(CaronaCaronante caronante, double latitudeEncontro, double longitudeEncontro, double latitudeDestino,
			double longitudeDestino, String horaDiaEncontro, int assentosDisponiveis, float valor) {
		this.caronante = caronante;
		this.latitudeEncontro = latitudeEncontro;
		this.longitudeEncontro = longitudeEncontro;
		this.latitudeDestino = latitudeDestino;
		this.longitudeDestino = longitudeDestino;
		this.horaDiaEncontro = horaDiaEncontro;
		this.assentosDisponiveis = assentosDisponiveis;
		this.ocupacaoMaxima = assentosDisponiveis;
		this.caroneiros = new ArrayList<CaronaCaroneiro>(ocupacaoMaxima);
		this.valor = valor;
		this.formaPagAceitas = new ArrayList<MetodoPagamento>();
	}

	public Carona(CaronaCaronante caronante, double latitudeEncontro, double longitudeEncontro, double latitudeDestino, double longitudeDestino,
			String horaDiaEncontro, int ocupacaoMaxima, int assentosDisponiveis, float valor) {
		this.caronante = caronante;
		this.latitudeEncontro = latitudeEncontro;
		this.longitudeEncontro = longitudeEncontro;
		this.latitudeDestino = latitudeDestino;
		this.longitudeDestino = longitudeDestino;
		this.horaDiaEncontro = horaDiaEncontro;
		this.ocupacaoMaxima = ocupacaoMaxima;
		this.assentosDisponiveis = assentosDisponiveis;
		this.caroneiros = new ArrayList<CaronaCaroneiro>(ocupacaoMaxima);
		this.formaPagAceitas = new ArrayList<MetodoPagamento>();
		this.valor = valor;
	}


	public Carona(CaronaCaronante caronante, double latitudeEncontro, double longitudeEncontro, double latitudeDestino, double longitudeDestino,
			String horaDiaEncontro, int ocupacaoMaxima, int assentosDisponiveis) {
		this.caronante = caronante;
		this.latitudeEncontro = latitudeEncontro;
		this.longitudeEncontro = longitudeEncontro;
		this.latitudeDestino = latitudeDestino;
		this.longitudeDestino = longitudeDestino;
		this.horaDiaEncontro = horaDiaEncontro;
		this.ocupacaoMaxima = ocupacaoMaxima;
		this.assentosDisponiveis = assentosDisponiveis;
		this.caroneiros = new ArrayList<CaronaCaroneiro>(ocupacaoMaxima);
		this.formaPagAceitas = new ArrayList<MetodoPagamento>();
	}

	public abstract boolean adicionarCaroneiro(Caroneiro caroneiro);
	public abstract boolean removerCaroneiro(Caroneiro caroneiro);
	
	public boolean atribuirNotaCaroneiro(int idUsuario, float avaliacao) {
		for (CaronaCaroneiro cc : caroneiros) {
			if (cc.getCaroneiro().getPerfil().getUsuario().getId() == idUsuario) {
				cc.setAvaliacao(avaliacao);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean atribuirNotaCaronante(float avaliacao) {
		if (caroneiros.isEmpty()) 
			return false;
			
		caronante.setAvaliacao(avaliacao);

		return true;
	}
	
	public int verificaOcupacao() {
		return this.ocupacaoMaxima - this.assentosDisponiveis;
	}
	
	public boolean caronaVazia() {
		return this.caroneiros.size() == 0;
	}
	
	public boolean adicionarFormaPagamento(MetodoPagamento mp) {
		if (mp == MetodoPagamento.GRATIS) {
			formaPagAceitas.removeAll(formaPagAceitas);
			valor = 0;
			return formaPagAceitas.add(mp);
		}
		
		if (mp != MetodoPagamento.GRATIS && formaPagAceitas.size() != 0 &&
				formaPagAceitas.get(0) == MetodoPagamento.GRATIS) {
			formaPagAceitas.remove(0);
		}

		return formaPagAceitas.add(mp);
	}
	
	public boolean removerFormaPagamento(MetodoPagamento mp) {
		return formaPagAceitas.remove(mp);
	}
	
	public boolean checarExistenciaFormaPagamento(MetodoPagamento mp) {
		return formaPagAceitas.contains(mp);
	}
	
	public boolean caronaGratuita() {
		return formaPagAceitas.get(0) == MetodoPagamento.GRATIS;
	}

	public ArrayList<CaronaCaroneiro> getCaroneiros() {

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

	public CaronaCaronante getCaronante() {
		return caronante;
	}
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public ArrayList<MetodoPagamento> getFormaPagAceitas() {
		return formaPagAceitas;
	}

	public void setFormaPagAceitas(ArrayList<MetodoPagamento> formaPagAceitas) {
		this.formaPagAceitas = formaPagAceitas;
	}

	public void setCaroneiros(ArrayList<CaronaCaroneiro> caroneiros) {
		this.caroneiros = caroneiros;
	}
	
	

	public String mostrarCaroneiros() {
		String out = "\n";

		for (int i = 0; i < caroneiros.size(); ++i)
			out += "Número do Caroneiro: " + i + "" + caroneiros.get(i) + "\n";
		
		return out;
	}
	
	@Override
	public String toString() {
		String out = "\n";
		out += "- caronante: " + getCaronante();
		out += "- valor: " + valor + "\n";
		out += "- formas de pagamento" + formaPagAceitas + "\n";
		out += "- ocupação máxima: " + ocupacaoMaxima + "\n";
		out += "- assentos disponíveis: " + assentosDisponiveis + "\n";
		out += "- caroneiros: " + mostrarCaroneiros() + "\n";
		out += "- latitude do encontro: " + latitudeEncontro + "\n";
		out += "- longitude do encontro: " + longitudeEncontro + "\n";
		out += "- latitude do destino: " + latitudeDestino + "\n";
		out += "- longitute do destino: " + longitudeDestino + "\n";
		out += "- hora e dia do encontro: " + horaDiaEncontro + "\n";
		return out;
	}
}
