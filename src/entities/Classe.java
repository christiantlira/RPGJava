package entities;

import entities.classes.concretes.ArqueiroConcrete;
import entities.classes.concretes.GuerreiroConcrete;
import entities.classes.concretes.MagoConcrete;
import enums.classe.Classes;

public abstract class Classe {	
	private Jogador jogador;
	private Classes classEnum;
	private String nome;
	private Classe classe;
	
	public Classe(String nome) {
		this.nome = nome;
	}
	
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
		
	}
	
	public int getCD() {
		return classe.getCD();
	}
	
	public int getMagicATK() {
		return classe.getMagicATK();
	}
	
	public void levelUp() {
		classe.levelUp();
	}
}
