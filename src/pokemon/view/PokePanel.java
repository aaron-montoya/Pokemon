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
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 23, SpringLayout.NORTH, this);
		nameField = new JTextField("name");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, evolvableBox);
		numberField = new JTextField("##");
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, 0, SpringLayout.SOUTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -6, SpringLayout.WEST, evolvableBox);
		attackField = new JTextField("atk");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 72, SpringLayout.NORTH, this);
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 49, SpringLayout.WEST, this);
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/Logo copy.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 50, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, -33, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, 100, SpringLayout.EAST, nameField);
		
		healthLabel = new JLabel("Hp");
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -207, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, healthLabel);
		attackLabel = new JLabel("Atk");
		nameLabel = new JLabel("Name");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 99, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 35, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 28, SpringLayout.WEST, this);
		numberLabel = new JLabel("#");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, numberLabel);
		evolvableLabel = new JLabel("Evolvable");
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableLabel, -240, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 0, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 17, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 37, SpringLayout.EAST, evolvableLabel);
		modifierLabel = new JLabel("Modifier");
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 99, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, modifierLabel);
		appLayout.putConstraint(SpringLayout.EAST, modifierLabel, 0, SpringLayout.EAST, evolvableBox);
		pokedexDropdown = new JComboBox();
		saveButton = new JButton("Save");
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -10, SpringLayout.EAST, this);
		clearButton = new JButton("Clear");
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -6, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, 0, SpringLayout.EAST, saveButton);
		
		descArea = new JTextArea(5, 10);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, 0, SpringLayout.SOUTH, descArea);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -52, SpringLayout.WEST, descArea);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, descArea);
		appLayout.putConstraint(SpringLayout.NORTH, descArea, 73, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, descArea, -101, SpringLayout.EAST, this);
		typeArea = new JTextArea(4, 15);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, typeArea);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, -5, SpringLayout.NORTH, typeArea);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, -10, SpringLayout.SOUTH, this);
		
		firstType = new JPanel();
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, -105, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstType, -163, SpringLayout.WEST, pokedexDropdown);
		secondType = new JPanel();
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, 0, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.EAST, secondType, -56, SpringLayout.WEST, firstType);
		thirdType = new JPanel();
		appLayout.putConstraint(SpringLayout.SOUTH, thirdType, 0, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.EAST, thirdType, -29, SpringLayout.WEST, secondType);
		fourthType = new JPanel();
		appLayout.putConstraint(SpringLayout.SOUTH, fourthType, 0, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, fourthType, 0, SpringLayout.EAST, nameField);
		
		
		setupPanel();
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
		
		//Change this to match your 3 minimum Types in your pokedex
		if (types[0].equals("Politician"))
		{
			firstType.setBackground(Color.red);
		}
		else if (types[0].equals("Vegan"))
		{
			firstType.setBackground(Color.green);
		}
		else if (types[0].equals("Jurassic"))
		{
			firstType.setBackground(Color.gray);
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
			//...continue as above
			
			if (types.length == 3)
			{
				if (types[2].equals("Politician"))
				{
					thirdType.setBackground(Color.gray);
				}
				//...continue as above
			}
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
				//updateImage();
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
	}
}






















