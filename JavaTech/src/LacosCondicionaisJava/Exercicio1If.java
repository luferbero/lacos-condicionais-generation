package LacosCondicionaisJava;

import java.util.Scanner;

public class Exercicio1If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float A, B, C;
		
		System.out.println("Entre com o número A: ");
		A = leia.nextFloat();
		
		System.out.println("Entre com o número B: ");
		B = leia.nextFloat();
		
		System.out.println("Entre com o número C: ");
		C = leia.nextFloat();
		
		if(C < (A+B)) {
			System.out.printf("A soma de A + B é maior do que C");
		}
		else if(C > (A+B)) {
			System.out.printf("A soma de A + B é menor do que C");
		}
		else {
			System.out.printf("A soma de A + B é igual a C");
		}

		leia.close();
		
	}

}
