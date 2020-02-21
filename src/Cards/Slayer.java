package Cards;
/**
 * Implementation of the slayer unit
 * @author csd2967
 *
 */
public class Slayer extends SpecialMovablePiece
{
	/**
	 * The Slayer DragonSlayer power. It allows the
	 * Slayer to kill the dragon instantly, if he is 
	 * the one to attack him.
	 * 
	 * Pre-conditions:	The source and attack 
	 * 					destination PieceButtons
	 * Post-conditions:	if the dragon is chosen as the
	 * 					target, the dragon's PieceButton
	 * 					now hosts the Slayer along with
	 * 					his image.
	 */
	public void attack(PieceButton ally, PieceButton enemy)
	{
		if((enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()) || (enemy.gety() == ally.gety()+1 && enemy.getx() == ally.getx()) || (enemy.gety() == ally.gety()-1 && enemy.getx() == ally.getx()))
		{
			setCheck(true);
			empty death = new empty();
			if(enemy.getPiece() instanceof Dragon)
			{
				enemy.setPiece(ally.getPiece());
				enemy.setIcon(ally.getIcon());
				ally.setPiece(death);
				ally.setIcon(null);
			}
			else if(enemy.getPiece() instanceof Trap)
			{
				ally.setPiece(death);
				ally.setIcon(null);
			}
			else if(enemy.getPiece() instanceof Flag)
			{
				enemy.getFlag().setCaptured(true);
			}
			else
			{
				//Non-special movable pieces
				if(ally.getPiece().getStrength() > enemy.getPiece().getStrength())
				{
					enemy.setPiece(ally.getPiece());
					enemy.setIcon(ally.getIcon());
					ally.setPiece(death);
					ally.setIcon(null);
				}
				else if(ally.getPiece().getStrength() == enemy.getPiece().getStrength())
				{
					enemy.setPiece(death);
					enemy.setIcon(null);
					ally.setPiece(death);
					ally.setIcon(null);
				}
				else if(ally.getPiece().getStrength() < enemy.getPiece().getStrength())
				{
					ally.setPiece(death);
					ally.setIcon(null);
				}
			}
		}
	}
	/**
	 * Slayer constructor
	 * Sets it's name and strength.
	 */
	Slayer()
	{
		setName("Slayer");
		setStrength(1);
	}
}
