package pooExerc;

public class Cliente {
	private String nomecliente;
	private int idade;
	private String cidade;
	private String objetivo;
	private int tempodetreino;

	public Cliente(String nomecliente, int idade, String cidade, String objetivo, int tempodetreino) {
		super();
		this.nomecliente = nomecliente;
		this.idade = idade;
		this.cidade = cidade;
		this.objetivo = objetivo;
		this.tempodetreino = tempodetreino;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public int getTempodetreino() {
		return tempodetreino;
	}

	public void setTempodetreino(int tempodetreino) {
		this.tempodetreino = tempodetreino;
	}

	public void imprimirinfo() {
		System.out.println("\n"+nomecliente+" com a idade de: "+idade+" anos "+" , residente na cidade de "+cidade+" Tem como objetivo nos treinos: "+objetivo+" e treina a: "+tempodetreino+" meses");
	}
}


















