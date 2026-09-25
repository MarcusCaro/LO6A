package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Wasp extends GamePiece {
	
	public Wasp(int loc) {
		super('#', "Wasp Nest", loc);
	}
	
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLoc) {
		
		if (playerLoc == getLocation()) {
			return InteractionResult.HIT;
		}
		
		return InteractionResult.NONE;
	}
	
	
}
