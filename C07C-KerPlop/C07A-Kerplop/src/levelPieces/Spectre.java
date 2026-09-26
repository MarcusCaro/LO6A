/*
 * Class: Spectre
 * Interaction: NONE
 * Movement: Random through RNG
 * Spectre moves around the board randomly. Does not interact.
 * 
 * Authors: Marcus Caro, Trisha Varadaraj
 * Date: 9/25/2026
 */
package levelPieces;

import java.util.Random;

import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractionResult;

public class Spectre extends GamePiece implements Moveable {
	
	private static final Random RNG = new Random();
	private final int MAX_MOVE = 2;
	
	public Spectre(int loc) {
		super('*', "Spectre", loc);
	}
	
	/*
	 * Determine movement for Spectre using RNG
	 * RNG for direction and distance
	 */
	@Override
	public void move(Drawable[] gameBoard, int playerLoc) {
		int oldLoc = getLocation();
		int direction = RNG.nextBoolean() ? 1 : -1;
		int distance = RNG.nextInt(MAX_MOVE);
		int newLoc = oldLoc + (direction * distance);
		
		if (newLoc < 0) {
			newLoc = 0;
		}
	
		if (newLoc >= gameBoard.length) {
			newLoc = gameBoard.length - 1;
		}
			
		if (newLoc != oldLoc && gameBoard[newLoc] != null) {
			return;
		}
		
		gameBoard[oldLoc] = null;
		setLocation(newLoc);
		gameBoard[newLoc] = this;
				
	}

	/*
	 * Interaction for Spectre is NONE
	 */
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLoc) {
		return InteractionResult.NONE;
	}
}
