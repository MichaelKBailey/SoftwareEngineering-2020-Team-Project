package Tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import PanelAttackPackage.*;

public class LoginDataTest {
	private LoginData data = new LoginData();

	@Test
	public void testSetUsername() throws IOException {
		String testUsrname = "test";
		data.setUsername(testUsrname);
		assertEquals("Checking set username.", testUsrname, data.getUsername());
	}
	
	@Test
	public void testGetUsername() throws IOException {
		String result = data.getUsername();
		assertNotNull("Checking get username.", result);
	}
	
	@Test
	public void testSetPassword() throws IOException {
		String testPass = "test";
		data.setPassword(testPass);
		assertEquals("Checking set password.", testPass, data.getPassword()); 
	}
	
	@Test
	public void testGetPassword() throws IOException {
		String result = data.getPassword();
		assertNotNull("Checking get username.", result);
	}
	
	
}
