package entities;

import entities.classes.Mago;
import entities.classes.concretes.MagoConcrete;
import enums.classe.Classes;

public abstract class Classe {	
	private Jogador jogador = new Jogador();
	private Classes classe;
	private int CD;
	private int magicATK;
	private MagoConcrete mago;
	
	public Classe() {
	}

	public Classe(Jogador jogador, Classes classe ) {
		this.jogador = jogador;
		this.classe = classe;
		if(classe.equals(Classes.MAGO)) {
			mago = new MagoConcrete();
			
		}
	}
	
	public int getCD() {
		return mago.getCD();
	}
	
	public int getMagicATK() {
		return mago.getMagicATK();
	}
	
	public void levelUp() {
		if(classe.equals(Classes.MAGO)) {
			mago.levelUp();
		}
		if(classe.equals(Classes.GUERREIRO)) {
			guerreiro.levelUp();
		}
		if(classe.equals(Classes.PATRULHEIRO)) {
			patrulheiro.levelUp();
		}
		
	}
}
