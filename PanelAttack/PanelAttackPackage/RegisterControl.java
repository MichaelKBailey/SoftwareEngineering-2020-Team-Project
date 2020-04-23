package PanelAttackPackage;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterControl implements ActionListener{
	private JPanel container;
	private GameClient client;
	private JPanel cards;

	//tired of fighting for references
	private JTextField RegisterConfirmPasswordTextField;
	private JTextField RegisterPasswordTextField;
	private JTextField RegisterUsernameTextField;

	public RegisterControl(JPanel registerPanel, GameClient client) {
		this.container = container;
		this.client = client;
	}

	public void setCards(JPanel cards) {
		this.cards = cards;
	}

	public void registrationSuccess() {
		CardLayout cardLayout = (CardLayout)cards.getLayout();
		cardLayout.show(cards, "Main Menu");
	}

	public void registrationFailure() {
		//if we want to change any graphics on failure it would be from here
		System.out.println("Registration failed.");

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String command = arg0.getActionCommand();
		if (command == "Submit") {
			/*
			System.out.println("Submit");
			JTextField fieldUsr = (JTextField) container.getComponent(5);
			System.out.println("ye1");
			JTextField fieldPass = (JTextField) container.getComponent(4);
			System.out.println("ye2");
			JTextField fieldPassVer = (JTextField) container.getComponent(3);
			System.out.println("ye3");
			 */

			String username = RegisterUsernameTextField.getText();
			String password = RegisterPasswordTextField.getText();
			String passwordVer = RegisterConfirmPasswordTextField.getText();

			if (password.equals(passwordVer)) {
				//Try to connect again before the registration submission
				try {
					client.openConnection();
				} catch (IOException e) {
					System.out.println("The client couldn't connect before registration submit.");
				}

				RegisterData data = new RegisterData(username, password, passwordVer);

				if (data.getUsername().equals("") || data.getPassword().equals("") || data.getPassword().equals("")) {
					System.out.println("Please leave no fields blank.");
					return;
				}

				try {
					client.sendToServer(data);
				} catch (IOException e) {
					e.printStackTrace();
					//System.out.println("Error sending registration data to server.");
				}
			}else
			{
				System.out.println("Passwords do not match.");
			}
		}else if (command == "Cancel") {
			CardLayout cardLayout = (CardLayout)cards.getLayout();
			cardLayout.show(cards, "WELCOMEPANEL");
		}
	}

	public void setRegisterConfirmPasswordTextField(JTextField registerConfirmPasswordTextField) {
		RegisterConfirmPasswordTextField = registerConfirmPasswordTextField;
	}

	public void setRegisterPasswordTextField(JTextField registerPasswordTextField) {
		RegisterPasswordTextField = registerPasswordTextField;
	}

	public void setRegisterUsernameTextField(JTextField registerUsernameTextField) {
		RegisterUsernameTextField = registerUsernameTextField;
	}

}
