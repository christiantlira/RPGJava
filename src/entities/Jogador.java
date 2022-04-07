package entities;

public class Jogador {
	private int vida;
	private int forca;
	private int destreza;
	private int constituicao;
	private int inteligencia;
	private int sabedoria;
	private double exp;
	private int level;
	
	private Classe classe;
	
	//List<>
	
	public Jogador() {
	}

	public Jogador(int vida, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, Classe classe) {
		this.vida = vida;
		this.forca = forca;
		this.destreza = destreza;
		this.constituicao = constituicao;
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.exp = 0;
		this.classe = classe;
	}

	public int getVida() {
		return vida;
	}

	public int getForca() {
		return forca;
	}

	public int getDestreza() {
		return destreza;
	}

	public int getConstituicao() {
		return constituicao;
	}

	public int getInteligencia() {
		return inteligencia;
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
	
	public int getCD() {
		return 8 + getProeficiency() + getInteligency();
	}
	
	public int getProeficiency() {
		if(getLevel() < 5) {
			return 2;
		}
		if(getLevel() < 9) {
			return 3;
		}
		if(getLevel() < 13) {
			return 4;
		}
		if(getLevel() < 17) {
			return 5;
		}
		return 6;
	}

	public int getStrength() {
		return getModifier(getForca());
	}

	public int getDexterity() {
		return getModifier(getDestreza());
	}
	
	public int getInteligency() {
		return getModifier(getInteligencia());
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
}
