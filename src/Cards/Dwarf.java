package Cards;
/**
 * Implementation of the dwarf unit
 * @author csd2967
 *
 */
public class Dwarf extends SpecialMovablePiece
{
	/**
	 * The dwarf's trap neutralize power. It allows 
	 * the dwarf to win a battle against a trap.
	 * 
	 * Pre-conditions:	The source and attack 
	 * 					destination PieceButtons
	 * Post-conditions:	The destination PieceButton
	 * 					now has the source PieceButton's
	 * 					MovablePiece along with its image,
	 *					if it's a Trap.
	 */
	public void attack(PieceButton ally, PieceButton enemy)
	{
		if((enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()) || (enemy.gety() == ally.gety()+1 && enemy.getx() == ally.getx()) || (enemy.gety() == ally.gety()-1 && enemy.getx() == ally.getx()))
		{
			setCheck(true);
			empty death = new empty();
			if(enemy.getPiece() instanceof Trap)	//Neutralize
			{
				enemy.setPiece(death);
				enemy.setIcon(null);
			}
			else if(enemy.getPiece() instanceof Flag)
			{
				enemy.getFlag().setCaptured(true);
			}
			else	//Attack
			{		
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
	 * Dwarf constructor
	 * Sets it's name and strength.
	 */
	Dwarf()
	{
		setName("Dwarf");
		setStrength(3);
	}
}
