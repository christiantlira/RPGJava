package entities.classes;

import java.util.ArrayList;
import java.util.List;

import entities.Classe;
import entities.Jogador;
import rpg.magias.Magia;

public class Mago implements Classe {
	private int knownTricks;
	private Jogador jogador;

	List<Integer> magicSpaces = new ArrayList<>();
	List<Magia> magias = new ArrayList<>();

	public Mago() {
	}

	public Mago(int knownTricks, List<Integer> magicSpaces, List<Magia> magias, Jogador jogador) {
		super();
		this.knownTricks = knownTricks;
		this.magicSpaces = magicSpaces;
		this.magias = magias;
		this.jogador = jogador;
	}

	public int getCD() {
		return 8 + jogador.getProeficiency() + jogador.getInteligency();
	}

	public int getMagicATK() {
		return jogador.getProeficiency() + jogador.getInteligency();
	}
}
