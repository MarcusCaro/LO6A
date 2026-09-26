/*
 * Class: Medusa
 * Interaction: KILL
 * Movement: N/A
 * Medusa can kill the player with her sight if they are within two tiles.
 * 
 * Authors: Marcus Caro, Trisha Varadaraj
 * Date: 9/25/2026
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Medusa extends GamePiece {
	
	private static final int RANGE = 2;
	
	public Medusa(int loc) {
		super('!', "Medusa", loc);
	}

	/*
	 * Medusa kills player by looking at player if within 2 tiles
	 */
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLoc) {
		int difDistance = playerLoc - getLocation();
		int absDistance = Math.abs(difDistance);
		
		if (absDistance > RANGE) {
			return InteractionResult.NONE;
		}
		
		if (absDistance == 0) {
			return InteractionResult.KILL;
		}
		
		int tile = difDistance > 0 ? 1 : -1;
		for (int loc = getLocation() + tile; loc != playerLoc; loc += tile) {
			if (gameBoard[loc] != null) {
			return InteractionResult.NONE;
			}
		}
		
		return InteractionResult.KILL;
	}
	
}
