package aGameOfGold;

import java.util.Scanner;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class AGameOfGold {

	public static void main(String[] args) {
		Player[] players = new Player[2];

		// Creates two Player objects in an array
		players[0] = new Player("Player 1");
		players[1] = new Player("Player 2");

		// Scanner to read input
		Scanner sc = new Scanner(System.in);

		int whoseTurn = 0;

		Dice d1 = new Dice(6);
		Dice d2 = new Dice(6);

		GUIInitialize();

		GUI.addPlayer(players[0].toString(), 1000);
		GUI.addPlayer(players[1].toString(), 1000);

		// Loop that runs once per player turn
		while (true) {

			// Waits for player to press OK
			GUI.showMessage("It's your turn " + players[whoseTurn] + ", press OK to roll the dice.");

			// Rolls the dice
			d1.roll();
			d2.roll();

			players[whoseTurn].setCurrent(d1.getValue() + d2.getValue());
			

			GUI.setDice(d1.getValue(), d2.getValue());

			GUI.removeAllCars(players[whoseTurn].toString());
			GUI.setCar(13 - players[whoseTurn].getCurrent(), players[whoseTurn].toString());

			players[whoseTurn].addPoints(FieldDescriptions.fieldGold[12 - players[whoseTurn].getCurrent()]);

			GUI.setBalance(players[whoseTurn].toString(), players[whoseTurn].getPoints());
			
			GUI.showMessage(FieldDescriptions.fieldDescriptions[12 - players[whoseTurn].getCurrent()] + "");

			// Checks if the current player won
			players[whoseTurn].checkWin();

			if (players[whoseTurn].getWin() == 1) {
				GUI.showMessage(players[whoseTurn] + " won the game!");
				break;
			}

			// Changes the turn to the other player unless current player has an
			// extra turn
			if (!(players[whoseTurn].getCurrent() == 10)) {
				if (whoseTurn == 0) {
					whoseTurn = 1;
				} else {
					whoseTurn = 0;
				}
			}

		}

		sc.close();

	}
	
	// Creates 11 fields from the specifications in FieldDescriptions
	private static void GUIInitialize() {
		Field[] fields = new Field[11];

		for (int i = 0; i < 11; i++) {
			fields[i] = new Street.Builder().setBgColor(FieldDescriptions.fieldColor[i])
					.setDescription(FieldDescriptions.fieldDescriptions[i])
					.setTitle(FieldDescriptions.fieldNames[i])
					.setSubText("" + FieldDescriptions.fieldGold[i])
					.build();
		}

		GUI.create(fields);
	}

}
