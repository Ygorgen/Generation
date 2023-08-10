package pooExerc;

public class testacliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaJuridica pessoa2 = new PessoaJuridica ("de arrascaeta",29,"Rio de janeiro","ganho de mobilidade",3,"18564831456482");
		PessoaFisica pessoa1 = new PessoaFisica ("Bruno henrique",32,"Rio de janeiro","ganho de massa muscular",12,"12345678900");
		
		pessoa2.visualizar();
		pessoa2.validarcnpj();
		
		
		
		pessoa1.visualizar();
		pessoa1.validarcpf();
		
		
		}
	}
