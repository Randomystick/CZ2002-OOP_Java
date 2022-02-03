import java.util.Scanner;

public class DiceApp 
{
	static int score = 0;
	public static void main(String args[])
	{
		Dice userDice = new Dice();
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++)
		{
			System.out.println("Press <key> to roll the dice");
			if (sc.next() != null)
			{
				userDice.setDiceValue();
				userDice.printDiceValue();
				score += userDice.getDiceValue();
			}
		}
		System.out.println("Your total number is: " + score);
	}
}
/*
 * int dic']eValue;
 * Scanner sc = ...
 * System.out.println()
 * sc.nextLine();
 * 
 * Dice d = new Dice();
 * diceValue = d.getDiceValue();
 * d.printDiceValue();
 * 
 * Systme.out.printl()
 * sc.nextLine
 * d.setDiceValue()
 * diceValue += .....
 */
