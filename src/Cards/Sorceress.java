package Cards;
/**
 * Implementation of the sorceress unit
 * @author csd2967
 *
 */
public class Sorceress extends SpecialMovablePiece
{
	/**
	 * The Sorceres's Convert power added upon her attack
	 * method. The Sorceress can attack or change
	 * the allegience of an enemy unit to serve the 
	 * Player's side.
	 * 
	 * Pre-conditions:	The source and destination 
	 *  				PieceButtons
	 * Post-conditions:	The enemy unit's owner and icon 
	 * 					change if it's strength is < 6
	 */
	public void attack(PieceButton ally, PieceButton enemy)
	{
		//Convert
		if((enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()) || (enemy.getx() == ally.getx()+2 && enemy.gety() == ally.gety()) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()) || (enemy.getx() == ally.getx()-2 && enemy.gety() == ally.gety()) || (enemy.gety() == ally.gety()+1) && enemy.getx() == ally.getx() || (enemy.gety() == ally.gety()+2) && enemy.getx() == ally.getx() || (enemy.gety() == ally.gety()-1) && enemy.getx() == ally.getx() || (enemy.gety() == ally.gety()-2) && enemy.getx() == ally.getx() || (enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()+1) || (enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()+2) || (enemy.getx() == ally.getx()+2 && enemy.gety() == ally.gety()+1) || (enemy.getx() == ally.getx()+2 && enemy.gety() == ally.gety()+2) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()+1) || (enemy.getx() == ally.getx()-2 && enemy.gety() == ally.gety()+1) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()+2) || (enemy.getx() == ally.getx()-2 && enemy.gety() == ally.gety()+2) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()-1) || (enemy.getx() == ally.getx()-2 && enemy.gety() == ally.gety()-1 ) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()-2) || (enemy.getx() == ally. getx()-2 && enemy.gety() == ally.gety()-2)  || (enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()-1) || (enemy.getx() == ally.getx()+2 && enemy.gety() == ally.gety()-1) || (enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()-2) || (enemy.getx() == ally.getx()+2 && enemy.gety() == ally.gety()-2))
		{			
			if(enemy.getPiece().getStrength() != 0)
			{
				setCheck(true);
				if(enemy.getPiece().getStrength() < ally.getPiece().getStrength())
				{
					enemy.getPiece().setOwnerName(ally.getPiece().getOwnerName());
					enemy.setIcon(ally.getIcon());
				}
			}
		}
		//Attack
		if((enemy.getx() == ally.getx()+1 && enemy.gety() == ally.gety()) || (enemy.getx() == ally.getx()-1 && enemy.gety() == ally.gety()) || (enemy.gety() == ally.gety()+1 && enemy.getx() == ally.getx()) || (enemy.gety() == ally.gety()-1 && enemy.getx() == ally.getx()))
		{
			setCheck(true);
			empty death = new empty();
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
	}
	/**
	 * Sorceress constructor
	 * Sets it's name and strength.
	 */
	Sorceress()
	{
		setName("Sorceress");
		setStrength(6);
	}
}
