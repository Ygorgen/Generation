package pooExerc;

public class testacliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente[] lista = new Cliente[2];
		lista [0] = new Cliente("Ygor Araujo",25,"São Paulo","hipertrofia",3); 
		lista [1] = new Cliente("Steffanie Maiami",24,"São Paulo","Pojeto Gracyanne Barbosa",6);
		for (Cliente mostra : lista) {
			mostra.imprimirinfo();
		}
	}

}
