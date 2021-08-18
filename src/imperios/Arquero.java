package imperios;

public class Arquero extends Unidad {

	private int daño=7;
	private int flechas=100;
	
	public Arquero(Posicion posicion) {
		super(posicion);
		super.setDaño(daño);
	}

	@Override
	public boolean puedeAtacar(Unidad otra) {
		if(this.tieneFlecha()) {
			return (super.distanciaCon(otra)>5 && super.distanciaCon(otra)<25);
		} else
		{
			System.out.println("El arquero no tiene flecha");
			return false;
		}
	}
	
	private boolean tieneFlecha() {
		return flechas>0;
	}
	
	public void recargarFlechas() {
		flechas+=2;
	}
	
	public int getFlechas() {
		return this.flechas;
	}

	@Override
	public void consecuenciaPorAtacar() {
		this.flechas--;
		
	}
}
