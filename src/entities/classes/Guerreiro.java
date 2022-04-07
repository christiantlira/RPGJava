package entities.classes;

import java.util.ArrayList;
import java.util.List;

import entities.Classe;
import entities.Jogador;
import rpg.magias.Magia;

public class Guerreiro implements Classe {
	private int knownTricks;
	private Jogador jogador;

	List<Integer> magicSpaces = new ArrayList<>();
	List<Magia> magias = new ArrayList<>();

	public Guerreiro() {
	}

	public Guerreiro(int knownTricks, List<Integer> magicSpaces, List<Magia> magias, Jogador jogador) {
		this.knownTricks = knownTricks;
		this.magicSpaces = magicSpaces;
		this.magias = magias;
		this.jogador = jogador;
	}

	@Override
	public int getCD() {
		return 8 + jogador.getProeficiency() + jogador.getInteligency();
	}

	@Override
	public int getMagicATK() {
		return jogador.getProeficiency() + jogador.getInteligency();
	}

	@Override
	public void levelUp() {		
	}
}
