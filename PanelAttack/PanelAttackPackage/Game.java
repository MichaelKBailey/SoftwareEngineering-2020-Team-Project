package PanelAttackPackage;


public class Game
{	private int speed; 		//Number of milliseconds per grid advance
	private int ticknum;	//Number of milliseconds per speed up
	private boolean paused;	//True if game hasnt started
	public int difficulty;	//1,2,3 = easy, med, hard
	public GameData gameData;
	
	
	public Game(int difficulty) {
		setSpeed(15);
		this.paused = true;
		
	}
		
	public void gameStart() {
		this.paused = false;
	}
	
	public void tick() {
		if (this.ticknum == 15000) {
			
		}
			//gameData1.advanceGrid();
			//gameData2.advanceGrid();
	}	
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
