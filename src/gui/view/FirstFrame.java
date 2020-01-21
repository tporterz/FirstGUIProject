package gui.view;

import javax.swing.JFrame;
import gui.controller.SimpleGUIController;

public class FirstFrame extends JFrame
{
	private SimpleGUIController app;
	
	public FirstFrame(SimpleGUIController app)
	{
		super();
		this.app = app;
	}
}
