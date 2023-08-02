package IfElse;

import java.util.Scanner;

public class LacoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a , b , c , soma ;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		soma = a + b ;
		
		if (soma > c ) {
			System.out.println("O valor da soma entre A e B é maior que o valor de C .");
			
		} else if (soma == c) {
			System.out.println("O valor da Soma entre A e B é igual ao valor de C.");
		}else {
			System.out.println("O valor da soma entre A e B não é maior que C ");
		}

	}

}