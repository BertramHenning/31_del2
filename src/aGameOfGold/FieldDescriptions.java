package aGameOfGold;

import java.awt.Color;

public class FieldDescriptions {
	
	protected static String [] fieldDescriptions = {
			"You dig deep into the mountains and discover a goldmine. You start to dig for gold and your efforts grants you 650 gold.",
			"You stare down the pit. You are frightened and decide to run forgetting your sack of 50 gold coins.",
			"You've been bit by a werewolf and temporarily become a werewolf. Therefore you can roll at night. You must roll again to lose werewolf form but you lose 80 gold coins.",
			"A pack of strange creatures are pleased with your visit and gifts you 60 gold coins.",
			"A thief robs you of 70 gold coins.",
			"You enter the monastery. Nothing exciting here.",
			"A walled city saves you the trouble of spending 180 gold coins on a bodyguard.",
			"Brace yourself! Winter has come and you are forced to spend 20 gold coins on a new coat.",
			"You've found the Palace Gates! You gain 100 gold coins and receive blessings.",
			"A wild crater appears. You drop 100 gold coins into the crater.",
			"You've entered the tower and find a chest at the top containing 250 gold coins."
	};  
	
	protected static String [] fieldNames = {
			"Goldmine",
			"The Pit",
			"The Werewall",
			"Huts In The Mountains",
			"Black Cave",
			"Monastery",
			"Walled City",
			"Cold Dessert",
			"Palace Gates",
			"Crater",
			"Tower"
	}; 
	
	protected static int [] fieldGold = {
			650,
			-50,
			-80,
			60,
			-170,
			0,
			180,
			-20,
			100,
			-100,
			250
	}; 
	
	protected static Color [] fieldColor = {
			Color.getHSBColor((float)0.15,(float) 1.00,(float) 1.00),
			Color.getHSBColor((float)0.00,(float) 0.00,(float) 0.35),
			Color.getHSBColor((float)0.00,(float) 1.00,(float) 0.40),
			Color.getHSBColor((float)0.15,(float) 1.00,(float) 0.80),
			Color.getHSBColor((float)0.00,(float) 0.00,(float) 0.30),
			Color.getHSBColor((float)0.00,(float) 0.00,(float) 1.00),
			Color.getHSBColor((float)0.15,(float) 1.00,(float) 0.90),
			Color.getHSBColor((float)0.00,(float) 0.00,(float) 0.40),
			Color.getHSBColor((float)0.15,(float) 1.00,(float) 0.85),
			Color.getHSBColor((float)0.00,(float) 0.00,(float) 0.25),
			Color.getHSBColor((float)0.15,(float) 1.00,(float) 0.95)
	}; 


}
