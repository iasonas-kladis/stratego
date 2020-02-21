package Cards;
/**
 * Implementation of the Flag static unit
 * @author csd2967
 *
 */
public class Flag extends ImmovablePiece 
{
	/**
	 * The state of each player's flag. If it
	 * becomes true, the other player has won.
	 */
	private boolean Captured=false;
	/**
	 * The Captured get method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	returns the state of the flag
	 */
	public boolean isCaptured() 
	{
		return Captured;
	}
	/**
	 * The Captured set method
	 * 
	 * Pre-conditions:	a boolean that specifies the 
	 * 					flag as captured or free.
	 * Post-conditions:	Flag's Captured is set
	 */
	public void setCaptured(boolean Captured) 
	{
		this.Captured = Captured;
	}
	/**
	 * Flag constructor
	 * Sets it's name.
	 */
	Flag()
	{
		setStrength(0);
		setName("Flag");
	}
}
