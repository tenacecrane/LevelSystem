package levelSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LevelingSystemTest {

	LevelingSystem Woodcutting;

	@BeforeEach
	void init() {
		Woodcutting = new LevelingSystem();
	}

	@Test
	void testAddXP() {
		Woodcutting.addXP(4000);
		assertEquals(4000, Woodcutting.getCurrentXP());
	}

	@Test
	void testGetCurrentLevel() {
		assertEquals(1, Woodcutting.getCurrentLevel());
	}

	@Test
	void testLevelUp() {
		Woodcutting.addXP(10000);
		assertTrue(Woodcutting.getCurrentLevel() > 1);
		assertEquals(4, Woodcutting.getCurrentLevel());
	}

	@Test
	void testXPNeeded() {
		assertTrue(Woodcutting.xpNeeded(2) < Woodcutting.xpNeeded(3));
	}

}