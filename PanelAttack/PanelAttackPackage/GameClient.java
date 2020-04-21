// Game Client class
// Adding logging in communication - Regan

package PanelAttackPackage;

import ocsf.client.AbstractClient;

public class GameClient extends AbstractClient  {
	private int test = 0;
	
	public GameClient() {
		super("localhost", 8300);
	}
	
	public void handleMessageFromServer(Object object) {
		
		if (object instanceof String) {
			System.out.println("String Received: " + String.valueOf(object));
		}
		
		else if (object instanceof Board) {
			System.out.println("Board Data Received");
		}
		
	}
	
	public void connectionEstablished() {
		System.out.println("Connected");
	}
	
	

}
