package entities.classes.concretes;

import static entities.classes.Mago.jogador;

import java.util.ArrayList;
import java.util.List;

import entities.Classe;
import entities.classes.Arqueiro;
import entities.classes.Mago;
import rpg.magias.Magia;
import rpg.magias.MagiaException;

public class ArqueiroConcrete extends Classe implements Arqueiro {

	private int[] magicSpaces = new int[5];
	List<Magia> magias = new ArrayList<>();

	public ArqueiroConcrete() {
		increaseMagicSpaces();
	}

	@Override
	public boolean canAdd(Magia magia) {
		if (magicSpaces[magia.getLevel() - 1] == 0) {
			return false;
		}
		return true;
	}

	@Override
	public void addMagic(Magia magia) {
		if (canAdd(magia)) {
			magias.add(magia);
			magicSpaces[magia.getLevel() - 1]--;
		} else {
			throw new MagiaException("A magia não pode ser adicionada, pois não há espaço de magia suficiente.");
		}
	}
	
	@Override
	public void increaseMagicSpaces() {
		if (jogador.getLevel() == 2) {
			magicSpaces[0] = 2;
		}
		if (jogador.getLevel() == 3) {
			magicSpaces[0] = 3;
		}
		if (jogador.getLevel() == 5) {
			magicSpaces[0] = 4;
			magicSpaces[1] = 2;
		}
		if (jogador.getLevel() == 7) {
			magicSpaces[1] = 3;
		}
		if (jogador.getLevel() == 9) {
			magicSpaces[2] = 2;
		}
		if (jogador.getLevel() == 11) {
			magicSpaces[2] = 3;
		}
		if (jogador.getLevel() == 13) {
			magicSpaces[3] = 1;
		}
		if (jogador.getLevel() == 15) {
			magicSpaces[3] = 2;
		}
		if (jogador.getLevel() == 17) {
			magicSpaces[3] = 3;
			magicSpaces[4] = 1;
		}
		if (jogador.getLevel() == 19) {
			magicSpaces[4] = 2;
		}
	}

	


}
