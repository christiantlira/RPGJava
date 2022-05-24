package application;

import java.util.Scanner;

import entities.Classe;
import entities.Jogador;
import entities.classes.concretes.ArqueiroConcrete;
import entities.classes.concretes.GuerreiroConcrete;
import entities.classes.concretes.MagoConcrete;
import enums.classe.Classes;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Jogador jogador = null;

		System.out.println("Começando a criação do seu personagem");
		System.out.print("Qual será o nome do seu personagem? ");
		String nome = sc.nextLine();

		System.out.println("Escolha uma classe (ESCREVA O NÚMERO QUE DESEJAR):");
		System.out.printf("1) GUERREIRO\n2) MAGO\n3) ARQUEIRO\n");
		int choice = sc.nextInt();
		if (choice == 1) {
			Classe classe = new GuerreiroConcrete();
			jogador = new Jogador(nome, classe);
			classe.setJogador(jogador);
		} else if (choice == 2) {
			Classe classe = new MagoConcrete();
			jogador = new Jogador(nome, classe);
			classe.setJogador(jogador);
		} else if (choice == 3) {
			Classe classe = new ArqueiroConcrete();
			jogador = new Jogador(nome, classe);
			classe.setJogador(jogador);
		}

		System.out.println(jogador);
		System.out.println("CD: " + jogador.getCD());
		sc.close();
	}

}
