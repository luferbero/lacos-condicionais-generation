package LacosCondicionaisJava;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigo;
		double salario, salarioAtualizado;
		
		System.out.println("Qual o nome do colaborador(a): ");
		nome = leia.nextLine();
		
		System.out.println("Qual o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Código 1 |   Gerente         |Perc. Reajuste 10%");
		System.out.println("Código 2 |   Vendedor        |Perc. Reajuste 7%");
		System.out.println("Código 3 |   Supervisor      |Perc. Reajuste 9%");
		System.out.println("Código 4 |   Motorista       |Perc. Reajuste 6%");
		System.out.println("Código 5 |   Estoquista      |Perc. Reajuste 5%");
		System.out.println("Código 6 |   Técnico de TI   |Perc. Reajuste 8%");
		
		System.out.println("\nDigite o código: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			salarioAtualizado = salario + (salario * 0.10);
			System.out.println("Nome do colaborador: " + nome); 
			System.out.println("Cargo: Gerente");
			System.out.println("Salário atualizado: " + salarioAtualizado);
			break;
		case 2:
			salarioAtualizado = salario + (salario * 0.07);
			System.out.println("Nome do colaborador: " + nome); 
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário atualizado: " + salarioAtualizado);
			break;
		case 3:
			salarioAtualizado = salario + (salario * 0.09);
			System.out.println("Nome do colaborador: " + nome); 
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário atualizado: " + salarioAtualizado);
			break;
		case 4:
			salarioAtualizado = salario + (salario * 0.06);
			System.out.println("Nome do colaborador: " + nome); 
			System.out.println("Cargo: Motorista");
			System.out.println("Salário atualizado: " + salarioAtualizado);
			break;
		case 5:
			salarioAtualizado = salario + (salario * 0.05);
			System.out.println("Nome do colaborador: " + nome); 
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário atualizado: " + salarioAtualizado);
			break;
		case 6:
			salarioAtualizado = salario + (salario * 0.08);
			System.out.println("Nome do colaborador: " + nome); 
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário atualizado: " + salarioAtualizado);
			break;
			default:
				System.out.println("Número inválido");
		
		}
		
		leia.close();

	}

}
