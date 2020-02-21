package Cards;
/**
 * Implementation of the Knight unit
 * @author csd2967
 *
 */
public class Knight extends SpecialMovablePiece
{
	/**
	 * The Knight's speed power. It allows for moving
	 * up to 2 PieceButtons, or one and attacking.
	 * 
	 * Pre-conditions:	The source and end destination PieceButtons
	 * 					along with all the PieceButtons in between.	
	 * Post-conditions: The knight's position changes to that
	 * 					of the PieceButton selected. If the
	 * 					rider attacks, the result is the same 
	 * 					as of the method attack(). 					
	 */
	public void SpecialPower()
	{
		
	}
	/**
	 * Knight constructor
	 * Sets it's name and strength.
	 */
	Knight()
	{
		setName("Knight");
		setStrength(8);
	}
}
