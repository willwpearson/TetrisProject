package tetris.view;

import tetris.controller.*;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.*;

public class TetrisPanel extends JPanel
{
	private TetrisController appController;
	private SpringLayout appLayout;
	
	private JTable tetrisGrid;
	private JButton startButton;
	private JButton pauseButton;
	private JLabel scoreLabel;
	private JLabel linesLabel;
	
	public TetrisPanel(TetrisController appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		tetrisGrid = new JTable(18, 10);
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
		tetrisGrid.setBackground(Color.black);
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
		
	}
	
	public void updateBlock()
	{
		
	}
}
