package PanelAttackPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePlayAreaControl implements ActionListener {

	private JPanel playAreaPanel;
	private GameClient client;
	private JPanel cards;
	private JPanel playerOnePanel;
	private JPanel playerTwoPanel;

	
	public GamePlayAreaControl() {
		
	}
	
	public GamePlayAreaControl(JPanel playAreaPanel, JPanel playerOnePanel, JPanel playerTwoPanel, GameClient client) {
		this.playAreaPanel = playAreaPanel;
		this.playerOnePanel = playerOnePanel;
		this.playerTwoPanel = playerTwoPanel;
		this.client = client;
	}
	
	public void gameStart() {
		this.playerOnePanel.setVisible(true);
		this.playerTwoPanel.setVisible(true);
	}
	
	public void drawBoard(GameData gameData) {
		//Remove old blocks:
		this.playerOnePanel.removeAll();
		this.playerTwoPanel.removeAll();
		
		//Draw new blocks:
		for (ArrayList<Block>row : gameData.playerOneGrid) {	//Do this for Player 1
			for (Block block : row) {
				block.setVisible(true);
				this.playerOnePanel.add(block);
			}
		}
		for (ArrayList<Block>row : gameData.playerTwoGrid) {	//Do this for Player 2
			for (Block block : row) {
				block.setVisible(true);
				this.playerTwoPanel.add(block);
			}
		}
	}
	
	public void setPanels(JPanel playAreaPanel, JPanel playerOnePanel, JPanel playerTwoPanel) {
		this.playAreaPanel = playAreaPanel;
		this.playerOnePanel = playerOnePanel;
		this.playerTwoPanel = playerTwoPanel;
	}
	
	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
	}
}