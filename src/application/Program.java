package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Come�ando a cria��o do seu personagem");
		System.out.print("Qual ser� o nome do seu personagem? ");
		String nome = sc.nextLine();
		System.out.println("Seu personagem n�o ter� g�nero porque isso � coisa de baitola!");
		System.out.println();
		System.out.println("Escolha uma classe (use os numeros):");
		System.out.printf("1) Guerreiro\n2) Mago\n");
	}

}
