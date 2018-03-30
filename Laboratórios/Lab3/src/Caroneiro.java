
public class Caroneiro {
	private String cartaoDeCredito;
	private boolean pagamentoEmDinheiro;
	private static int numCaronantes;
	
	public Caroneiro() {
		Caroneiro.numCaronantes++;
	}
	
	public Caroneiro(String cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
		Caroneiro.numCaronantes++;
	}
	
	public Caroneiro(boolean pagamentoEmDinheiro) {
		this.pagamentoEmDinheiro = pagamentoEmDinheiro;
		Caroneiro.numCaronantes++;
	}
		
	public String getCartaoDeCredito() {
		return cartaoDeCredito;
	}
	public void setCartaoDeCredito(String cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}
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
	
	@Override
	public String toString() {
		return "Caroneiro [cartaoDeCredito=" + cartaoDeCredito + ", pagamentoEmDinheiro=" + pagamentoEmDinheiro + "]";
	}
}
