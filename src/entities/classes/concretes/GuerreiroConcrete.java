package entities.classes.concretes;

import java.util.Random;

import entities.Classe;
import entities.classes.Guerreiro;

public class GuerreiroConcrete extends Classe implements Guerreiro {
	
	public String nome;
	
	public GuerreiroConcrete() {
		super("Guerreiro");
		this.setClasse(this);
		setAttributes();
	}
	
	public void levelUp() {
		
	}
}
