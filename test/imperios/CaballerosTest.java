package imperios;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaballerosTest {

	@Test
	public void caballerosAtacando() {
	Caballero u1 = new Caballero(new Posicion(0, 0));
	Soldados u2 = new Soldados(new Posicion(1, 1));
	Soldados u3 = new Soldados(new Posicion(2,1));

	assertEquals(100, u2.getSalud());
	u1.atacar(u2);
	u1.atacar(u2);
	u1.atacar(u3);
	u1.atacar(u3);
	assertEquals(40, u2.getSalud());
	assertEquals(20,u1.posicion.getCoordX());
	assertEquals(40, u2.getSalud());
	assertEquals(0,u1.getSusto());
	u1.atacar(u2);
	assertEquals(40, u2.getSalud());

}
}


