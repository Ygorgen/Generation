package Caso;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int produto,quantidade,soma;
		float price = 0, total ;
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
		price=(float) 10.00;
			break;
		case 2: System.out.println("\nÓtima escolha!! Você selecionou o : X-Salada");
		price=(float) 15.00;
			break;
		case 3: System.out.println("\nÓtima escolha!! Você selecionou o : X-Bacon");
		price=(float) 18.00;
			break;
		case 4: System.out.println("\nÓtima escolha!! Você selecionou o : Bauru");
		price=(float) 12.00;
			break;
		case 5: System.out.println("\nÓtima escolha!! Você selecionou o : Refrigerante");
		price=(float) 8.00;
			break;
		case 6: System.out.println("\nÓtima escolha!! Você selecionou o : Suco de Laranja");
		price=(float) 13.00;
			break;
			default: System.out.println("Selecione uma opção válida!");
			
			}
	    
	    System.out.println("\nDigite a quantidade: ");
		quantidade=leia.nextInt();
		
		soma=(int) (price*quantidade);
		total =(float) soma;
		
		System.out.println("\nProduto: "+produto);
		System.out.printf("Valor total do pedido: R$ %.2f",total);
		

	}
	

	
	

}
