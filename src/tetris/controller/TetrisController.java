package tetris.controller;

import tetris.view.*;
import tetris.model.*;

public class TetrisController 
{
	private TetrisFrame appFrame;
	
	private int[][] grid;
	
	public TetrisController()
	{
		appFrame = new TetrisFrame(this);
		
		grid = new int[18][10];
	}
	
	public void start()
	{
		
	}
}
