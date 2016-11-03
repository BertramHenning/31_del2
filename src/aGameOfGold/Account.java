package aGameOfGold;

//Keeps track of a players gold coins
public class Account {

	private int goldCoins;
	
	public Account() {
		goldCoins = 1000;

	}

	public int getGoldcoins() {
		return goldCoins;
	}

	//Makes sure goldCoins cant drop below 0
	public void addgoldCoins(int goldCoins) {
		this.goldCoins += goldCoins;

		if (this.goldCoins < 0) {
			this.goldCoins = 0;			
			}
	
	}
}
