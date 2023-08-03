package Laçodo;

import java.util.Scanner;
/*
 * Escreva um algoritmo em Java, que leia números inteiros via teclado,
 *  até que o número zero seja digitado. 
 *  Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.
 */

public class LaçoDoWhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, x = 0, soma = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Entre os números: ");
			num = leia.nextInt();
			if (num > 0) {
				soma+=num;
			}
		} while (num!=0);
		System.out.println("A soma dos números positivos digitados é: " + soma);
	}
}