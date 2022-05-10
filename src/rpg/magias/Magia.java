package rpg.magias;

public abstract class Magia {
	protected String nome;
	protected int level;
	
	public Magia(String nome, int level) {
		this.nome = nome;
		this.level = level;
	}
	
	public abstract void usarMagia();
	
	public int getLevel() {
		return level;
	}
}
