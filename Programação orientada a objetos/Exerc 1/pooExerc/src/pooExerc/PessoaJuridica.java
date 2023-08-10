package pooExerc;

public class PessoaJuridica extends Cliente {
	private String Cnpj;

	public PessoaJuridica(String nomecliente, int idade, String cidade, String objetivo, int tempodetreino, String Cnpj) {
		super(nomecliente, idade, cidade, objetivo, tempodetreino);
		this.Cnpj = Cnpj;

	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Cnpj: " + Cnpj);
	}

	public void validarcnpj() {
		if (getCnpj().length() != 14) {
			System.out.println("\nCnpj inválido!!!");

		} else {
			System.out.println("\nCnpj válido!!!");
		}
	}
}
