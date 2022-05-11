package entities.classes;

import java.util.ArrayList;
import java.util.List;

import entities.Classe;
import entities.Jogador;
import rpg.magias.Magia;

public interface Arqueiro {
	Jogador jogador = new Jogador();

	boolean canAdd(Magia magia);
	void addMagic(Magia magia);
	void increaseMagicSpaces();
	
	default int getCD() {
		return 8 + jogador.getProeficiency() + jogador.getInteligency();
	}
	
	default int getMagicATK() {
		return jogador.getProeficiency() + jogador.getInteligency();
	}
	
	default void levelUp() {
		increaseMagicSpaces();
	}
}
