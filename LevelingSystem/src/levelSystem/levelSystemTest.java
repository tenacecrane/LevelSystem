package levelSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class levelSystemTest {

	LevelingSystem Woodcutting;

	@BeforeEach
	public void init() {
		Woodcutting = new LevelingSystem();
	}

	@Test
	void testXPNeeded() {
		assertTrue(Woodcutting.xpNeeded(1) < Woodcutting.xpNeeded(2));
	}

	@Test
	void testAddXP() {
		Woodcutting.addXP(200);
		assertEquals(200, Woodcutting.getCurrentXP());
	}

	@Test
	void testLevelUp() {
		Woodcutting.addXP(4000);

	}

}
