
public class Perfil {
	private char sexo;
	private String dataNascimento;
	private String cidade;
	private String estado;
	private String telefone;
	private boolean fumante;
	private int tempoHabilitacao;
	
	// Método Construtor:
	public Perfil(char sexo, String dataNascimento, String cidade, String estado,
			String telefone, boolean fumante, int tempoHabilitacao) {
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.fumante = fumante;
		this.tempoHabilitacao = tempoHabilitacao;
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
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	public int getTempoHabilitacao() {
		return tempoHabilitacao;
	}
	public void setTempoHabilitacao(int tempoHabilitacao) {
		this.tempoHabilitacao = tempoHabilitacao;
	}

	// Método toString:
	@Override
	public String toString() {
		String out = getSexo() + "\n";
		out += "data de nascimento: " + getDataNascimento() + "\n";
		out += "cidade: " + getCidade() + "\n";
		out += "estado: " + getEstado() + "\n";
		out += "telefone: " + getTelefone() + "\n";
		out += "fumante: " + isFumante() + "\n";
		out += "tempo de habilitação: " + getTempoHabilitacao() + "\n";
		return out;
	}	
}
