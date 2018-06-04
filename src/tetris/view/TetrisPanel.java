package tetris.view;

import tetris.controller.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class TetrisPanel extends JPanel implements KeyListener
{
	private Controller appController;
	private SpringLayout appLayout;
	private int[][] grid;
	private String[][] gridNums;
	private int[][] selected;
	
	private JTable tetrisGrid;
	private JButton startButton;
	private JButton pauseButton;
	private JLabel scoreLabel;
	private JLabel linesLabel;
	
	public TetrisPanel(Controller appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		this.grid = appController.getGrid();
		this.setFocusable(true);
		this.requestFocusInWindow();
		gridNums = new String[18][10];
		for(int row = 0; row < 18; row ++)
		{
			for(int col = 0; col < 10; col++)
			{
				gridNums[row][col] = grid[row][col] + "";
			}
		}
		
		tetrisGrid = new JTable(gridNums, gridNums[0]);
		startButton = new JButton("Start");
		pauseButton = new JButton("Pause");
		scoreLabel = new JLabel();
		linesLabel = new JLabel();
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		tetrisGrid.setGridColor(Color.black);
		//tetrisGrid.setBackground(Color.black);
		tetrisGrid.setEnabled(false);
		System.out.println(tetrisGrid.getRowHeight());
		tetrisGrid.setRowHeight(26);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		
		this.add(tetrisGrid);
		this.add(startButton);
		this.add(pauseButton);
		this.add(scoreLabel);
		this.add(linesLabel);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, tetrisGrid, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, tetrisGrid, 0, SpringLayout.WEST, startButton);
		appLayout.putConstraint(SpringLayout.SOUTH, tetrisGrid, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, tetrisGrid, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, startButton, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, startButton, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, pauseButton, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, pauseButton, 0, SpringLayout.SOUTH, startButton);
	}
	
	private void setupListeners()
	{
		startButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				appController.start();
			}
		});
		
		pauseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		addKeyListener(this);
	}
	
	public void updateBlockUp()
	{
		appController.passUp();
	}
	
	public void updateBlockRight()
	{
		
	}
	
	public void updateBlockLeft()
	{
		
	}
	
	public void drop()
	{
		appController.passDrop();
	}
	
	public void updateTable(int[][] newGrid)
	{
		for(int row = 0; row < 18; row ++)
		{
			for(int col = 0; col < 10; col++)
			{
				gridNums[row][col] = newGrid[row][col] + "";
			}
		}
		
		tetrisGrid.repaint();
		
	}
	
	public void pause(int milliseconds)
	  {
	    try
	    {
	      Thread.sleep(milliseconds);
	    }
	    catch(InterruptedException e)
	    {
	      throw new RuntimeException(e);
	    }
	  }

	@Override
	public void keyTyped(KeyEvent e) 
	{

	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_UP) 
		{
            System.out.println("Up key pressed");
            updateBlockUp();
        }
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) 
		{
            System.out.println("Right key pressed");
            updateBlockRight();
        }
		if (e.getKeyCode() == KeyEvent.VK_LEFT) 
		{
            System.out.println("Left key pressed");
            updateBlockLeft();
        }
		if (e.getKeyCode() == KeyEvent.VK_SPACE) 
		{
            System.out.println("Space key pressed");
            drop();
        }
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{

	}
}
