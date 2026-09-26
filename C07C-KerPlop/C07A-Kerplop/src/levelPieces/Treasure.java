/*
 * Class: Treasure
 * Interaction: GET_POINT
 * Movement: N/A
 * Gives player points when found.
 * 
 * Authors: Marcus Caro, Trisha Varadaraj
 * Date: 9/25/2026
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;


public class Treasure extends GamePiece{

	public Treasure(int loc) {
		super('$', "Treasure", loc);
	}
	
	/*
	 * Give player points when at same location
	 */
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLoc) {
		
		if (playerLoc == getLocation()) {
			gameBoard[getLocation()] = null;
			return InteractionResult.GET_POINT;
		}
		
		return InteractionResult.NONE;
	}
	
	
}