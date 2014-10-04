package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	private Fraction fraccionUnidad;
	private Fraction fraccionEntero;
	private Fraction fraccionDecimal;
	
	@Before
	public void before(){
		
		fraccionUnidad = new Fraction();
		fraccionEntero = new Fraction(4,2);
		fraccionDecimal = new Fraction(5,2);
		
	}

	@Test
	public void testGetNumerator() {
		assertEquals(5, fraccionDecimal.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		assertEquals(2, fraccionDecimal.getDenominator());
	}

	@Test
	public void testDecimalFraccionUnidad() {
		assertEquals((double)1, fraccionUnidad.decimal(),1e-3);
	}
	
	@Test
	public void testDecimalFraccionEntero() {
		assertEquals((double)2, fraccionEntero.decimal(),1e-3);
	}
	
	@Test
	public void testDecimalFraccionDecimal() {
		assertEquals(2.5, fraccionDecimal.decimal(),1e-3);
	}

}
