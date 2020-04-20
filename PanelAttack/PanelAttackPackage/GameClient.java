// Game Client class
// Adding logging in communication - Regan

package PanelAttackPackage;

import ocsf.client.AbstractClient;

public class GameClient extends AbstractClient  {
	private int test = 0;
	
	public GameClient() {
		super("localhost", 5555);
	}
	
	public void handleMessageFromServer(Object object) {
		
		if (object instanceof String) {}
		
		
	}

}
