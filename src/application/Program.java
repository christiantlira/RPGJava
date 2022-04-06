package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Começando a criação do seu personagem");
		System.out.print("Qual será o nome do seu personagem? ");
		String nome = sc.nextLine();
		System.out.println("Seu personagem não terá gênero porque isso é coisa de baitola!");
		System.out.println();
		System.out.println("Escolha uma classe (use os numeros):");
		System.out.printf("1) Guerreiro\n2) Mago\n");
	}

}
