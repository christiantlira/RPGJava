package rpg.itens;

public abstract class Arma extends Item implements ItemDano {
	private int ID;
	private int dano;
	private double alcance;

	public Arma(int dano, double alcance, String nome, int ID) {
		super(nome);
		this.dano = dano;
		this.alcance = alcance;
		this.ID = ID;
	}
	
	public abstract void usarArma();

	public int getDano() {
		return dano;
	}

	public String getNome() {
		return nome;
	}

	public double getAlcance() {
		return alcance;
	}
	
}
