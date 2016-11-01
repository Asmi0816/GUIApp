package graph.view;


import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import graph.controller.GraphController;

public class FirstPanel extends JPanel
{
	private GraphController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;
	
	
	public FirstPanel(GraphController baseController)
	{
		super();
		this.baseController = baseController;
		this.colorButton = new JButton("colors");
		this.baseLayout = new SpringLayout();
		this.randomButton = new JButton("wha!?!? colors XD");
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(colorButton);
		this.add(randomButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, colorButton, 183, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, colorButton, -185, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 20, SpringLayout.SOUTH, colorButton);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 149, SpringLayout.WEST, this);
		colorButton.setForeground(Color.RED);
		colorButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 13));
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				setBackground(Color.BLUE);
			}
		});
		
		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeBackgroundColor();
			}
		});
		
	}
	
	private void changeBackgroundColor()
	{
	int red = (int) (Math.random() * 256);
	int green = (int) (Math.random() * 256);
	int blue  = (int) (Math.random() * 256);
	this.setBackground(new Color(red,green,blue));
		
	}
	
	
}
