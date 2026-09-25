package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;


public class Treasure extends GamePiece{

	public Treasure(int loc) {
		super('$', "Treasure", loc);
	}
	
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLoc) {
		
		if (playerLoc == getLocation()) {
			gameBoard[getLocation()] = null;
			return InteractionResult.GET_POINT;
		}
		
		return InteractionResult.NONE;
	}
	
	
}