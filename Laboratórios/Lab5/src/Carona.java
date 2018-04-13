import java.util.ArrayList;

public class Carona {
	private ArrayList<Caroneiro> caroneiros;
	private Caronante caronante;
	private double latitudeEncontro;
	private double longitudeEncontro;
	private double latitudeDestino;
	private double longitudeDestino;
	private String horaDiaEncontro;
	private int ocupacaoMaxima;
	private float valor;
	private int assentosDisponiveis;
	private ArrayList<MetodoPagamento> formaPagAceitas;

	public Carona(Caronante caronante) {
		this.caronante = caronante;
		this.caroneiros = new ArrayList<Caroneiro>();
		this.formaPagAceitas = new ArrayList<MetodoPagamento>();
	}
	
	public Carona(Caronante caronante, double latitudeEncontro, double longitudeEncontro, double latitudeDestino,
			double longitudeDestino, String horaDiaEncontro, int assentosDisponiveis, float valor) {
		this.caronante = caronante;
		this.latitudeEncontro = latitudeEncontro;
		this.longitudeEncontro = longitudeEncontro;
		this.latitudeDestino = latitudeDestino;
		this.longitudeDestino = longitudeDestino;
		this.horaDiaEncontro = horaDiaEncontro;
		this.assentosDisponiveis = assentosDisponiveis;
		this.ocupacaoMaxima = assentosDisponiveis;
		this.caroneiros = new ArrayList<Caroneiro>(ocupacaoMaxima);
		this.valor = valor;
		this.formaPagAceitas = new ArrayList<MetodoPagamento>();
	}

	public Carona(Caronante caronante, double latitudeEncontro, double longitudeEncontro, double latitudeDestino, double longitudeDestino,
			String horaDiaEncontro, int ocupacaoMaxima, int assentosDisponiveis, float valor) {
		this.caronante = caronante;
		this.latitudeEncontro = latitudeEncontro;
		this.longitudeEncontro = longitudeEncontro;
		this.latitudeDestino = latitudeDestino;
		this.longitudeDestino = longitudeDestino;
		this.horaDiaEncontro = horaDiaEncontro;
		this.ocupacaoMaxima = ocupacaoMaxima;
		this.assentosDisponiveis = assentosDisponiveis;
		this.caroneiros = new ArrayList<Caroneiro>(ocupacaoMaxima);
		this.formaPagAceitas = new ArrayList<MetodoPagamento>();
		this.valor = valor;
	}

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
		this.caroneiros = new ArrayList<Caroneiro>(ocupacaoMaxima);
		this.formaPagAceitas = new ArrayList<MetodoPagamento>();
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
		this.caroneiros = new ArrayList<Caroneiro>(ocupacaoMaxima);
		this.formaPagAceitas = new ArrayList<MetodoPagamento>();
	}

	public boolean adicionarCaroneiro(Caroneiro caroneiro) {
		if (this.assentosDisponiveis > 0) {
			System.out.println(caroneiro + " - Assento reservado com sucesso.");
			this.assentosDisponiveis--;
			return this.caroneiros.add(caroneiro);
		}
		
		System.out.println(caroneiro + " - Assento não reservado.");
		return false;
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
		
		if (mp != MetodoPagamento.GRATIS && formaPagAceitas.size() != 0 && formaPagAceitas.get(0) == MetodoPagamento.GRATIS) {
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

	public ArrayList<Caroneiro> getCaroneiros() {
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

	public void setCaroneiros(ArrayList<Caroneiro> caroneiros) {
		this.caroneiros = caroneiros;
	}

	@Override
	public String toString() {
		String out = "Carona: \n";
		out += "- caronante: " + caronante;
		out += "- valor: " + valor + "\n";
		out += "- formas de pagamento" + formaPagAceitas + "\n";
		out += "- ocupação máxima: " + ocupacaoMaxima + "\n";
		out += "- assentos disponíveis: " + assentosDisponiveis + "\n";
		out += "- caroneiros: " + caroneiros + "\n";
		out += "- latitude do encontro: " + latitudeEncontro + "\n";
		out += "- longitude do encontro: " + longitudeEncontro + "\n";
		out += "- latitude do destino: " + latitudeDestino + "\n";
		out += "- longitute do destino" + longitudeDestino + "\n";
		out += "- hora e dia do encontro: " + horaDiaEncontro + "\n";
		return out;
	}
}
