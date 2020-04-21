package PanelAttackPackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.*;
import java.util.Date;

public class ServerMain
{
	private GameServer server;
	private ScheduledExecutorService timer;	//Used for both updating the board position and the network frequency
	private Game game;
	private Database db;
	
	
	/*ServerMain.java creates the:
	1. network (GameServer.java)
	2. game logic (Game.java)
	3. game data (Board.java)
	4. game clock (timer)
	5. database (Database.java)
	*/
	public ServerMain() {
		this.db = new Database();
		server = new GameServer(5500, db);
		
		//Start the timer calling once per milisec. Decrease this.speed to speed up
		timer = Executors.newSingleThreadScheduledExecutor();
			timer.scheduleWithFixedDelay(new Runnable() {
				@Override
				public void run() { game.tick();	}
			}, 0, 1, TimeUnit.MILLISECONDS);
	}

	
	
	public static void main(String[] args)
	{	//Create the ServerMain object to kickstart everything serverside
		new ServerMain();

	}

}