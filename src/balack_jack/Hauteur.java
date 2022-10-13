package balack_jack;

public enum Hauteur {
	as(1),
	deux(2),
	trois(3),
	quatre(4),
	cinq(5),
	six(6),
	sept(7),
	huit(8),
	neuf(9),
	dix(10),
	valet(11),
	dame(12),
	roi(13);
	
	private int i;
	
	Hauteur(int i) {
		this.i = i;
	}
	public int getIdex() {
		return i;
	}
	public void setIndex(int i) {
		this.i=i;
	}	 
}
