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
		return "The people of Iran are finally acting against the brutal and corrupt Iranian regime. All of the money that President Obama so foolishly gave them went into terrorism and into their “pockets.” The people have little food, big inflation and no human rights. The U.S. is watching!";
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
