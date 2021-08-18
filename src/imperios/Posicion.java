package imperios;

public class Posicion {

	private int coordX;
	private int coordY;
	public Posicion(int x, int y) {
		this.coordX=x;
		this.coordY=y;
	}
	public int getCoordX() {
		return coordX;
	}
	public int getCoordY() {
		return coordY;
	}
	
	protected void setPosicion(int x,int y) {
	this.coordX=x;
	this.coordY=y;
}
	

}
