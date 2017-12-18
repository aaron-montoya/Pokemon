package pokemon.model;

public class Dilophosaurus extends Pokemon implements Jurrassic
{
	public Dilophosaurus(int number, String name)
	{
		super(number, name);
	}
	
	public String roar()
	{
		return "RAWR XD";
	}
	
	public int hunt()
	{
		int prey = 5;
		return prey;
	}
	
	public void eat()
	{
		System.out.println("NOM NOM NOM NOM NOM NOM NOM NOM NOM NOM NOM");
	}
}
