package Cards;
/**
 * Implementation of the beast rider special unit
 * @author csd2967
 *
 */
public class BeastRider extends SpecialMovablePiece
{
	/**
	 * The Beast rider's speed power. It allows for
	 * moving up to 2 PieceButtons, or one and attacking.
	 * 
	 * Pre-conditions:	The source and end destination PieceButtons
	 * 					along with all the PieceButtons in between.	
	 * Post-conditions:	The beast rider's position changes
	 * 					to that of the PieceButton selected. If the
	 * 					rider attacks, the result is the same 
	 * 					as of the method attack(). 	
	 */
	public void SpecialPower()
	{
		
	}
	/**
	 * BeastRider constructor
	 * Sets it's name and strength.
	 */
	BeastRider()
	{
		this.setName("Beast Rider");
		setStrength(7);
	}
}
