package tetris.view;

import tetris.controller.*;

import javax.swing.JFrame;

public class Frame extends JFrame
{
	private Controller appController;
	private TetrisPanel appPanel;
	private int[][] grid;
	
	public Frame(Controller appController)
	{
		super();
		
		this.grid = grid;
		this.appController = appController;
		appPanel = new TetrisPanel(appController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);		
		this.setTitle("Playing Tetris");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public Controller getController()
	{
		return appController;
	}
	
	public TetrisPanel getPanel()
	{
		return appPanel;
	}
}
