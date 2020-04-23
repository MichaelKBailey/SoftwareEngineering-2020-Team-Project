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
	private GameData gameData;
	
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
		drawBoard();
	}
	
	public void receiveUpdate(GameData gameData) {
		/*As it stands, the client redraws its screen only when it receives an update from the server.
		 * However, rather than handleMessageFromServer calling drawBoard (below) directly, it calls this.
		 */
		setGameData(gameData);
		this.drawBoard();
	}
	
	public void drawBoard() {
		//Remove old blocks:
		this.playerOnePanel.removeAll();
		this.playerTwoPanel.removeAll();
		
		//Draw new blocks:
		for (ArrayList<Block>row : gameData.playerOneGrid) {	//Do this for Player 1
			for (Block block : row) {
				if (block != null) {
					block.setVisible(true);
					this.playerOnePanel.add(block);
				}	
			}
		}
		for (ArrayList<Block>row : gameData.playerTwoGrid) {	//Do this for Player 2
			for (Block block : row) {
				if (block != null) {
					block.setVisible(true);
					this.playerTwoPanel.add(block);
				}
			}
		}
	}
	
	public void setGameData(GameData gameData) {
		this.gameData = gameData;
	}
	
	public void setPanels(JPanel playAreaPanel, JPanel playerOnePanel, JPanel playerTwoPanel) {
		this.playAreaPanel = playAreaPanel;
		this.playerOnePanel = playerOnePanel;
		this.playerTwoPanel = playerTwoPanel;
	}
	
	public GameData getGameData() {
		return this.gameData;
	}
	
	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
	}
}