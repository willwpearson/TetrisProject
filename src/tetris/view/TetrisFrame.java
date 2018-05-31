package tetris.view;

import tetris.controller.*;

import javax.swing.JFrame;

public class TetrisFrame extends JFrame
{
	private TetrisController appController;
	private TetrisPanel appPanel;
	
	public TetrisFrame(TetrisController appController)
	{
		super();
		
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
	
	public TetrisController getTriController()
	{
		return appController;
	}
}
