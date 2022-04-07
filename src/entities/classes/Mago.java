package entities.classes;

import java.util.ArrayList;
import java.util.List;

import entities.Classe;
import entities.Jogador;
import rpg.magias.Magia;

public class Mago implements Classe {
	private int knownTricks;
	private Jogador jogador;

	int[] magicSpaces = new int[9];
	List<Magia> magias = new ArrayList<>();

	public Mago() {
	}

	public Mago(Jogador jogador) {
		
		this.knownTricks = 3;
		this.magicSpaces[0] = 2;
		this.magias = null;
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

	public void addMagic(Magia magia) {
		magias.add(magia);
	}
	
	public void levelUp() {
		increaseKnownTricks();
		increaseMagicSpaces();
	}
	
	public void increaseKnownTricks() {
		if (jogador.getLevel() == 4 ) {
			knownTricks++;
		}
		if (jogador.getLevel() == 10) {
			knownTricks++;
		}
	}
	
	public void increaseMagicSpaces() {
		if(jogador.getLevel() == 2) {
			magicSpaces[0]++;
		}
		if(jogador.getLevel() == 3) {
			magicSpaces[0]++;
			magicSpaces[1] = 2;
		}
		if(jogador.getLevel() == 4) {
			magicSpaces[1]++;
		}
		if(jogador.getLevel() == 5) {
			magicSpaces[2] = 2;
		}
		if(jogador.getLevel() == 6) {
			magicSpaces[2]++;
		}
		if(jogador.getLevel() == 7) {
			magicSpaces[3] = 1;
		}
		if(jogador.getLevel() == 8) {
			magicSpaces[3]++;
		}
		if(jogador.getLevel() == 9) {
			magicSpaces[3]++;
			magicSpaces[4] = 1;
		}
		if(jogador.getLevel() == 10) {
			magicSpaces[4]++;
		}
		if(jogador.getLevel() == 11) {
			magicSpaces[5] = 1;
		}
		if(jogador.getLevel() == 13) {
			magicSpaces[6] = 1;
		}
		if(jogador.getLevel() == 15) {
			magicSpaces[7] = 1;
		}
		if(jogador.getLevel() == 17) {
			magicSpaces[8] = 1;
		}
		if(jogador.getLevel() == 18) {
			magicSpaces[4]++;
		}
		if(jogador.getLevel() == 19) {
			magicSpaces[5]++;
		}
		if(jogador.getLevel() == 20) {
			magicSpaces[6]++;
		}
	}
}
