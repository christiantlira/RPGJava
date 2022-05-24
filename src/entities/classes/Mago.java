package entities.classes;

import entities.Jogador;
import rpg.magias.Magia;

public interface Mago {	
	Jogador jogador = new Jogador();
	
	boolean canAdd(Magia magia);
	void addMagic(Magia magia);
	void increaseMagicSpaces();
	void increaseKnownTricks();
	void setJogador(Jogador jogador);
	
	int getCD();
	
	int getMagicATK();
	
	default void levelUp() {
		increaseKnownTricks();
		increaseMagicSpaces();
	}
}
