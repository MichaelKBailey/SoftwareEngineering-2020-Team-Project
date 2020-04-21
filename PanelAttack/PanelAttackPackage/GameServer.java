package PanelAttackPackage;

import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

public class GameServer extends AbstractServer {
	private Database db;


	public GameServer(int port, Database db) {
		super(port);
		this.setTimeout(500);
		this.db = db;
	}

	protected void handleMessageFromClient(Object object, ConnectionToClient connToClient) {

		if (object instanceof LoginData) {
			System.out.println("Login Data Recieved...");
			System.out.println(((LoginData) object).getUsername());
			System.out.println(((LoginData) object).getPassword());
		}

		else if (object instanceof RegisterData) {
			System.out.println("Register Data Received");
		}

		else if (object instanceof MoveData) {
			System.out.println("Move Data Received");
		}
	}

	// When a client connects or disconnects, display a message in the console.
	public void clientConnected(ConnectionToClient client)
	{
		System.out.println("Client " + client.getId() + " connected\n");
	}

	// When the server starts update the console
	public void serverStarted()
	{
		System.out.println("Server started");
	}

	// Method that handles listening exceptions by displaying exception information.
	public void listeningException(Throwable exception) 
	{
		System.out.println("Listening exception: " + exception.getMessage());
	}
}
