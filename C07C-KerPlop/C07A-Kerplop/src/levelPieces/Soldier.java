/*
 * Class: Soldier
 * Interaction: NONE
 * Movement: One direction at a time, one tile at a time.
 * Soldier marches in one direction at a time. Does not interact.
 * 
 * Authors: Marcus Caro, Trisha Varadaraj
 * Date: 9/25/2026
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractionResult;


public class Soldier extends GamePiece implements Moveable{


	private boolean moveRight;
	
	public Soldier(int loc) {
		super('>', "Soldier", loc);
		moveRight = true;
	}
	
	/*
	 * Determine direction of movement
	 */
	@Override
	public void move(Drawable[] gameBoard, int playerLoc) {
		int oldLoc = getLocation();
		int move = moveRight ? 1 : -1;
		int newLoc = oldLoc + move;
		
		if (newLoc < 0 || newLoc >= gameBoard.length || gameBoard[newLoc] != null) {
			moveRight = !moveRight; //Move left
			move = moveRight ? 1 : -1;
			newLoc = oldLoc + move;
			
			if (newLoc < 0 || newLoc >= gameBoard.length || gameBoard[newLoc] != null) {
				return;
			}
		}
		
		gameBoard[oldLoc] = null;
		setLocation(newLoc);
		gameBoard[newLoc] = this;
		symbol = moveRight ? '>' : '<'; 
		
	}
	
	/*
	 * Interaction is NONE
	 */
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int loc) {
		return InteractionResult.NONE;
	}
	
}
