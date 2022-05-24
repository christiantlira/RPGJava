package entities.classes;

import static entities.classes.Guerreiro.jogador;

import java.util.ArrayList;
import java.util.List;

import entities.Classe;
import entities.Jogador;
import rpg.magias.Magia;

public interface Guerreiro{
	Jogador jogador = new Jogador();
	
	void levelUp();
	
	default void setAttributes() {
		jogador.setForca(14);
		jogador.setConstituicao(12);
		jogador.setDestreza(12);
		jogador.setSabedoria(8);
		jogador.setInteligencia(10);
		jogador.setCarisma(10);
	}
}
