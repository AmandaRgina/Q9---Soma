package soma;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		System.out.println("Digite o primeiro numero");
		
		Scanner input = new Scanner(System.in);
		
		int numero1 = input.nextInt();
		
		System.out.println("Digite o primeiro numero");
		
		int numero2 = input.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma é: " + soma);
		
		
		
		input.close();
		
	}

}
