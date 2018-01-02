package pokemon.model;

public class DonaldDurrassic extends Pokemon implements Jurrassic, Politician
{
	public DonaldDurrassic(int number, String name)
	{
		super(number, name);
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
		return "";
	}

	public int hunt()
	{
		int prey = 2;
		return prey;
	}

	public void eat()
	{
		System.out.println("Crunch Munch");
	}

}
