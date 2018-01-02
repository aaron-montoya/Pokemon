package pokemon.model;

public class Dilophobaby extends Pokemon implements Jurrassic
{
	public Dilophobaby()
	{
		super(5, "Dilophobaby");
		setup();
	}
	
	public Dilophobaby(String name)
	{
		super(5, name);
		setup();
	}
	
	public Dilophobaby(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(130);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.84);
		this.setHealthPoints(96);
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
