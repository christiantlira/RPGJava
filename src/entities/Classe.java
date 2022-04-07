package entities;

import java.util.ArrayList;
import java.util.List;

import rpg.magias.Magia;

public interface Classe {

	List<Magia> magias = new ArrayList<>();
	
	int getCD();
	
	int getMagicATK();

	void levelUp();
}
