package balack_jack;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Carte> cartes=new ArrayList();
		Carte carte = new Carte();
		carte.create(cartes);	
		System.out.println("la liste ordonné");
		cartes.forEach(c -> System.out.println( c.getCouleur().getIdex()+ " , "+c.getHateur().getIdex()));
		System.out.println("la liste after remove");
		carte.extraire_ieme_carte(cartes);
		cartes.forEach(c -> System.out.println( c.getCouleur().getIdex()+ " , "+c.getHateur().getIdex()));
	}

}
