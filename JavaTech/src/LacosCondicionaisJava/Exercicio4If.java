package LacosCondicionaisJava;

import java.util.Scanner;

public class Exercicio4If {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String p1, p2, p3;

		System.out.println("\nEntre com a primeira p: ");
		p1 = leia.nextLine();

		System.out.println("\nEntre com a segunda p: ");
		p2 = leia.nextLine();

		System.out.println("\nEntre com a terceira p: ");
		p3 = leia.nextLine();

		if (p1.equalsIgnoreCase("vertebrado")) {
			if (p2.equalsIgnoreCase("ave")) {
				if (p3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nÉ uma Águia");
				} else {
					System.out.println("\nÉ uma Pomba");
				}
			} else {
				if (p3.equalsIgnoreCase("onivoro")) {
					System.out.println("\nÉ um Ser Humano");
				} else {
					System.out.println("\nÉ uma Vaca");
				}
			}
		} else {
			if (p2.equalsIgnoreCase("inseto")) {
				if (p3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma Pulga");
				} else {
					System.out.println("\nÉ uma Lagarta");
				}
			} else {
				if (p3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma Sanguessuga");
				} else {
					System.out.println("\nÉ uma Minhoca");
				}
			}
		}

       leia.close();
      
	}

}
