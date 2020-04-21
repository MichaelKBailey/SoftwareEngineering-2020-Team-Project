package PanelAttackPackage;

import java.util.concurrent.*;
import java.util.Date;

public class Game
{	private int speed; 	//Number of milliseconds per grid advance
	private int ticknum;//Number of milliseconds per speed up
	private ScheduledExecutorService timer;
	private Board board1;
	private Board board2;
	
	public Game() {
		timer = Executors.newSingleThreadScheduledExecutor();
		this.board1 = new Board();
		this.board2 = new Board();
		setSpeed(15);
	}

	public void gameStart() {
		//Start the timer calling once per milisec. Decrease this.speed to speed up
		timer.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() { tick();	}
		}, 0, 1, TimeUnit.MILLISECONDS);
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
