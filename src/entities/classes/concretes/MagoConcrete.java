package entities.classes.concretes;

import static entities.classes.Mago.jogador;

import java.util.ArrayList;
import java.util.List;

import entities.Classe;
import entities.classes.Mago;
import rpg.magias.Magia;
import rpg.magias.MagiaException;

public class MagoConcrete extends Classe implements Mago {
	private int knownTricks;
	private int[] magicSpaces = new int[9];
	List<Magia> magias = new ArrayList<>();

	public MagoConcrete() {
		super("Mago");
		this.setClasse(this);
		increaseMagicSpaces();
		knownTricks = 3;
		setAttributes();
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
		if (jogador.getLevel() == 1) {
			magicSpaces[0] = 2;
		}
		if (jogador.getLevel() == 2) {
			magicSpaces[0]++;
		}
		if (jogador.getLevel() == 3) {
			magicSpaces[0]++;
			magicSpaces[1] = 2;
		}
		if (jogador.getLevel() == 4) {
			magicSpaces[1]++;
		}
		if (jogador.getLevel() == 5) {
			magicSpaces[2] = 2;
		}
		if (jogador.getLevel() == 6) {
			magicSpaces[2]++;
		}
		if (jogador.getLevel() == 7) {
			magicSpaces[3] = 1;
		}
		if (jogador.getLevel() == 8) {
			magicSpaces[3]++;
		}
		if (jogador.getLevel() == 9) {
			magicSpaces[3]++;
			magicSpaces[4] = 1;
		}
		if (jogador.getLevel() == 10) {
			magicSpaces[4] = 2;
		}
		if (jogador.getLevel() == 11) {
			magicSpaces[5] = 1;
		}
		if (jogador.getLevel() == 13) {
			magicSpaces[6] = 1;
		}
		if (jogador.getLevel() == 15) {
			magicSpaces[7] = 1;
		}
		if (jogador.getLevel() == 17) {
			magicSpaces[8] = 1;
		}
		if (jogador.getLevel() == 18) {
			magicSpaces[4] = 3;
		}
		if (jogador.getLevel() == 19) {
			magicSpaces[5] = 2;
		}
		if (jogador.getLevel() == 20) {
			magicSpaces[6] = 2;
		}
	}

	@Override
	public void increaseKnownTricks() {
		if (jogador.getLevel() == 4) {
			knownTricks++;
		}
		if (jogador.getLevel() == 10) {
			knownTricks++;
		}
	}

	public void setAttributes() {
		jogador.setForca(8);
		jogador.setConstituicao(12);
		jogador.setDestreza(12);
		jogador.setSabedoria(10);
		jogador.setInteligencia(14);
		jogador.setCarisma(10);
	}

	public int getCD() {
		return 8 + jogador.getProeficiency() + jogador.getInteligency();
	}
	
	public int getMagicATK() {
		return jogador.getProeficiency() + jogador.getInteligency();
	}
	
}
