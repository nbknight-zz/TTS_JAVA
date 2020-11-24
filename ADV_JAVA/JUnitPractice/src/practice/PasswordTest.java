package practice;

import static org.junit.Assert.*;
import org.junit.Test;


public class PasswordTest {
	
	@Test
	public void lowerBoundaryCheck() throws Throwable {
		Password myPass = new Password();
		Integer rand = myPass.genRandom(4);
		assertTrue(rand == -99);
	}
	
	@Test
	public void upperBoundaryCheck() throws Throwable {
		Password myPass = new Password();
		Integer rand = myPass.genRandom(13);
		assertTrue(rand == -99);
	}
	
	@Test
	public void decimalBoundaryCheck() throws Throwable {
		Password myPass = new Password();
		Integer rand = myPass.genRandom((int) 5.2);
		assertTrue(rand == -99);
	}

}
