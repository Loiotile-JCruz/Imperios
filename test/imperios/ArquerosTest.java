package imperios;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArquerosTest {

	/*@Test
	public void Atacando() {
	Unidad u1 = new Caballero(new Posicion(0, 0));
	Unidad u2 = new Arquero(new Posicion(1, 1));
	Unidad u3 = new Arquero(new Posicion(10, 10));

	assertEquals(100, u2.getSalud());
	u1.atacar(u2);
	assertEquals( 70, u2.getSalud());

	assertEquals(100, u3.getSalud());
	u2.atacar(u3);
	assertEquals(93, u3.getSalud());
	
	u2.atacar(u1);
	assertEquals(100, u1.getSalud());

}*/
	
	@Test
	public void soldadosAtacando() {
	Caballero u1 = new Caballero(new Posicion(0, 0));
	Soldados u2 = new Soldados(new Posicion(1, 1));
	Soldados u3 = new Soldados(new Posicion(2,1));

	assertEquals(100, u2.getSalud());
	u2.atacar(u1);
	assertEquals(80, u1.getSalud());
	assertEquals(100, u3.getSalud());
	u2.atacar(u3);
	assertEquals(80, u3.getSalud());
	u2.atacar(u3);
	assertEquals(80, u3.getSalud());
	u2.recargarEnergia();
	u2.atacar(u1);
	assertEquals(60, u1.getSalud());

}
}