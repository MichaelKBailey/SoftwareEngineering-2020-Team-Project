//
package PanelAttackPackage;

import java.awt.CardLayout;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JTextField;


public class LoginControl implements ActionListener {

	private JPanel panel;
	private GameClient client;
	private JPanel cards;

	public LoginControl(JPanel panel, GameClient client) {
		this.panel = panel;
		this.client = client;
	}
	
	public void setCards(JPanel cards) {
		this.cards = cards;
	}

	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();

		if (command == "Submit") {
			//Try to connect again before the login submission
			try {
				client.openConnection();
			} catch (IOException e) {
				System.out.println("The client couldn't connect before login submit.");
			}
			
			System.out.println("Submit");
			JTextField fieldUsr = (JTextField) panel.getComponent(2);
			JTextField fieldPass = (JTextField) panel.getComponent(3);
			System.out.println(fieldPass.getText());
			System.out.println(fieldUsr.getText());
			
			String username = fieldUsr.getText();
			String password = fieldPass.getText();

			LoginData data = new LoginData(username, password);

			if (data.getUsername().equals("") || data.getPassword().equals("")) {
				System.out.println("Please leave no fields blank.");
				return;
			}
			
			try {
				client.sendToServer(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if (command == "Cancel") {
			CardLayout cardLayout = (CardLayout)cards.getLayout();
		    cardLayout.show(cards, "Welcome Screen");
		}
	}

	public void loginSuccess() {
		CardLayout cardLayout = (CardLayout) cards.getLayout();
	    cardLayout.show(cards, "Main Menu");
	}

	public void loginFailure() {
		//if we want to change any graphics on failure it would be from here
		System.out.println("Login failed.");
		
	}

}
