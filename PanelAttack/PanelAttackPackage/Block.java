package PanelAttackPackage;

import javax.swing.JButton;
import java.awt.*;


public class Block extends JButton 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int blockWidth = 30;
	private final int blockHeight = 30;
	private int initialY = 200;
	private int currentY;
	private int initialX = 0;
	private int currentX;
	private String currentState = "At Rest";
	private String colorMatch = "No";
	private Color color;
	private boolean trash;

	
	
	public Block() {
		
	}
	
	public Block(int x, int y) {
		super();
		this.setPreferredSize(new Dimension(30, 30));
		this.setBounds(x,y,30,30);
		this.setVisible(true);
	}

	

	/**
	 * @return the blockWidth
	 */
	public int getBlockWidth() {
		return blockWidth;
	}


	/**
	 * @return the blockHeight
	 */
	public int getBlockHeight() {
		return blockHeight;
	}


	/**
	 * @return the initialY
	 */
	public int getInitialY() {
		return initialY;
	}


	/**
	 * @param initialY the initialY to set
	 */
	public void setInitialY(int initialY) {
		this.initialY = initialY;
	}


	/**
	 * @return the currentY
	 */
	public int getCurrentY() {
		return currentY;
	}


	/**
	 * @param currentY the currentY to set
	 */
	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}


	/**
	 * @return the initialX
	 */
	public int getInitialX() {
		return initialX;
	}


	/**
	 * @param initialX the initialX to set
	 */
	public void setInitialX(int initialX) {
		this.initialX = initialX;
	}


	/**
	 * @return the currentX
	 */
	public int getCurrentX() {
		return currentX;
	}


	/**
	 * @param currentX the currentX to set
	 */
	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}


	/**
	 * @return the currentState
	 */
	public String getCurrentState() {
		return currentState;
	}


	/**
	 * @param currentState the currentState to set
	 */
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}


	/**
	 * @return the colorMatch
	 */
	public String getColorMatch() {
		return colorMatch;
	}


	/**
	 * @param colorMatch the colorMatch to set
	 */
	public void setColorMatch(String colorMatch) {
		this.colorMatch = colorMatch;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor(Color color) {
		return this.color;
	}
	
	public void setTrash(boolean trash) {
		this.trash = trash;
	}
	
	public boolean getTrash() {
		return this.trash;
	}
	
}
