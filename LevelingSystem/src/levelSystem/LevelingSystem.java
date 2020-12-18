package levelSystem;

public class LevelingSystem {
	private int currentXP;
	private int currentLevel;
	private int baseXP;
	private double levelingSpeed;

	public LevelingSystem() {
		currentXP = 0;
		currentLevel = 1;
		baseXP = 1000;
		levelingSpeed = 1.5;
	}

	public int getCurrentXP() {
		return currentXP;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public void addXP(int amount) {
		this.currentXP += amount;
	}

	public void levelUp() {
		currentLevel = checkLevel(currentXP);
	}

	public int xpNeeded(int level) {
		return (int) (baseXP * (Math.pow(level, levelingSpeed)));
	}

	private int checkLevel(int xp) {
		return 0;
	}

}
