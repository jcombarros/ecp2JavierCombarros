package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	private Fraction fraccionUnidad;
	private Fraction fraccionEntero;
	private Fraction fraccionDecimal;
	private Fraction fraccionDecimal2;
	private Fraction fraccionDecimal3;
	
	@Before
	public void before(){
		fraccionUnidad = new Fraction();
		fraccionEntero = new Fraction(4,2);
		fraccionDecimal = new Fraction(5,2);
		fraccionDecimal2 = new Fraction(10,4);
		fraccionDecimal3 = new Fraction(3,8);
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
	
	@Test
	public void testIsEquivalente() {
		assertEquals(true, fraccionDecimal.isEquivalente(fraccionDecimal2));
		assertEquals(false, fraccionDecimal.isEquivalente(fraccionEntero));
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(0.75, fraccionEntero.multiplication(fraccionDecimal3), 1e-3);
	}
	
	@Test
	public void testDivide() {
		assertEquals(0.8, fraccionEntero.divide(fraccionDecimal), 1e-3);
	}
}
