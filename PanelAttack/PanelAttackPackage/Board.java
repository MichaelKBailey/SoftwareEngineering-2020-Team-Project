package PanelAttackPackage;

import java.util.ArrayList;

public class Board
{	//This class abstracts the precise pixel positioning of the button blocks into integer indices in a grid
	public ArrayList<ArrayList<ButtonBlocks>> grid;

	public Board(/*difficulty*/) {
		//Generate the starting blocks:
		//
	}
	
	public void generateTrash(int width, int height, boolean right0left1) {
		//Trash blocks either fill the board (6blocks wide) or are against the left or right side (4blocks wide)
		
	}
	
	public void generateNewRow() {
		
	}
	
	public void changeBlockPosition (int x1, int y1, int x2, int y2) {
		
	}
	
	public void advanceGrid() {
		//Traverses every block and ticks their y values by a set amount
		//Speed increases means this is called more frequently
	}
}
