package imperios;

public class Caballero extends Unidad {
	
	private int da�o=30;
	private int sustoDeCaballo=0;
	
	public Caballero(Posicion posicion) {
		super(posicion);
		super.setDa�o(da�o);
		
	}

	/*@Override
	public void atacar(Unidad u2) {
		if(puedeAtacar(u2)){
				u2.recibirGolpe(this.da�o);
				}

	}*/

	@Override
	public boolean puedeAtacar(Unidad otra) {
		return (super.distanciaCon(otra)>1 && super.distanciaCon(otra)<3);
	}

	@Override
	protected void consecuenciaPorAtacar() {
	this.sustoDeCaballo+=1;
	if(this.sustoDeCaballo>3) {
		super.posicion.setPosicion(super.posicion.getCoordX()+20,super.posicion.getCoordY()+20);
		this.sustoDeCaballo=0;
	}
}
	
	public int getSusto() {
		return this.sustoDeCaballo;
	}
}