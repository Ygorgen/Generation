package lacoFOR;

import java.util.Scanner;

public class LacoFOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,x;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1=leia.nextInt();
		System.out.println("Digite o primeiro número do intervalo: ");
		num2=leia.nextInt();
		
		if (num1 > num2) {
            System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
            } else {
            	System.out.println("\nNo Intervalo entre " + num1 + " e " + num2 + ":\n");
            }
		
		for(x= num1;x<=num2;x++) {
			
			if (x % 3 == 0 && x % 5 == 0) {
                System.out.println(x + " é múltiplo de 3 e 5");
            }
			
		}
	}
}
