import static org.junit.Assert.*;

import org.junit.Test;

public class BaseballPlayerTester {

	@Test
	public void playGame() {
		BaseballPlayer b = new BaseballPlayer("Joe", "Left", 7, 0, 0, 0);
		assertTrue("Problem setting games in your constructor", b.getGames() == 0);
		assertTrue("Problem setting runs in your constructor", b.getRuns() == 0);
		assertTrue("Problem setting RBI in your constructor", b.getRBI() == 0);
		b.playGame(3, 9);
		assertTrue("Problem updating games in playGame", b.getGames() == 1);
		assertTrue("Problem updating runs in playGame", b.getRuns() == 3);
		assertTrue("Problem updating RBI in playGame", b.getRBI() == 9);
	}

}
