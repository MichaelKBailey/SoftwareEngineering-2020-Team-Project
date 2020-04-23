/// Game Client class
// Adding logging in communication - Regan

package PanelAttackPackage;

import ocsf.client.AbstractClient;

public class GameClient extends AbstractClient  {
	private int test = 0;
	private GameLayoutManager gameLayout;
	private GamePlayAreaControl gamePlayAreaControl;
	private LoginControl loginControl;
	private RegisterControl registerControl;
	
	public GameClient() {
		super("localhost", 8300);
	}
	
	public GameClient(String address, int port) {
		super(address,port);
	}
	
	public void setLoginControl(LoginControl lc) {
		this.loginControl = lc;
	}
	
	public void setRegisterControl(RegisterControl rc)
	{
		this.registerControl = rc;
	}

	public void setGamePlayAreaControl(GamePlayAreaControl pac) {
		this.gamePlayAreaControl = pac;
	}

	
	public void handleMessageFromServer(Object object) {

		if (object instanceof String) {
			//System.out.println("String Received: " + String.valueOf(object));
			String returnedString = String.valueOf(object);

			switch(returnedString){
			case "Login Successful.":
				loginControl.loginSuccess();
				loginControl.success = true;
				break;
			case "The username and password are incorrect.":
				loginControl.success = false;
				loginControl.loginFailure();
				break;
			case "Account Registration Successful.":
				registerControl.registrationSuccess();
				registerControl.success = true;
				break;
			case "The username is already in use.":
				registerControl.registrationFailure();
				registerControl.success = false;
				break;
			default:
				break;

			}
		}

		else if (object instanceof GameData) {
			gamePlayAreaControl.updateSuccess = true;
			gamePlayAreaControl.receiveUpdate((GameData)object);	//receiveUpdate calls its class's own setter
			System.out.println("GameData Received");
			System.out.println("Game Data Received");
		}

	}

	public void connectionEstablished() {
		System.out.println("Connected");
	}

}
