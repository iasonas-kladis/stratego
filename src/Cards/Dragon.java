package Cards;
/**
 * Implementation of the dragon special unit
 * @author csd2967
 *
 */
public class Dragon extends SpecialMovablePiece
{
	/**
	 * The Dragon's flight power. It allows the dragon
	 * to fly over occupied and forbidden PieceButton and land
	 * on the next unoccupied one. It might attack instantly. 
	 * The flight can be horizontal or vertical.
	 * 
	 * Pre-conditions:	The source and end destination PieceButtons
	 * 					along with all the PieceButtons in between					
	 * Post-conditions:	The dragon's position changes to
	 * 					that of the PieceButton selected. If the 
	 * 					dragon attacks the result is the same 
	 * 					as of the method attack().				
	 */
	public void SpecialPower()
	{
		
	}
	/**
	 * Dragon constructor
	 * Sets it's name and strength.
	 */
	Dragon()
	{
		setName("Dragon");
		setStrength(10);
	}
}
