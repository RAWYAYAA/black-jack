package balack_jack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Carte {

	private Hauteur hauteur;
	private Couleur couleur;
	public Carte(Couleur couleur, Hauteur hauteur) {
		this.hauteur = hauteur;
		this.couleur = couleur;
	}
	public Carte() {
	}
	public ArrayList<Carte> create(ArrayList<Carte> cartes) {
		for(Couleur couleur: Couleur.values()) {
			for(Hauteur hauteur: Hauteur.values()) {
				cartes.add(new Carte(couleur, hauteur));
			}
		}
		return cartes;
	}
	/*public void melanger() {
		Collections.shuffle(cartes);
        System.out.println("Shuffled List: " + cartes);
	}*/

 

	@Override
	public String toString() {
		return this.hauteur + " " + this.couleur + "\n";
	}
	public Hauteur getHateur() {
		return this.hauteur;
	}
	public Couleur getCouleur() {
		return this.couleur;
	}
}
