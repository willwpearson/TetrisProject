package tetris.controller;

import tetris.view.*;
import tetris.model.*;

public class TetrisController 
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
	
	private TetrisFrame appFrame;
	private TetrisPanel appPanel;
	
	private int[][] grid;
	
	public TetrisController()
	{
		grid = new int[18][10];
		
		appFrame = new TetrisFrame(this, grid);
		appPanel = new TetrisPanel(this, grid);
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
}
