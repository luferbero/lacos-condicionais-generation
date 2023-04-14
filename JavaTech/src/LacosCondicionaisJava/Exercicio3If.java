package LacosCondicionaisJava;

import java.util.Scanner;

public class Exercicio3If {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("É a primeira doação de sangue? Digite true para sim e false para não: ");
		doacao = leia.nextBoolean();
		
		
		if(idade >=18 && idade <=69) {
			if(idade >=60 && idade <=69 && doacao == true)  {
				System.out.println(nome + " não está apto(a)!");
			}
			else {
				System.out.println(nome + " está apto(a)!");
			}
		}
		else {
			System.out.println(nome + " não está apto!");
		}
		
		
	    leia.close();
		
	}

}
