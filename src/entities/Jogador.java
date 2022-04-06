package entities;

public class Jogador {
	private int vida;
	private int forca;
	private int destreza;
	private int constituicao;
	private int inteligencia;
	private int sabedoria;
	private double exp;
	private Classe classe;
	
	List<>
	
	public Jogador() {
	}

	public Jogador(int vida, int forca, int destreza, int constituicao, int inteligencia, int sabedoria) {
		this.vida = vida;
		this.forca = forca;
		this.destreza = destreza;
		this.constituicao = constituicao;
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.exp = 0;
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
}
