package pokemon.model;

public class VegBot extends Pokemon implements Vegan
{
	public VegBot(int number, String name)
	{
		super(number, name);
	}
	
	public void eatVeganily()
	{
		
	}
	
	public String proclaimVeganism()
	{
		return "Eating Vegan is eating Cruelty-Free!";
	}
	
	public int countCalories()
	{
		int calorieCount = 10;
		return calorieCount;
	}
}
