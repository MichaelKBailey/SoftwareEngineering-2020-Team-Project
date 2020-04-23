package PanelAttackPackage;

//This class exists for the purpose of simplifying things: only having to send one object over network;
public class GameData
{	public BoardData board1;	//Player 1's board
	public BoardData board2;	//Player 2's board

	
	public GameData() {
		this.board1 = new BoardData(30, 35, 194, 382);
		this.board2 = new BoardData(477, 35, 194, 382);
	}
}
