package tetris.view;

import tetris.controller.*;

import javax.swing.JPanel;

public class TetrisPanel extends JPanel
{
	private TetrisController appController;
	
	public TetrisPanel(TetrisController appController)
	{
		super();
		
		this.appController = appController;
	}
}
