import java.util.ArrayList;

public class Caroneiro {
	private String cartaoDeCredito;
	private ArrayList<CaronaCaroneiro> caronas;
	private Perfil perfil;

	// Perguntar professora: private boolean pagamentoEmDinheiro;
	// private static int numCaronantes;
	
	public Caroneiro() {
		// Caroneiro.numCaronantes++;
	}
	
	public Caroneiro(String cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}
	
	public Caroneiro(String cartaoDeCredito, Perfil perfil) {
		this.cartaoDeCredito = cartaoDeCredito;
		this.perfil = perfil;
		// Caroneiro.numCaronantes++;
	}

	/*
	public Caroneiro(boolean pagamentoEmDinheiro) {
		this.pagamentoEmDinheiro = pagamentoEmDinheiro;
		Caroneiro.numCaronantes++;
	}
	*/
		
	public String getCartaoDeCredito() {
		return cartaoDeCredito;
	}
	
	public void setCartaoDeCredito(String cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}

	public ArrayList<CaronaCaroneiro> getCaronas() {
		return caronas;
	}

	public void setCaronas(ArrayList<CaronaCaroneiro> caronas) {
		this.caronas = caronas;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	/*
	public boolean isPagamentoEmDinheiro() {
		return pagamentoEmDinheiro;
	}
	public void setPagamentoEmDinheiro(boolean pagamentoEmDinheiro) {
		this.pagamentoEmDinheiro = pagamentoEmDinheiro;
	}
	public static int getNumCaronantes() {
		return numCaronantes;
	}
	public static void setNumCaronantes(int numCaronantes) {
		Caroneiro.numCaronantes = numCaronantes;
	}
	*/
	
	// Método toString:
	@Override
	public String toString() {
		String out = "Caroneiro\n";
		out += "- cartão de crédito: " + this.cartaoDeCredito + "\n";
		// out += "- perfil: " + this.perfil + "\n";
		// out += "- caronas: " + this.caronas + "\n";
		return out;
	}

}
