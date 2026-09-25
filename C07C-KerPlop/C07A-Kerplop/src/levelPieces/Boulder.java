package levelPieces;

import gameEngine.Drawable;

public class Boulder implements Drawable{

	private static final char SYMBOL = 'B';
	
	@Override
	public void draw() {
		System.out.print(SYMBOL);
	}
	
}
