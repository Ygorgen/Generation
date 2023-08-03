package LAcoWhi;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method
//Sem chat gpt hein

		Scanner leia = new Scanner(System.in);
		int idade = 0, menor = 0, maior = 0, total = 0;
		System.out.println("\nDigite um valor negativo para finalizar: (ex:-1)");

		while (idade >= 0) {
			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextInt();

			if (idade > 0) {
				total++;

			}
			if (idade >= 0 && idade < 21) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}
		}
		System.out.println("total de pessoas que participaram : " + total);
		System.out.println("Total de pessoas com a idade menor que 21 anos: " + menor);
		System.out.println("Total de pessoas com a idade maior que 50 anos: " + maior);

	}
}