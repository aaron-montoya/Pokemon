package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokeController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokePanel extends JPanel
{
	private PokeController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descArea;
	private JTextArea typeArea;

	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	public PokePanel(PokeController appController) {
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		//Initialize GUI Members
		evolvableBox = new JCheckBox();
		nameField = new JTextField("name");
		appLayout.putConstraint(SpringLayout.EAST, nameField, 170, SpringLayout.WEST, this);
		numberField = new JTextField("##");
		attackField = new JTextField("atk");
		appLayout.putConstraint(SpringLayout.EAST, attackField, -5, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 0, SpringLayout.EAST, attackField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -35, SpringLayout.WEST, attackField);
		healthField = new JTextField("hp");
		appLayout.putConstraint(SpringLayout.EAST, healthField, -5, SpringLayout.EAST, this);
		modifierField = new JTextField("mod");
		appLayout.putConstraint(SpringLayout.EAST, modifierField, -5, SpringLayout.EAST, this);
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/Logo copy.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 40, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, 195, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, 170, SpringLayout.WEST, this);
		
		healthLabel = new JLabel("Health");
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 17, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 34, SpringLayout.EAST, healthLabel);
		attackLabel = new JLabel("Attack");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 34, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 13, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, healthLabel);
		nameLabel = new JLabel("Name");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 6, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 10, SpringLayout.NORTH, this);
		numberLabel = new JLabel("#");
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 6, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 18, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -106, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 0, SpringLayout.NORTH, nameLabel);
		evolvableLabel = new JLabel("Evolvable");
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, -4, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, healthLabel);
		modifierLabel = new JLabel("Modifier");
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 23, SpringLayout.EAST, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 21, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 17, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, healthLabel);
		pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -73, SpringLayout.SOUTH, this);
		saveButton = new JButton("Save");
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 4, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 0, SpringLayout.WEST, numberField);
		clearButton = new JButton("Clear");
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -6, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 0, SpringLayout.WEST, numberField);
		
		descArea = new JTextArea(5, 10);
		appLayout.putConstraint(SpringLayout.WEST, descArea, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, descArea, -5, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, descArea, -31, SpringLayout.WEST, saveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, 0, SpringLayout.SOUTH, descArea);
		typeArea = new JTextArea(4, 15);
		appLayout.putConstraint(SpringLayout.NORTH, descArea, 12, SpringLayout.SOUTH, typeArea);
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 4, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, -80, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, typeArea, -319, SpringLayout.EAST, this);
		
		firstType = new JPanel();
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 0, SpringLayout.NORTH, typeArea);
		appLayout.putConstraint(SpringLayout.WEST, firstType, 6, SpringLayout.EAST, typeArea);
		secondType = new JPanel();
		appLayout.putConstraint(SpringLayout.NORTH, secondType, 0, SpringLayout.NORTH, typeArea);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 6, SpringLayout.EAST, firstType);
		thirdType = new JPanel();
		appLayout.putConstraint(SpringLayout.NORTH, thirdType, 0, SpringLayout.NORTH, typeArea);
		appLayout.putConstraint(SpringLayout.WEST, thirdType, 6, SpringLayout.EAST, secondType);
		fourthType = new JPanel();
		appLayout.putConstraint(SpringLayout.WEST, fourthType, 6, SpringLayout.EAST, thirdType);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 51, SpringLayout.EAST, fourthType);
		appLayout.putConstraint(SpringLayout.NORTH, fourthType, 0, SpringLayout.NORTH, typeArea);
		
		
		setupPanel();
		setupComboBox();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
		thirdType.setSize(50, 50);
		fourthType.setSize(50, 50);
	}
	
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		if (types[0].equals("Politician"))
		{
			firstType.setBackground(Color.red);
		}
		else if (types[0].equals("Vegan"))
		{
			firstType.setBackground(Color.green);
		}
		else if (types[0].equals("Jurrassic"))
		{
			firstType.setBackground(Color.orange);
		}
		else
		{
			firstType.setBackground(Color.white);
		}

		
		if (types.length > 1)
		{
			if (types[1].equals("Politician"))
			{
				secondType.setBackground(Color.red);
			}
			else if (types[1].equals("Vegan"))
			{
				secondType.setBackground(Color.green);
			}
			else if (types[1].equals("Jurrassic"))
			{
				secondType.setBackground(Color.orange);
			}
			else
			{
				firstType.setBackground(Color.white);
			}
		}
		else
		{
			secondType.setBackground(Color.white);
		}
		//Set this for each of the different type panels
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(appLayout);
		
		this.add(healthLabel);
		this.add	(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(iconLabel);
		
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		
		this.add(descArea);
		this.add(typeArea);
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}
	
	private void setupLayout()
	{
		
	}
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		//Update Text Areas
		descArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for(String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	}
	
	private void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "logo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}
}






















