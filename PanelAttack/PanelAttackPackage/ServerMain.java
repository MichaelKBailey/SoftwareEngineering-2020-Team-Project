package PanelAttackPackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.*;
import java.io.IOException;
import java.util.Date;

public class ServerMain
{
	private GameServer server;
	private ScheduledExecutorService timer;	//Used for both updating the board position and the network frequency
	private Database db;
	private Game game;
	
	/*ServerMain.java creates the:
	1. network (GameServer.java)
	2. game logic (Game.java)
	3. game data (Board.java)
	4. game clock (timer)
	5. database (Database.java)
	*/
	public ServerMain() {
		
		try {
			this.db = new Database();
		} catch (IOException e) {
			System.out.println("The database failed to start.");
			e.printStackTrace();
		}
		
		server = new GameServer(8300, db);
		server.game = new Game(1);
		try
		{
			server.listen();

		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Start the timer calling once per milisec. Decrease this.speed to speed up
		timer = Executors.newSingleThreadScheduledExecutor();
			timer.scheduleWithFixedDelay(new Runnable() {
				@Override
				public void run() { game.tick(); server.sendToAllClients(game.gameData);	}
			}, 0, 1, TimeUnit.MILLISECONDS);
	}

	
	
	public static void main(String[] args)
	{	//Create the ServerMain object to kickstart everything serverside
		new ServerMain();

	}

}
