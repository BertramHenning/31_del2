package aGameOfGold;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
	Account points;

	@Before
	public void setUp() throws Exception {
		points = new Account();
	}

	@After
	public void tearDown() throws Exception {
		points = null;
	}

	/**	T1
	 *  Tests if goldCoins can drop below 0
	 */
	@Test
	public void testAddgoldCoins() {
		int expected = 0;
		points.addgoldCoins(-1000);
		points.addgoldCoins(-1000);
		points.addgoldCoins(-1000);
		points.addgoldCoins(-1000);
		int actual = points.getGoldcoins();
		assertEquals(expected, actual);
	}
	
	/**	T3
	 *  Tests if goldCoins start at 1000
	 */
	@Test
	public void testGetGoldcoins() {
		int expected = 1000;
		int actual = points.getGoldcoins();
		assertEquals(expected, actual);
	}
	
	

}
