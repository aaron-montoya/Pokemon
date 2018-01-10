package pokemon.view;

import pokemon.controller.PokeController;
import javax.swing.JFrame;

public class PokeFrame extends JFrame
{
	private PokeController appController;
	private PokePanel appPane;
	
	public PokeFrame(PokeController appController)
	{
		super();
		this.appController = appController;
		appPane = new PokePanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPane);
		this.setTitle("Pakamon");
		this.setSize(305, 305);
		this.setVisible(true);
	}
	
	public PokeController getAppController()
	{
		return appController;
	}
}
