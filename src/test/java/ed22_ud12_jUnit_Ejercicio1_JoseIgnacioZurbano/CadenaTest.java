package ed22_ud12_jUnit_Ejercicio1_JoseIgnacioZurbano;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {
	Cadena target;

	@BeforeEach
	void setUp() throws Exception {
		this.target = new Cadena();
	}

	@Test
	void testLongitud() {
		int expected = 4;
		int actual = this.target.longitud("hola");
		assertEquals(expected, actual);
		int expected2 = 0;
		int actual2 = this.target.longitud("");
		assertEquals(expected2, actual2);
	}
	@Test
	void testVocales() {
		int expected = 2;
		int actual = this.target.vocales("hola");
		assertEquals(expected, actual);
		int expected2 = 0;
		int actual2 = this.target.vocales("");
		assertEquals(expected2, actual2);
	}
	@Test
	void testInvertir() {
		String expected = "aloh";
		String actual = this.target.invertir("hola");
		assertEquals(expected, actual);
		String expected2 = "";
		String actual2 = this.target.invertir("");
		assertEquals(expected2, actual2);
	}
	@Test
	void testContarLetra() {
		int expected = 1;
		int actual = this.target.contarLetra("hola",'a');
		assertEquals(expected, actual);
		int expected2 = 0;
		int actual2 = this.target.contarLetra("", 'a');
		assertEquals(expected2, actual2);
	}




}
