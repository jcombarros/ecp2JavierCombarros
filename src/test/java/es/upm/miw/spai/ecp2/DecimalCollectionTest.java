package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

	private DecimalCollection decimalCollection;
	
	@Before
	public void before(){
		decimalCollection = new DecimalCollection();
		decimalCollection.add(1.0);
		decimalCollection.add(2.0);
		decimalCollection.add(2.5);
	}

	@Test
	public void testSize() {
		assertEquals(3, decimalCollection.size());
	}

	@Test
	public void testSum() {
		assertEquals(5.5, decimalCollection.sum(), 1e-3);
	}

	@Test
	public void testHigher() {
		assertEquals(2.5, decimalCollection.higher(), 1e-3);
	}
	
	@Test
	public void testMenor(){
		asertEquals(1.0,menor());
	}

}
