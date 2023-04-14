package LacosCondicionaisJava;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigo, quantidade;
		float valorTotal;
		
		System.out.println("Menu da casa");
		System.out.println("Produto 1 - Cachorro Quente = R$10,00");
		System.out.println("Produto 2 - X-Salada        = R$15,00");
		System.out.println("Produto 3 - X-Bacon         = R$18,00");
		System.out.println("Produto 4 - Bauru           = R$12,00");
		System.out.println("Produto 5 - Refrigerante    =  R$8,00");
		System.out.println("Produto 6 - Suco de Laranja = R$13,00");
		System.out.println("Escolha o código do produto: ");
	    codigo = leia.nextInt();
	    
	    System.out.println("Qual quantidade quer do produto? ");
	    quantidade = leia.nextInt();
	    
		switch(codigo) {
		case 1:
			valorTotal = 10 * quantidade;
			System.out.println("Você escolheu " + quantidade + " Cachorro quente e o valor total da compra fica R$" + valorTotal);
			break;
			
		case 2:
			valorTotal = 15 * quantidade;
			System.out.println("Você escolheu " + quantidade + " X-Salada e o valor total da compra fica R$" + valorTotal);
			break;
		
		case 3:
			valorTotal = 18 * quantidade;
			System.out.println("Você escolheu " + quantidade + " X-Bacon e o valor total da compra fica R$" + valorTotal);
			break;
			
		case 4:
			valorTotal = 12 * quantidade;
			System.out.println("Você escolheu " + quantidade + " Bauru e o valor total da compra fica R$" + valorTotal);
			break;
			
		case 5:
			valorTotal = 8 * quantidade;
			System.out.println("Você escolheu " + quantidade + " Refrigerante e o valor total da compra fica R$" + valorTotal);
			break;	
			
		case 6:
			valorTotal = 13 * quantidade;
			System.out.println("Você escolheu " + quantidade + " Suco de Laranja e o valor total da compra fica R$" + valorTotal);
			break;
			default:
				System.out.println("Código Inválido");
		}
		
		leia.close();
		
		}
	}


