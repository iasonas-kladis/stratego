package Cards;
/**
 * Implementation of the scout unit
 * @author csd2967
 *
 */
public class Scout extends SpecialMovablePiece
{
	/**
	 * The scout's free runner power. It allows the
	 * scout to move any amount of PieceButtons in a 
	 * horizontal or vertical pattern and attack if
	 * the end destination is an enemy Piece.
	 * 
	 * Pre-conditions:	The source and destination PieceButtons
	 * Post-conditions:	The destination PieceButton
	 * 					hosts the source PieceButton's
	 * 					Scout along with his image.	
	 */
	public void SpecialPower()
	{
		
	}
	/**
	 * Scout constructor
	 * Sets it's name and strength.
	 */
	Scout()
	{
		setName("Scout");
		setStrength(2);
	}
}
