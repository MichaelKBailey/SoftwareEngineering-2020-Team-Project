package PanelAttackPackage;

import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

public class GameServer extends AbstractServer {

	public GameServer(int port) {
		super(port);
		this.setTimeout(500);
	}

	protected void handleMessageFromClient(Object object, ConnectionToClient connToClient) {

		if (object instanceof LoginData) {
			System.out.println("Login Data Recieved...");
			System.out.println(((LoginData) object).getUsername());
			System.out.println(((LoginData) object).getPassword());
		}

	}

}
