package Cards;
/**
 * Implementation of the Piece general unit type
 * @author csd2967
 *
 */

abstract public class Piece
{
	/**
	 * name is the name of the unit
	 * isInGame is the boolean that defines if
	 * the unit of a player is still in the game.
	 * position is the unit's place on the board
	 */
	private String name, ownerName;
	private boolean isInGame;	//Would have been used for the rescue() method.
	private int Strength;
	/**
	 * The ownerName set method
	 * 
	 * Pre-conditions:	the piece's owner name to be set
	 * Post-conditions:	-
	 */
	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}
	/**
	 * The ownerName get method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	returns the owner's name
	 */
	public String getOwnerName()
	{
		return ownerName;
	}
	/**
	 * The Strength set method
	 * 
	 * Pre-conditions:	the particular unit's strength
	 * Post-conditions:	-
	 */
	public void setStrength(int strength)
	{
		this.Strength = strength;
	}
	/**
	 * The Strength get method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	returns the unit's strength
	 */
	public int getStrength()
	{
		return Strength;
	}
	/**
	 * Name get method
	 * 
	 * Pre-conditions:	-	
	 * Post-conditions:	returns the unit's name
	 */
	public String getName() 
	{
		return name;
	}
	/**
	 * Name set method
	 * 
	 * Pre-conditions:	name is the actual name that
	 * 					will be given to the unit
	 * Post-conditions: Sets the units name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	/**
	 * isInGame get method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	returns the isInGame variable
	 */
	public boolean isInGame() 
	{
		return isInGame;
	}
	/**
	 * isInGame set method
	 * 
	 * Pre-conditions:	isInGame, the boolean variable 
	 * 					that changes the unit's game status
	 * Post-conditions: Sets the units isInGame 
	 * 					characteristic
	 */
	public void setInGame(boolean isInGame) 
	{
		this.isInGame = isInGame;
	}
}
