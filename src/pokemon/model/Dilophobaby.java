package pokemon.model;

public class Dilophobaby extends Pokemon implements Jurrassic
{
	public Dilophobaby(int number, String name)
	{
		super(number, name);
	}
	
	public String roar()
	{
		return "rawr...";
	}
	
	public int hunt()
	{
		int prey = 1;
		return prey;
	}
	
	public void eat()
	{
		System.out.println("nom nom...");
	}
}
