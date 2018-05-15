import java.util.ArrayList;

public class Caroneiro {
	private String cartaoDeCredito;
	private ArrayList<CaronaCaroneiro> caronas;
	private Perfil perfil;

	public Caroneiro() {}
	
	public Caroneiro(String cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}
	
	public Caroneiro(String cartaoDeCredito, Perfil perfil) {
		this.cartaoDeCredito = cartaoDeCredito;
		this.perfil = perfil;
	}
		
	public boolean pedirCarona(Carona carona) {
		return carona.adicionarCaroneiro(this);
	}
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
	
	@Override
	public String toString() {
		String out = "\n";
		out += "- cartão de crédito: " + this.cartaoDeCredito + "\n";
		return out;
	}

}
