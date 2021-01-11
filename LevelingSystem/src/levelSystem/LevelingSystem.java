package levelSystem;

public class LevelingSystem {
	private int currentXP;
	private int currentLevel;
	private int baseXP;
	private double levelingSpeed;
	private double perkPoints;

	public LevelingSystem() {
		currentXP = 0;
		currentLevel = 1;
		baseXP = 1000;
		levelingSpeed = 1.5;
		perkPoints = 0;
	}

	public int getCurrentXP() {
		return currentXP;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public double getCurrentPerkPoints() {
		return perkPoints;
	}

	public void addXP(int amount) {
		this.currentXP += amount;
		levelUp();
	}

	public void levelUp() {
		while (currentXP > xpNeeded(currentLevel + 1)) {
			currentLevel++;
			perkPoints++;
		}
	}

	public int xpNeeded(int level) {
		return (int) (baseXP * (Math.pow(level, levelingSpeed)));
	}

}
