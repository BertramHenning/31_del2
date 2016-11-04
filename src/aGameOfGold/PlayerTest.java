package aGameOfGold;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	
	Player player1;

	@Before
	public void setUp() throws Exception {
		player1 = new Player("Player1");
	}

	@After
	public void tearDown() throws Exception {
		player1 = null;
	}

	/** jUnit4
	 *  Tests if win is set to 1 when the player has 3000 or more points
	 */
	@Test
	public void testCheckWin() {
		int expected = 1;
		player1.addPoints(2000);
		player1.checkWin();
		int actual = player1.getWin();
		assertEquals(expected, actual);
	}

	/** jUnit5
	 * 	Tests if the player gets 650 gold when landing on field 12
	 */
	@Test
	public void testAddPoints() {
		int expected = 1650;
		player1.setCurrent(12);
		player1.addPoints(FieldDescriptions.fieldGold[12 - player1.getCurrent()]);
		int actual = player1.getPoints();
		assertEquals(expected, actual);
	}
	
	

}
