package rpg.magias;

public abstract class Magia {
	protected String nome;
	
	public Magia(String nome) {
		this.nome = nome;
	}
	
	public abstract void usarMagia();
}
