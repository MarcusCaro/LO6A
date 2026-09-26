/*
 * Class: Boulder
 * Interaction: N/A
 * Movement: N/A
 * Can only be drawn. Does not interact.
 * 
 * Authors: Marcus Caro, Trisha Varadaraj
 * Date: 9/25/2026
 */
package levelPieces;

import gameEngine.Drawable;

public class Boulder implements Drawable{

	private static final char SYMBOL = 'B';
	
	@Override
	public void draw() {
		System.out.print(SYMBOL);
	}
	
}
