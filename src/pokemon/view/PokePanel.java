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
		
		//Initialize GUI Members
		healthLabel = new JLabel("");
		attackLabel = new JLabel("");
		nameLabel = new JLabel("");
		numberLabel = new JLabel("");
		evolvableLabel = new JLabel("");
		modifierLabel = new JLabel("");
		iconLabel = new JLabel("");
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField(20);
		numberField = new JTextField(20);
		attackField = new JTextField(20);
		healthField = new JTextField(20);
		modifierField = new JTextField(20);
		
		descArea = new JTextArea(10, 25);
		typeArea = new JTextArea(10, 25);
		
		saveButton = new JButton("Save");
		clearButton = new JButton("Clear");
		pokedexDropdown = new JComboBox();
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.blue);
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






















