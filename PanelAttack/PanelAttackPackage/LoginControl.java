package PanelAttackPackage;

import java.awt.CardLayout;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginControl implements ActionListener {

	private JPanel panel;
	private GameClient client;

	public LoginControl(JPanel panel, GameClient client) {
		this.panel = panel;
		this.client = client;
	}

	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();

		if (command == "Submit") {
			System.out.println("Submit");
			JTextField fieldUsr = (JTextField) panel.getComponent(2);
			JTextField fieldPass = (JTextField) panel.getComponent(3);

			String username = fieldUsr.getText();
			String password = fieldPass.getText();

			LoginData data = new LoginData(username, password);

			if (data.getUsername().equals("") || data.getPassword().equals("")) {
				System.out.println("test successful");
				return;
			}
			
			try {
				client.sendToServer(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void loginSuccess() {
		// TODO Auto-generated method stub
		
	}

	public void loginFailure() {
		// TODO Auto-generated method stub
		
	}

}
