package imperios;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnidadTest {

	/*@Test
	public void funcaBien() {
		Unidad u1 = new Unidad(new Posicion(0, 0));
		Unidad u2 = new Unidad(new Posicion(1, 1));
		assertEquals(Math.sqrt(2), u1.distanciaCon(u2),0.01);
	}*/
	
	
	
	@Test
	public void Atacando() {
	Unidad u1 = new Caballero(new Posicion(0, 0));
	Unidad u2 = new Caballero(new Posicion(1, 1));
	Unidad u3 = new Caballero(new Posicion(5, 5));

	assertEquals(100, u2.getSalud());
	u1.atacar(u2);
	assertEquals( 70, u2.getSalud());

	assertEquals(100, u3.getSalud());
	u1.atacar(u3);
	assertEquals(100, u3.getSalud());

}
}