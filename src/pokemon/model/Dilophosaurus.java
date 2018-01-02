package pokemon.model;

public class Dilophosaurus extends Dilophobaby implements Jurrassic
{
	public Dilophosaurus()
	{
		super(6, "Dilophosaurus");
		setup();
	}
	
	public Dilophosaurus(String name)
	{
		super(6, name);
		setup();
	}
	
	public Dilophosaurus(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(170);
		this.setCanEvolve(false);
		this.setEnhancementModifier(1.23);
		this.setHealthPoints(160);
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
