package PanelAttackPackage;


public class Game
{	private int speed; 		//Number of milliseconds per grid advance
	private int ticknum;	//Number of milliseconds per speed up
	private boolean paused;	//True if game hasnt started
	public int difficulty;	//1,2,3 = easy, med, hard
	public BoardData board1;	//Player 1's board
	public BoardData board2;	//Player 2's board
	
	
	public Game(int difficulty) {
		setSpeed(15);
		this.paused = true;
		this.board1 = new BoardData(30, 35, 194, 382);
		this.board2 = new BoardData(477, 35, 194, 382);
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
