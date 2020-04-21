package PanelAttackPackage;


public class Game
{	private int speed; 	//Number of milliseconds per grid advance
	private int ticknum;//Number of milliseconds per speed up
	private boolean paused;	//True if game hasnt started
	private Board board1;
	private Board board2;
	public int difficulty;	//1,2,3 = easy, med, hard
	
	public Game(int difficulty) {
		
		this.board1 = new Board(30, 35, 194, 382);	//These are from GameLayoutManager player areas.
		this.board2 = new Board(477, 35, 194, 382);
		setSpeed(15);
		this.paused = true;
	}

	public void gameStart() {
		this.paused = false;
	}
	
	public void tick() {
		if (this.ticknum == 15000) {
			
		}
			board1.advanceGrid();
			board2.advanceGrid();
	}
	
	public void processMove() {
		
	}
	
	public void checkForCombo() {
		
	}
	
	
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setBoard1(Board board) {
		this.board1 = board;
	}
	
	public Board getBoard1() {
		return this.board1;
	}
	
	public void setBoard2(Board board) {
		this.board2 = board;
	}
	
	public Board getBoard2() {
		return this.board2;
	}
}
