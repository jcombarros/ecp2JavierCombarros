package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private User user;
	
	@Before
	public void before(){
		user = new User(1, " javier ", " Combarros  ");
	}

	@Test
	public void testGetNumber() {
		assertEquals(1, user.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals("Javier", user.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Combarros", user.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Javier Combarros", user.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("J.", user.initials());
	}

}
