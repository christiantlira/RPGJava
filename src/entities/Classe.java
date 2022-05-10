package entities;

import entities.classes.concretes.MagoConcrete;
import enums.classe.Classes;

public abstract class Classe {	
	private Jogador jogador = new Jogador();
	private Classes classe;
	
	public Classe() {
	}

	public Classe(Jogador jogador, Classes classe ) {
		this.jogador = jogador;
		if(classe.equals(Classes.MAGO)) {
			MagoConcrete mago = new MagoConcrete();
			
		}
	}
}
