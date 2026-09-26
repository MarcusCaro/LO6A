/*
 * Class: Wasp
 * Interaction: HIT
 * Movement: N/A
 * Hits player when at same location.
 * 
 * Authors: Marcus Caro, Trisha Varadaraj
 * Date: 9/25/2026
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Wasp extends GamePiece {
	
	public Wasp(int loc) {
		super('#', "Wasp Nest", loc);
	}
	
	/*
	 * Wasp hits player when at same location
	 */
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLoc) {
		
		if (playerLoc == getLocation()) {
			return InteractionResult.HIT;
		}
		
		return InteractionResult.NONE;
	}
	
	
}
