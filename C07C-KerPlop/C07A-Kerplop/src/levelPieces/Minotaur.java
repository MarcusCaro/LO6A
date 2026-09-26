/*
 * Class: Minotaur
 * Interaction: ADVANCE
 * Movement: N/A
 * Minotaur awaits the players arrival and advances to the next level when at same location.
 * 
 * Authors: Marcus Caro, Trisha Varadaraj
 * Date: 9/25/2026
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;


public class Minotaur extends GamePiece{

    public Minotaur(int loc) {
        super('M', "Minotaur", loc);
    }
    
    /*
     * Minotaur is mythical and can ADVANCE you to next level
     */
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLoc) {
    	if (playerLoc == getLocation()) {
    		return InteractionResult.ADVANCE;
    	}
   
    	return InteractionResult.NONE;
    }
    
}