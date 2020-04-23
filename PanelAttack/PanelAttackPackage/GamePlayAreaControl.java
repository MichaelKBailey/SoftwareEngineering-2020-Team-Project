package PanelAttackPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class GamePlayAreaControl implements ActionListener {

	private JPanel panel;
	private GameClient client;
	private JPanel cards;
	private JPanel PlayerOnePanel, PlayerTwoPanel;

	public GamePlayAreaControl(JPanel panel, GameClient client) {
		this.panel = panel;
		this.client = client;
	}
	
	public void gameStart() {
		this.PlayerOnePanel.setVisible(true);
		this.PlayerTwoPanel.setVisible(true);
	}
	
	/*
	 * public void setCards(JPanel cards) {
		this.cards = cards;
	}
	*/

	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
	}

	public void drawBoard(Board b) {
		////////////////////////////////
		//SHOULD THIS
		cards.remo
		////////////////////////////////
	}
}