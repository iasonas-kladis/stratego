package Cards;
/**
 * Implementation of the empty land "unit"
 * @author csd2967
 *
 */
public class empty extends Piece
{
	/**
	 * The empty land constructor.
	 * Sets the owner a GameMaster, strength
	 * as zero and name as empty.
	 */
	public empty()
	{
		this.setOwnerName("GameMaster");
		this.setName("empty");
		this.setStrength(0);
	}
}
