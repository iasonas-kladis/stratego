package Cards;
/**
 * Implementation of the elf unit
 * @author csd2967
 *
 */
public class Elf extends SpecialMovablePiece
{
	/**
	 * The elf's ranged attack power together with her
	 * melee attack. It allows  the elf to kill units with 
	 * a strength of 3 or lower without being adjacent to them.
	 * Otherwise a simple attack is performed.
	 * 
	 * Pre-conditions:	The source and attack 
	 * 					destination PieceButtons
	 * Post-conditions:	The destination PieceButton
	 * 					now has an empty Piece and a null
	 * 					image, if it has strength < 4.
	 * 					Otherwise the elf attacks.
	 */
	public void attack(PieceButton ally, PieceButton enemy)
	{
		setCheck(true);
		empty death = new empty();
		if((enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()) || (enemy.gety() == ally.gety()+1 && enemy.getx() == ally.getx()) || (enemy.gety() == ally.gety()-1 && enemy.getx() == ally.getx()))
		{
			if(enemy.getPiece().getStrength() == 0)	
			{
				if(enemy.getPiece() instanceof Flag)
				{
					enemy.getFlag().setCaptured(true);
				}
				else	//Trap
				{
					ally.setPiece(death);
					ally.setIcon(null);
				}
			}
			else
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
		else if((enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()) || (enemy.getx() == ally.getx()+2 && enemy.gety() == ally.gety()) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()) || (enemy.getx() == ally.getx()-2 && enemy.gety() == ally.gety()) || (enemy.gety() == ally.gety()+1) && enemy.getx() == ally.getx() || (enemy.gety() == ally.gety()+2) && enemy.getx() == ally.getx() || (enemy.gety() == ally.gety()-1) && enemy.getx() == ally.getx() || (enemy.gety() == ally.gety()-2) && enemy.getx() == ally.getx() || (enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()+1) || (enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()+2) || (enemy.getx() == ally.getx()+2 && enemy.gety() == ally.gety()+1) || (enemy.getx() == ally.getx()+2 && enemy.gety() == ally.gety()+2) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()+1) || (enemy.getx() == ally.getx()-2 && enemy.gety() == ally.gety()+1) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()+2) || (enemy.getx() == ally.getx()-2 && enemy.gety() == ally.gety()+2) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()-1) || (enemy.getx() == ally.getx()-2 && enemy.gety() == ally.gety()-1 ) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()-2) || (enemy.getx() == ally. getx()-2 && enemy.gety() == ally.gety()-2)  || (enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()-1) || (enemy.getx() == ally.getx()+2 && enemy.gety() == ally.gety()-1) || (enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()-2) || (enemy.getx() == ally.getx()+2 && enemy.gety() == ally.gety()-2))
		{			
			if(enemy.getPiece().getStrength() != 0)
			{		
				if(ally.getPiece().getStrength() > enemy.getPiece().getStrength())
				{
					enemy.setPiece(death);
					enemy.setIcon(null);
				}
			}
		}
	}
	/**
	 * Elf constructor
	 * Sets it's name and strength.
	 */
	Elf()
	{
		setName("Elf");
		setStrength(4);
	}
}
