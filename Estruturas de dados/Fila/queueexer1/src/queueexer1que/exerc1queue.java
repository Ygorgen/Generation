package queueexer1que;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exerc1queue {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op;
		String nomecliente;

		Queue<String> fila = new LinkedList<String>();

		while (true) {
			System.out.println("\n********************MENU*****************\n");
			System.out.println("*****************************************");
			System.out.println("          1- Adicionar cliente na fila\n");
			System.out.println("          2- Listar todos os clientes\n");
			System.out.println("          3- Retirar cliente da fila\n");
			System.out.println("          0- sair\n");
			System.out.println("*****************************************");
			System.out.print("Digite uma opção: ");

			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.print("Digite o nome do Cliente: ");
				leia.nextLine();
				nomecliente = leia.nextLine(); // Devemos usar o nextLine para ler a linha completa
				fila.add(nomecliente);
				System.out.println("Cliente adicionado à fila.");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia");
				} else {
					System.out.println("Clientes na fila: ");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia");
				} else {
					String clientechamado = fila.poll();
					System.out.println("Cliente chamado: " + clientechamado);
				}
				break;
			case 0:
				System.out.println("Sistema finalizado");
				leia.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}
}