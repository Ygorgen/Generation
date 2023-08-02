package Exerc1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int produto,quantidade;
		float price = 0, total;
		Scanner leia=new Scanner(System.in);
		
		
		
		System.out.println("Cod do Produto   Produto  \t   Preço \n");
		System.out.println("1\t\t Cachorro Quente   R$10,00");
		System.out.println("2\t\t X-Salada          R$15,00");
		System.out.println("3\t\t X-Bacon           R$18,00");
		System.out.println("4\t\t Bauru             R$12,00");
		System.out.println("5\t\t Refrigernte       R$ 8,00");
		System.out.println("6\t\t Suco de Laranja   R$13,00");
		
		System.out.println("Didige o Codigo do produto: ");
		produto=leia.nextInt();
		
	    switch(produto){
		
		case 1: System.out.println("\nÓtima escolha!! Você selecionou o : Cachorro quente");
		price= 10.00f;
			break;
		case 2: System.out.println("\nÓtima escolha!! Você selecionou o : X-Salada");
		price=15.00f;
			break;
		case 3: System.out.println("\nÓtima escolha!! Você selecionou o : X-Bacon");
		price=18.00f;
			break;
		case 4: System.out.println("\nÓtima escolha!! Você selecionou o : Bauru");
		price=12.00f;
			break;
		case 5: System.out.println("\nÓtima escolha!! Você selecionou o : Refrigerante");
		price=8.00f;
			break;
		case 6: System.out.println("\nÓtima escolha!! Você selecionou o : Suco de Laranja");
		price=13.00f;
			break;
			default: System.out.println("Selecione uma opção válida!");
			
			}
	    
	    System.out.println("\nDigite a quantidade: ");
		quantidade=leia.nextInt();
		
		total=(price*quantidade);
		
		
		System.out.printf("\nProduto: ",produto);
		System.out.printf("Valor total do pedido: R$ %.2f",total);
		

	}
	

	
	

	}
