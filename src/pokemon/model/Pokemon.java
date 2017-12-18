package pokemon.model;

public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double enchancementModifier;
	private int number;

	private String name;
	private boolean canEvolve;
	
	public Pokemon (int number, String name)
	{
		this.name = name;
		this.number = number;
	}
	
	public final String[] getPokemonTypes()
	{
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		
		for(int index = 0; index < types.length; index++)
		{
			String currentInterface = types[index].getCanonicalName();
			currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
			pokeTypes[index] = currentInterface;
		}
		return pokeTypes;
	}
	
	public String toString()
	{
		String desc = "Hi, I am a " + name + ", and my HP is " + healthPoints;
		
		return desc;
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
	
	public int getHealthPoints()
	{
		return healthPoints;
	}

	public int getAttackPoints()
	{
		return attackPoints;
	}

	public double getEnchancementModifier()
	{
		return enchancementModifier;
	}

	public int getNumber()
	{
		return number;
	}

	public String getName()
	{
		return name;
	}

	public boolean isCanEvolve()
	{
		return canEvolve;
	}

	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}

	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}

	public void setEnchancementModifier(double enchancementModifier)
	{
		this.enchancementModifier = enchancementModifier;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setCanEvolve(boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}
}
