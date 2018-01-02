package pokemon.model;

public class RoyRoycen extends Pokemon implements Politician
{
	public RoyRoycen()
	{
		super(1, "RoyRoycen");
		setup();
	}
	
	public RoyRoycen(String name)
	{
		super(1, name);
		setup();
	}
	
	public RoyRoycen(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(50);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(120);
	}
	
	public String offensiveSpeech()
	{
		return "The Kate Steinle killer came back and back over the weakly protected Obama border, always committing crimes and being violent, and yet this info was not used in court. His exoneration is a complete travesty of justice. BUILD THE WALL!";
	}
	
	public int countVotes()
	{
		int votes = 5999;
		return votes;
	}
	
	public void wearHat()
	{
		System.out.println("Equipped Hat!");
	}
}
