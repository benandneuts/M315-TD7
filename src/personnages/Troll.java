package personnages;

public class Troll extends Personnage {

	String capaciteRegeneration;
	
	public Troll(String nom, String capaciteRegeneration) {
		super(nom);
		this.capaciteRegeneration = capaciteRegeneration;
	}

	public String getCapaciteRegeneration() {
		return capaciteRegeneration;
	}

	public void setCapaciteRegeneration(String capacit�R�g�n�ration) {
		this.capaciteRegeneration = capacit�R�g�n�ration;
	}

}
