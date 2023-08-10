package pooExerc;

public class PessoaFisica extends Cliente {
	private String cpf;

	public PessoaFisica(String nomecliente, int idade, String cidade, String objetivo, int tempodetreino, String cpf) {
		super(nomecliente, idade, cidade, objetivo, tempodetreino);
		this.cpf = cpf;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		super.visualizar();

		System.out.println("CPF: " + cpf);
	}

	public void validarcpf() {
		if (getCpf().length() != 11) {
			System.out.println("\nCpf inválido!!!");

		} else {
			System.out.println("\nCpf válido!!!");
		}
	}
}