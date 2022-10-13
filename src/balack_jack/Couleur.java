package balack_jack;

public enum Couleur {
	carreau(1),
	pique(2),
	coeur(3),
	trefle(4);

	private int i ;
	
	Couleur(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
	public int getIdex() {
		return this.i;
	}
	public void setIndex(int i) {
		this.i=i;
	}
	 
}