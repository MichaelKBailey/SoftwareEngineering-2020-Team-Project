package PanelAttackPackage;

import java.io.*;
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
		String result;
		if (object instanceof LoginData) {
			// If we received LoginData, verify the account information.
			if (object instanceof LoginData)
			{
				// Check the username and password with the database.
				LoginData data = (LoginData)object;
				if (db.verifyAccount(data.getUsername(), data.getPassword()))
				{
					result = "Login Successful.";
					System.out.println("Client " + connToClient.getId() + " successfully logged in as " + data.getUsername());
				}
				else
				{
					result = "The username and password are incorrect.";
					System.out.println("Client " + connToClient.getId() + " failed to log in");
				}

				// Send the result to the client.
				try
				{
					connToClient.sendToClient(result);
				}
				catch (IOException e)
				{
					return;
				}
			}
		}

		else if (object instanceof RegisterData) {
			// Try to create the account.
		      RegisterData data = (RegisterData)object;
		      if (db.createNewAccount(data.getUsername(), data.getPassword()))
		      {
		        result = "Account Registration Successful.";
		        System.out.println("Client " + connToClient.getId() + " registered a new account called " + data.getUsername());
		      }
		      else
		      {
		        result = "The username is already in use.";
		        System.out.println("Client " + connToClient.getId() + " failed to create a new account");
		      }
		      
		      // Send the result to the client.
		      try
		      {
		        connToClient.sendToClient(result);
		      }
		      catch (IOException e)
		      {
		        return;
		      }
		}

		else if (object instanceof MoveData) {
			System.out.println("Move Data Received");
			System.out.println("We should figure out what goes here.");
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
