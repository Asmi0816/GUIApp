package graph.view;

import javax.swing.JFrame;
import graph.controller.GraphController;
import java.awt.Dimension;

public class FirstFrame extends JFrame
{
	private GraphController baseController;
	
	public FirstFrame(GraphController baseController)
	{
		super();
		this.baseController = baseController;
		
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setLocationRelativeTo(null);
		this.setSize(new Dimension(600, 400));
		this.setVisible(true);
	}
}
