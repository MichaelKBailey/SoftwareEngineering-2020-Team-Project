package PanelAttackPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class PlayersPanel extends JPanel
{

	public PlayersPanel()
	{
		super(); 
		JPanel PlayerPanel = new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				g.setColor( getBackground() );
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};
//		PlayerPanel.setPreferredSize(new Dimension(194,382));
//		PlayerPanel.setVisible(true);
//		PlayerPanel.setOpaque(true);
//		PlayerPanel.setBackground(new Color (10,10,10,20)); //This gives us 20% opacity for the panel
//		PlayerPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 204, 0), new Color(0, 102, 255), new Color(255, 204, 0), new Color(0, 102, 204)));
//		
	}

}
