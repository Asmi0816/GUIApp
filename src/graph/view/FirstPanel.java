package graph.view;


import javax.swing.JPanel;
import graph.controller.GraphController;
import java.awt.Color;
import javax.swing.JButton;


public class FirstPanel extends JPanel
{
	private GraphController baseController;
	private JButton colorButton;
	private JButton randomButton;
	
	public FirstPanel(GraphController baseController)
	{
		super();
		this.baseController = baseController;
		this.colorButton = new JButton("colors");
		this.randomButton = new JButton("wha!?!? colors XD");
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.GREEN);
		this.add(colorButton);
		this.add(randomButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
