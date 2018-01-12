package pokemon.controller;

import pokemon.model.Pokemon;
import pokemon.view.PokeFrame;
import pokemon.model.*;
import java.util.List;
import java.util.ArrayList;

public class PokeController
{
	public void start()
	{
	}
	
	private List<Pokemon> pokedex;
	private PokeFrame appFrame;
	
	public PokeController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokeFrame(this);
	}
	
	public void buildPokedex()
	{
		pokedex.add(new Dilophobaby());
		pokedex.add(new Dilophosaurus());
		pokedex.add(new DonaldDurrassic());
		pokedex.add(new FloraFauna());
		pokedex.add(new RoyRoycen());
		pokedex.add(new VegBot());
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	public boolean isValidDouble(String input)
	{
		return true;
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
	}
}



















