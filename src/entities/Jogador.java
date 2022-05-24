package entities;

import java.util.ArrayList;
import java.util.List;

import rpg.itens.Item;

public class Jogador {
	public String nome;
	private int moeda;
	private int vida;
	private int forca;
	private int destreza;
	private int constituicao;
	private int carisma;
	private int inteligencia;
	private int sabedoria;
	private double exp;
	private int level;

	private Classe classe;

	List<Item> inventario = new ArrayList<>();

	public Jogador() {
	}

	public Jogador(String nome, Classe classe) {
		this.nome = nome;
		this.exp = 0;
		level = 7;
		inventario = null;
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
		if(getLevel() < 5) {
			return 2;
		}
		if (getLevel() < 9) {
			return 3;
		}
		if(getLevel() < 13) {
			return 4;
		}
		if(getLevel()< 17) {
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

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getCarisma() {
		return carisma;
	}

	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}

	public void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
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

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return nome + ", classe: " + classe.getNome() + ", level: " + getLevel();
	}

}
