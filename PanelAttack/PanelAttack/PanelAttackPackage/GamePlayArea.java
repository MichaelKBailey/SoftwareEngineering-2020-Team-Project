package PanelAttackPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.event.ActionEvent;


/*
 *	The purpose of this section is to create the GamePlayArea. Once both players press the "Ready" button, InitializePlayerPanels() will be called:
 *		InitializePlayerPanels() will:
 *			Build each player's respective panel
 *			Build each player's respective ArrayList
 *			Initialize the ArrayList with pre-defined blocks
 *			Add unique, randomly generated, blocks to each players respective panels
 * 
 */

public class GamePlayArea extends JFrame							
{
	final JPanel GamePlayArea = new JPanel();
	
	
	public GamePlayArea() 
	{
		this.setTitle("title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel ScoreBoard = new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				g.setColor( getBackground() );
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		ScoreBoard.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 204, 0), new Color(0, 102, 255), new Color(255, 204, 0), new Color(0, 102, 204)));
		ScoreBoard.setOpaque(true);
		ScoreBoard.setBackground(new Color (10,10,10,20)); //This gives us 20% opacity for the panel
		ScoreBoard.setBounds(256, 101, 191, 240);
		getContentPane().add(ScoreBoard);
		ScoreBoard.setLayout(null);
		
		PlayersPanel PlayerOnePanel = new PlayersPanel()
		{
			protected void paintComponent(Graphics g)
			{
				g.setColor( getBackground() );
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		PlayerOnePanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 204, 0), new Color(0, 102, 255), new Color(255, 204, 0), new Color(0, 102, 204)));
		PlayerOnePanel.setOpaque(true);
		PlayerOnePanel.setBackground(new Color (10,10,10,20)); //This gives us 20% opacity for the panel
		PlayerOnePanel.setBounds(30, 35, 194, 382);
		getContentPane().add(PlayerOnePanel);
		PlayerOnePanel.setLayout(null);
		PlayerOnePanel.setVisible(false);



PlayersPanel PlayerTwoPanel = new PlayersPanel()
		{
			protected void paintComponent(Graphics g)
			{
				g.setColor( getBackground() );
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		PlayerTwoPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 204, 0), new Color(0, 102, 255), new Color(255, 204, 0), new Color(0, 102, 204)));
		PlayerTwoPanel.setOpaque(true);
		PlayerTwoPanel.setBackground(new Color (10,10,10,20)); //This gives us 20% opacity for the panel
		PlayerTwoPanel.setBounds(477, 35, 194, 382);
		getContentPane().add(PlayerTwoPanel);
		PlayerTwoPanel.setLayout(null);
		PlayerTwoPanel.setVisible(false);
		

		JLabel runningTimeLabel = new JLabel("Running Time");
		runningTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		runningTimeLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		runningTimeLabel.setBounds(10, 7, 171, 28);
		ScoreBoard.add(runningTimeLabel);

		JLabel runningTime = new JLabel( new Date().toString() );
		runningTime.setBounds(10, 41, 171, 35);
		ScoreBoard.add(runningTime);

		JCheckBox p1Checkbox = new JCheckBox("P1");
		p1Checkbox.setSelected(false);
		p1Checkbox.setBounds(6, 210, 50, 23);
		ScoreBoard.add(p1Checkbox);

		JCheckBox p2Checkbox = new JCheckBox("P2");
		p2Checkbox.setSelected(false);
		p2Checkbox.setBounds(131, 210, 50, 23);
		ScoreBoard.add(p2Checkbox);

		JLabel PlayerOneLabel = new JLabel("Player One");
		PlayerOneLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PlayerOneLabel.setBounds(30, 5, 194, 20);
		getContentPane().add(PlayerOneLabel);

		JLabel PlayerTwoLabel = new JLabel("Player Two");
		PlayerTwoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PlayerTwoLabel.setBounds(477, 5, 194, 20);
		getContentPane().add(PlayerTwoLabel);

		JButton timerStartButton = new JButton("Ready");
		timerStartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				PlayerOnePanel.setVisible(true);
				p1Checkbox.setSelected(true);
				PlayerTwoPanel.setVisible(true);
				p2Checkbox.setSelected(true);
				ButtonBlocks TestBlock = new ButtonBlocks(); 
				GameData GD = new GameData();
				PlayerOnePanel.add(TestBlock);
				TestBlock.setBounds(TestBlock.getInitialX(), TestBlock.getInitialY(), 30, 30);
				
				
				
				
				
				
//				ButtonBlocks buttonBlock = new ButtonBlocks();
//				PlayerOnePanel.add(buttonBlock);
//				buttonBlock.setBounds(buttonBlock.getInitialX(), buttonBlock.getInitialY(), buttonBlock.getWidth(), buttonBlock.getHeight());
//				

			}
		});
		
	
		timerStartButton.setBounds(305, 352, 89, 23);
		getContentPane().add(timerStartButton);
		
		JButton MoveTheBlocks = new JButton("Move Blocks");
		MoveTheBlocks.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		MoveTheBlocks.setBounds(282, 386, 136, 23);
		getContentPane().add(MoveTheBlocks);
		

		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		backgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundLabel.setBounds(0, 0, 701, 452);
		getContentPane().add(backgroundLabel);
		backgroundLabel.setIcon(new ImageIcon("C:\\Users\\Michael\\Desktop\\Software Engineering\\PanelAttack\\UseThis.jpg"));

	}
		
		
		
		
		
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			GamePlayArea Game1 = new GamePlayArea();
			Game1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Game1.setSize(702,452);
			Game1.setVisible(true);
			Game1.setResizable(false);

		}
}
