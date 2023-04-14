package LacosCondicionaisJava;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float num1, num2, resultado;
		int op;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextFloat();
		
		System.out.println("Digite o código de uma operação matemática:");
		System.out.println("\n1 - Operação de Soma ");
		System.out.println("2 - Operação de Subtração");
		System.out.println("3 - Operação de Multiplicação");
		System.out.println("4 - Operação de Divisão");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			resultado = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + resultado);
			break;
		case 3:
			resultado = num1 * num2;
			System.out.println(num1 + " X " + num2 + " = " + resultado);
			break;
		case 4:
			resultado = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + resultado);
			break;
			default:
				System.out.println("Opção inválida");
			
		}
		
		leia.close();
		
	}

}
