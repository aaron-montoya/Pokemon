package pokemon.model;

public class DonaldDurrassic extends Pokemon implements Jurrassic, Politician
{
	public DonaldDurrassic()
	{
		super(3, "DonaldDurrassic");
		setup();
	}
	
	public DonaldDurrassic(String name)
	{
		super(3, name);
		setup();
	}
	
	public DonaldDurrassic(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(150);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.93);
		this.setHealthPoints(103);
	}
	
	public String offensiveSpeech()
	{
		return "";
	}

	public int countVotes()
	{
		return 999999;
	}

	public void wearHat()
	{
		System.out.println("Wearing hat.");
	}

	public String roar()
	{
		return "Vote for meeeeeeeeee!";
	}

	public int hunt()
	{
		int prey = 2;
		return prey;
	}

	public void eat()
	{
		System.out.println("Crunch, Munch");
	}

}
