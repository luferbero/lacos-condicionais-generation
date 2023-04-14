package LacosCondicionaisJava;

import java.util.Scanner;

public class Exercicio2If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Digite um número inteiro: ");
		n1 = leia.nextInt();
		
		if((n1 % 2 == 0) && (n1>0)) {
			System.out.println("O número " + n1 + " é par e é positivo!");
		}
		else if((n1 % 2 != 0) && (n1>0)) {
			System.out.println("O número " + n1 + " é ímpar e é positivo!");
		}
		else if((n1 % 2 == 0) && (n1<0)) {
			System.out.println("O número " + n1 + " é par e é negativo!");
		}
		else {
			System.out.println("O número " + n1 + " é ímpar e é negativo!");
		}
		
		leia.close();
		
	}

}
