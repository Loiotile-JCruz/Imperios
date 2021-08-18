package imperios;

public class Soldados extends Unidad {
	
	private int daño=20;
	private int energia=100;

	public Soldados(Posicion posicion) {
		super(posicion);
		super.setDaño(daño);
	}

	@Override
	public boolean puedeAtacar(Unidad otra) {
		if(this.tieneEnergia()) {
		return super.distanciaCon(otra)<1.5;
	} else
	{
		System.out.println("El soldado no tiene energia para atacar");
		return false;
	}
	}

	private boolean tieneEnergia() {
		return energia>20;
	}
	
	public void recargarEnergia() {
		this.energia+=50;
	}

	@Override
	public void consecuenciaPorAtacar() {
		this.energia-=40;
		}
}
	
