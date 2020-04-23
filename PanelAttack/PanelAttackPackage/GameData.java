package PanelAttackPackage;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random; 

public class Board
{	//This class abstracts the precise pixel positioning of the button blocks into integer indices in a grid
	
	private int x;		//topleft x coordinate of the boundaries for blocks
	private int y;		//topleft y coordinate of the boundaries for blocks
	private int width;	//width of boundaries for blocks
	private int height;	//height of boundaries for blocks
	
	public ArrayList<ArrayList<ButtonBlocks>> grid;

	public Board(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		//Generate the 6 rows of starting blocks:
		for (int i = 0; i < 6; i++) {
			generateNewRow(0);
		}
	}
	
	public void generateTrash(int width, int height, boolean right0left1) {
		//Trash blocks either fill the board (6blocks wide) or are against the left or right side (4blocks wide)
		
		generateNewRow(grid.size());	//if the board has 5 rows, indices 0-4, then size() returns 5 which will be the index of the next row on top
		for (ButtonBlocks b : grid.get(grid.size()-1)) {	//set the trash flag on the new row
			b.setTrash(true);
			b.setColor(Color.gray);
		}
		if (width == 4) {
			if (right0left1 == true) {
				grid.get(grid.size()).set(4, null);
				grid.get(grid.size()).set(5, null);
			}
			else {
				grid.get(grid.size()).set(0, null);
				grid.get(grid.size()).set(1, null);
			}
		}
	}
	
	public void generateNewRow(int row_index) {
		//row_index is 0 for a new row at the bottom/below the bottom
		ArrayList<ButtonBlocks> newrow = new ArrayList<ButtonBlocks>();
		int new_y = 0;
		
		//Is this a new row at the bottom, or trash blocks at the top?
		if (row_index == 0) {
			newrow.add(0, new ButtonBlocks(x, new_y));
			newrow.add(1, new ButtonBlocks(x+30, new_y));
			newrow.add(2, new ButtonBlocks(x+60, new_y));
			newrow.add(3, new ButtonBlocks(x+90, new_y));
			newrow.add(4, new ButtonBlocks(x+120, new_y));
			newrow.add(5, new ButtonBlocks(x+150, new_y));
			grid.add(0, newrow);
		}
		else {
			//Find a non-null block in the topmost row to get its y coord, then add 40 for the new row's y
			for (ButtonBlocks b : grid.get(grid.size()-1)) {
				if (b != null) {
					new_y = b.getCurrentY() + 40;
					break;
				}
			}
	
			newrow.add(0, new ButtonBlocks(x, new_y));
			newrow.add(1, new ButtonBlocks(x+30, new_y));
			newrow.add(2, new ButtonBlocks(x+60, new_y));
			newrow.add(3, new ButtonBlocks(x+90, new_y));
			newrow.add(4, new ButtonBlocks(x+120, new_y));
			newrow.add(5, new ButtonBlocks(x+150, new_y));
			grid.add(grid.size(), newrow);
		}
		
		//Generate the colors for the new row
		for (ButtonBlocks b : newrow) {
			b.setColor(randomColor());
		}
	}
	
	public boolean changeBlockPosition (int x1, int y1, int x2, int y2) {
		//Returns false if block at either position is null;
		//if (grid.get(y1))
		return true;
	}
	
	public boolean advanceGrid() {
		/*It takes 15 ticks upward until a new row is playable,
		 * therefore this method ticks a row (and the whole board) upward by 1/15th of a block's height,
		 * by traversing every block and ticking their y values.
		 * Speed increases means this is called more frequently, but the actual change in height per tick remains the same
		 * Returning false means game over
		*/
		
		for (ArrayList<ButtonBlocks>row : grid) {
			for (ButtonBlocks block : row) {
				block.setCurrentY((block.getCurrentY() + 2));
			}
		}
		
		//Check if the last row's y coordinate is above the panel height, in which case GAME OVER:
		for (ButtonBlocks b : grid.get(grid.size()-1)) {
			if (b != null) {
				if (grid.get(grid.size()-1).get(0).getCurrentY() > y) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		return true;
	}
	
	private Color randomColor() {
		Color c = Color.red;
		Random rand = new Random();
		int n = rand.nextInt(5);
		
		switch(n) {
			case 0:
				c = Color.red;
				break;
			case 1:
				c = Color.green;
				break;
			case 2:
				c = Color.yellow;
				break;
			case 3:
				c = Color.magenta;
				break;
			case 4:
				c = Color.blue;
				break;
			default:
				break;
		}
		
		return c;
	}
}
