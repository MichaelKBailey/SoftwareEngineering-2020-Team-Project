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
	private JPanel scoreBoardPanel;
	private GameData gameData;
	private UserData opponentUser;
	private UserData selfUser;
	
	
	public GamePlayAreaControl(GameClient client) {
		this.client = client;
	}
	
	public GamePlayAreaControl(JPanel playAreaPanel, JPanel playerOnePanel, JPanel playerTwoPanel, JPanel scoreBoardPanel, GameClient client) {
		this.playAreaPanel = playAreaPanel;
		this.playerOnePanel = playerOnePanel;
		this.playerTwoPanel = playerTwoPanel;
		this.scoreBoardPanel = scoreBoardPanel;
		this.client = client;
	}
	
	public void gameStart() {
		System.out.println("game start method run");
		this.playAreaPanel.setVisible(true);
		this.playerOnePanel.setVisible(true);
		this.playerTwoPanel.setVisible(true);
		this.playAreaPanel.repaint();
		drawBoard();
	}
	
	public void receiveUpdate(GameData gameData) {
		/*As it stands, the client redraws its screen only when it receives an update from the server.
		 * However, rather than handleMessageFromServer calling drawBoard (below) directly, it calls this.
		 */
		this.setGameData(gameData);
		this.drawBoard();
	}
	
	public void drawBoard() {
		//Remove old blocks:
		this.playerOnePanel.removeAll();
		this.playerTwoPanel.removeAll();
		
		//Draw new blocks:
		for (ArrayList<Block>row : gameData.board1.grid) {	//Do this for Player 1
			for (Block block : row) {
				if (block != null) {
					block.setVisible(true);
					this.playerOnePanel.add(block);
				}	
			}
		}
		for (ArrayList<Block>row : gameData.board2.grid) {	//Do this for Player 2
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
	
	public void setPanels(JPanel playAreaPanel, JPanel playerOnePanel, JPanel playerTwoPanel, JPanel scoreBoardPanel) {
		this.playAreaPanel = playAreaPanel;
		this.playerOnePanel = playerOnePanel;
		this.playerTwoPanel = playerTwoPanel;
		this.scoreBoardPanel = scoreBoardPanel;
	}
	
	public GameData getGameData() {
		return this.gameData;
	}
	
	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
	}
}