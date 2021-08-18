package imperios;

public abstract class  Unidad {

	protected Posicion posicion;
	private int salud = 100;
	private int da�o=0;
	
	public Unidad(Posicion posicion) {
		this.posicion=posicion;
	}

	public double distanciaCon(Unidad otro) {
		
		double unitario= Math.pow(otro.posicion.getCoordX()- this.posicion.getCoordX(),2)+
				         Math.pow(otro.posicion.getCoordY()- this.posicion.getCoordY(),2);
							
		return Math.sqrt(unitario);
	}

	public int getSalud() {
		
		return this.salud;
	}

	public void atacar(Unidad u2){
		if(this.puedeAtacar(u2)) {
			u2.recibirGolpe(this.da�o);
			this.consecuenciaPorAtacar();
		
		}
	}
	
	protected abstract void consecuenciaPorAtacar();

	/*private void setSalud(int salud) {
		this.salud=salud;
		}*/

	public abstract boolean puedeAtacar(Unidad otra);
	/*{
		return (this.distanciaCon(otra)<2);
	}*/
	
	protected void recibirGolpe(int da�o)
	{
		this.salud-=da�o;
	}

	protected void setDa�o(int da�o) {
		this.da�o=da�o;
	}
	
	protected void setPosicion(int x, int y) {
		this.posicion.setPosicion(x , y);
	}
	
	
	

}
