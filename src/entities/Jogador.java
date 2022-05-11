package entities;

import java.util.ArrayList;
import java.util.List;

import rpg.itens.Item;

public class Jogador {
	private int moeda;
	private int vida;
	private int forca;
	private int destreza;
	private int constituicao;
	private int inteligencia;
	private int sabedoria;
	private double exp;
	private int level;

	private Classe classe;

	List<Item> inventario = new ArrayList<>();

	public Jogador() {
	}

	public Jogador(int vida, int forca, int destreza, int constituicao, int inteligencia, int sabedoria,
			Classe classe) {
		this.vida = vida;
		this.forca = forca;
		this.destreza = destreza;
		this.constituicao = constituicao;
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.exp = 0;
		this.classe = classe;
		inventario = null;
	}

	public int getVida() {
		return vida;
	}

	public int getConstituicao() {
		return constituicao;
	}

	public int getSabedoria() {
		return sabedoria;
	}

	public double getExp() {
		return exp;
	}

	public int getLevel() {
		return level;
	}
	
	public Classe getClasse() {
		return classe;
	}

	public int getCD() {
		return classe.getCD();
	}

	public int getMagicATK() {
		return classe.getMagicATK();
	}

	public int getProeficiency() {
		if (getLevel() < 5) {
			return 2;
		}
		if (getLevel() < 9) {
			return 3;
		}
		if (getLevel() < 13) {
			return 4;
		}
		if (getLevel() < 17) {
			return 5;
		}
		return 6;
	}

	public int getStrength() {
		return getModifier(forca);
	}

	public int getDexterity() {
		return getModifier(destreza);
	}

	public int getInteligency() {
		return getModifier(inteligencia);
	}

	public int getModifier(int attribute) {
		if (attribute < 10) {
			return -1;
		}
		if (attribute < 12) {
			return 0;
		}
		if (attribute < 14) {
			return 1;
		}
		if (attribute < 16) {
			return 2;
		}
		if (attribute < 18) {
			return 3;
		}
		if (attribute < 20) {
			return 4;
		}
		return 5;
	}
	
	public void levelUp() {
		level++;
		classe.levelUp();
	}
}


