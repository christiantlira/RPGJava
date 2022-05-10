package entities.classes;

import java.util.ArrayList;
import java.util.List;

import entities.AbstractClasse;
import entities.Classe;
import entities.Jogador;
import rpg.magias.Magia;

public interface Mago {	
	Jogador jogador = new Jogador();
	
	boolean canAdd(Magia magia);
	void addMagic(Magia magia);
	void increaseMagicSpaces();
	void increaseKnownTricks();
	
	default int getCD() {
		return 8 + jogador.getProeficiency() + jogador.getInteligency();
	}
	
	default int getMagicATK() {
		return jogador.getProeficiency() + jogador.getInteligency();
	}
	
	default void levelUp() {
		increaseKnownTricks();
		increaseMagicSpaces();
	}
}
