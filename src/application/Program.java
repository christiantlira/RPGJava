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
		Classe classe = null;

		System.out.println("Come?ando a cria??o do seu personagem");
		System.out.print("Qual ser? o nome do seu personagem? ");
		String nome = sc.nextLine();

		System.out.println("Escolha uma classe (ESCREVA O N?MERO QUE DESEJAR):");
		System.out.printf("1) GUERREIRO\n2) MAGO\n3) ARQUEIRO\n");
		int choice = sc.nextInt();
		if (choice == 1) {
			Classe classe2 = new GuerreiroConcrete();
			classe = classe2;
		} else if (choice == 2) {
			Classe classe2 = new MagoConcrete();
			classe = classe2;
		} else if (choice == 3) {
			Classe classe2 = new ArqueiroConcrete();
			classe = classe2;
		}
		jogador = new Jogador(nome, classe);
		classe.setJogador(jogador);
		
		System.out.println(jogador);
		System.out.println("CD: " + jogador.getCD());
		sc.close();
	}

}
