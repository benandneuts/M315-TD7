package personnages;

public class Troll extends Personnage {

	String capacit�R�g�n�ration;
	
	public Troll(String nom, String capacit�R�g�n�ration) {
		super(nom);
		this.capacit�R�g�n�ration = capacit�R�g�n�ration;
	}

	public String getCapacit�R�g�n�ration() {
		return capacit�R�g�n�ration;
	}

	public void setCapacit�R�g�n�ration(String capacit�R�g�n�ration) {
		this.capacit�R�g�n�ration = capacit�R�g�n�ration;
	}

}
