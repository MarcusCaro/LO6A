package levelPieces;

import java.util.Random;

import gameEngine.Drawable;
import gameEngine.Moveable;


public abstract class WanderingPiece extends GamePiece implements Moveable{
	
	protected static final Random RNG = new Random();
	private final int maxMove;
	
	public WanderingPiece(char symbol, String label, int loc, int maxMove) {
		super(symbol, label, loc);
		this.maxMove = maxMove;
		
	}
	
	@Override
	public void move(Drawable[] gameBoard, int playerLoc) {
		int oldLoc = getLocation();
		int direction = RNG.nextBoolean() ? 1 : -1;
		int distance = RNG.nextInt(maxMove);
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
}
