package mediafloat;

import java.util.Scanner;

public class mediaFloatjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float nota1,nota2,nota3,nota4, soma;
		
		
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		soma = (nota1 + nota2 + nota3 + nota4 );
		System.out.printf("A média do alune é: %.2f",soma);
		
		

	}

}
