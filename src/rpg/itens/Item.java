package rpg.itens;

public abstract class Item {
	protected String nome;
	
	public Item(String nome) {
		this.nome = nome;
	}
	
	public abstract void usarItem();
}
