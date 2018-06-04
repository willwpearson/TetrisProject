package tetris.controller;

import tetris.view.*;

public class Controller 
{
	//Blocks
	public final int EMTPY = 0;
	public final int PIECEL = 1;
	public final int PIECEBACKL = 2;
	public final int PIECESQUARE = 3;
	public final int PIECELINE = 4;
	public final int PIECET = 5;
	public final int PIECEZ = 6;
	public final int PIECEBACKZ = 7;
	
	private Frame appFrame;
	private TetrisPanel appPanel;
	
	private int[][] grid;
	
	public Controller()
	{
		grid = new int[18][10];
		
		appFrame = new Frame(this);
		appPanel = appFrame.getPanel();
	}
	
	public void start()
	{
		boolean gameRunning = true;
		
		while(gameRunning)
		{
			step();
			appPanel.updateTable(grid);
			appPanel.pause(1);
			
			gameRunning = false;
		}
		
	}
	
	public void step()
	{
		int newPiece = (int)(Math.random() * 8);
		
		grid[0][5] = newPiece;
	}
	
	public void passUp()
	{
		
	}
	
	public void passDrop()
	{
		
	}
	
	public TetrisPanel getPanel()
	{
		return appPanel;
	}
	
	public int[][] getGrid()
	{
		return grid;
	}
}
