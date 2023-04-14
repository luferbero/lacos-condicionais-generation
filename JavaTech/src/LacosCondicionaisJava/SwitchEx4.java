package LacosCondicionaisJava;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigo;
		float saldo, saque, deposito;
		
		saldo = 1000;
		
		System.out.println("Escolha uma operação digitando seu código: ");
		System.out.println("\nCódigo da operação: 1 | Saldo");
		System.out.println("Código da operação: 2 | Saque");
		System.out.println("Código da operação: 3 | Depósito");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("Seu Saldo é de: R$" + saldo);
			break;
		case 2:
			System.out.println("Opção Saque | Quanto deseja sacar? ");
			saque = leia.nextFloat();
			saldo = saldo - saque;
			if (saldo <0) {
				System.out.println("Saldo insuficiente");
			}
			else {
				System.out.println("Seu novo saldo é de: R$" + saldo);
			}
			break;
		case 3:
			System.out.println("Opção Depósito | Quanto deseja depositar? ");
			deposito = leia.nextFloat();
			saldo = saldo + deposito;
			System.out.println("Seu novo saldo é de: R$" + saldo);
			break;
			default:
				System.out.println("Operação inválida");
				
		}
		
        leia.close();
		
	}

}
