package PanelAttackPackage;


public class Game
{	private int speed; 		//Number of milliseconds per grid advance
	private int ticknum;	//Number of milliseconds per speed up
	private boolean paused;	//True if game hasnt started
	private GameData gameData1;	//Game data for player 1
	private GameData gameData2;	//Game data for player 2
	public int difficulty;	//1,2,3 = easy, med, hard
	
	public Game(int difficulty) {
		
		this.gameData1 = new GameData(30, 35, 194, 382);	//These are from GameLayoutManager player areas.
		this.gameData2 = new GameData(477, 35, 194, 382);
		setSpeed(15);
		this.paused = true;
	}

	public void gameStart() {
		this.paused = false;
	}
	
	public void tick() {
		if (this.ticknum == 15000) {
			
		}
			gameData1.advanceGrid();
			gameData2.advanceGrid();
	}
	
	public void processMove() {
		//Check if the blocks can be switched:
		/*
		 * if (|| ) {
			return;
		}
		else {
			
		}
		*/
	}
	
	public void checkForCombo() {
		
	}
	
	
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setgameData1(GameData gameData) {
		this.gameData1 = gameData;
	}
	
	public GameData getgameData1() {
		return this.gameData1;
	}
	
	public void setgameData2(GameData gameData) {
		this.gameData2 = gameData;
	}
	
	public GameData getgameData2() {
		return this.gameData2;
	}
}
