package pokemon.model;

public class VegBot extends Pokemon implements Vegan
{
	public VegBot()
	{
		super(2, "VegBot");
		setup();
	}
	
	public VegBot(String name)
	{
		super(2, name);
		setup();
	}
	
	public VegBot(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(0);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.5);
		this.setHealthPoints(92384);
	}
	
	public void eatVeganily()
	{
		System.out.println("Cruelty-Free Nom");
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
