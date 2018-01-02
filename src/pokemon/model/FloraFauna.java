package pokemon.model;

public class FloraFauna extends Pokemon implements Vegan
{
	public FloraFauna(int number, String name)
	{
		super(number, name);
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
