package pokemon.model;

public class FloraFauna extends Pokemon implements Vegan
{
	public FloraFauna()
	{
		super(4, "FloraFauna");
		setup();
	}
	
	public FloraFauna(String name)
	{
		super(4, name);
		setup();
	}
	
	public FloraFauna(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(0);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.48);
		this.setHealthPoints(77893);
	}
	
	public void eatVeganily()
	{
		System.out.println("Nom's veganily");
	}
	
	public String proclaimVeganism()
	{
		return "Three times a day I remind myself that I value life and do not want to cause pain or kill other living beings, that is why I am Vegan.";
	}
	
	public int countCalories()
	{
		int calorieCount = 1;
		return calorieCount;
	}
}
