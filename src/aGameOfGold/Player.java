package aGameOfGold;

public class Player {

	private int current, win = 0;
	private String name;

	private Account points;

	public Player(String a) {
		name = a;
		points = new Account();
	}

	// Sets win to 1 if the Player has reached the victory condition of 3000 points
	public void checkWin() {
		if (points.getGoldcoins() >= 3000){
			win = 1;
		}
	}

	// Adds score to Account object
	public void addPoints(int a) {
		points.addgoldCoins(a);
	}

	// Gets score from Account object
	public int getPoints() {
		return points.getGoldcoins();
	}

	public int getWin() {
		return win;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public String toString() {
		return name;
	}

}