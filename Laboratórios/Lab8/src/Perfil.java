public class Perfil {
	private char sexo;
	private final String dataNascimento;
	private String cidade;
	private String estado;
	private String telefone;
	private boolean fumante;
	private float avaliacao;
	private Caroneiro caroneiro;
	private Caronante caronante;
	private Usuario usuario;

	public Perfil(char sexo, String dataNascimento, String cidade, String estado,
			String telefone, boolean fumante, float avaliacao,
			Caroneiro caroneiro, Caronante caronante) {
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.fumante = fumante;
		this.avaliacao = avaliacao;
		this.caronante = caronante;
		this.caroneiro = caroneiro;
	}
	
	public Perfil(char sexo, String dataNascimento, String cidade, String estado, String telefone, boolean fumante,
			float avaliacao, Caroneiro caroneiro, Caronante caronante, Usuario usuario) {
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.fumante = fumante;
		this.avaliacao = avaliacao;
		this.caroneiro = caroneiro;
		this.caronante = caronante;
		this.usuario = usuario;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isFumante() {
		return fumante;
	}

	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}
	
	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Caroneiro getCaroneiro() {
		return caroneiro;
	}

	public void setCaroneiro(Caroneiro caroneiro) {
		this.caroneiro = caroneiro;
	}

	public Caronante getCaronante() {
		return caronante;
	}

	public void setCaronante(Caronante caronante) {
		this.caronante = caronante;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		String out = "\n";
		out += "- sexo: " + this.sexo + "\n";
		out += "- data de nascimento: " + this.dataNascimento + "\n";
		out += "- cidade: " + this.cidade + "\n";
		out += "- estado: " + this.estado + "\n";
		out += "- telefone: " + this.telefone + "\n";
		out += "- fumante: " + this.fumante + "\n";
		out += "- avaliação: " + this.avaliacao + "\n";
		out += "- caroneiro: " + this.caroneiro + "\n";
		out += "- caronante: " + this.caronante + "\n";
		return out;
	}
}
