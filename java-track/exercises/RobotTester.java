import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTester {

	@Test
	public void changePosition() {
		Robot r = new Robot("r", 5, 5, 5, "North");
		assertTrue("Problem setting y-position in constructor", r.getPositionY() == 5);
		r.changePosition();
		assertTrue("Problem updating y-position in changePosition", r.getPositionY() == 10);
	}
	
	@Test
	public void changeDirection() {
		Robot r = new Robot("r", 5, 5, 5, "North");
		assertTrue("Problem setting direction in constructor", r.getDirection() == "North");
		r.changeDirection("Right");
		assertTrue("Problem updating direction in changeDirection", r.getDirection() == "East");
	}
	
}
