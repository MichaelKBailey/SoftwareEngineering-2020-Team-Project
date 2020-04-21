package PanelAttackPackage;

public class ServerMain
{
	private GameServer server;

	
	public ServerMain() {
		server = new GameServer(5500);
		
	}
	
	
	public static void main(String[] args)
	{
		new ServerMain();

	}

}
