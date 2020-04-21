package PanelAttackPackage;

public class MoveData {
	//The cursor selects a block pair, whose coordinates a referenced by the left block's position
	public int x_of_left;
	public int y_of_left;
	
	
	public MoveData(int x_of_left, int y_of_left) {
		this.x_of_left = x_of_left;
		this.y_of_left = y_of_left;
	}
	
	public int getXOfLeft() {
		return this.x_of_left;
	}
	
	public int getYOfLeft() {
		return this.y_of_left;
	}
	
	public void setXOfLeft(int x_of_left) {
		this.x_of_left = x_of_left;
	}
	
	public void setYOfLeft(int y_of_left) {
		this.y_of_left = y_of_left;
	}
}
