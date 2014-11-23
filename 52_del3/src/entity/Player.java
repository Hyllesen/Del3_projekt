/**
 * Player klassen, indeholder spillerens navn og Account klassen
 * @author 52
 *
 */
package entity;

public class Player extends Account {
	String playerName;		//Spiller navn
	boolean isDead = false; //Variable for if player has lost all money
	int totalDiceSum;
	int carField;
	/** 
	 * @return Returnerer spillerens navn
	 */
	public String getName() {
		return playerName;
	}

	public boolean isWinner() {

		return false;
	}

	public void setName(String name) {
		playerName = name;		
	}

	public void setColor(int i) {		
	}

	public int getTotalDiceSum() {
		return totalDiceSum;
	}
	/**
	 * Sets the total dice sum for each player, used for moving them in circles around the board
	 * @param i current dice throw sum
	 */
	public void addTotalDiceSum(int i) {
		if((i + totalDiceSum) > 22) {
			totalDiceSum = ((totalDiceSum + i) % 22);
			if (totalDiceSum == 0) {
				totalDiceSum += 1;
			}
			System.out.println(totalDiceSum);
		} else {
		totalDiceSum += i;
		}
	}

	public void setCarField(int diceSum) {
		carField = diceSum;		
	}

	public int getCarField() {
		return carField;
	}
	
}


