package tetris.view;

import tetris.controller.*;

import javax.swing.JFrame;

public class TetrisFrame extends JFrame
{
	private TetrisController appController;
	private TetrisPanel appPanel;
	private int[][] grid;
	
	public TetrisFrame(TetrisController appController, int[][] grid)
	{
		super();
		
		this.grid = grid;
		this.appController = appController;
		appPanel = new TetrisPanel(appController, grid);
		
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
