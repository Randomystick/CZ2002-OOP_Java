import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	private int valueOfDice;
	
	//constructors
	public Dice()
	{
		setDiceValue(); //need to call this to set the value
	}
	
	//get-set methods
	public void setDiceValue()
	{
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		valueOfDice = ThreadLocalRandom.current().nextInt(1, 6 + 1);
		
		//Random r = new Random() //using import java.util.Random
		//valueOfDice = r.nextInt(6)+1
	}
	
	public int getDiceValue()
	{
		return this.valueOfDice;
	}
	
	//print
	public void printDiceValue()
	{
		System.out.println("Current value is " + getDiceValue());
	}
}
