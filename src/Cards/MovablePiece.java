package Cards;
/**
 * Implementation of the movable piece unit type
 * @author csd2967
 *
 */
public abstract class MovablePiece extends Piece
{	
	/**
	 * A boolean check is used to 
	 * indicate if the piece actually
	 * moved or attacked in its turn
	 */
	private boolean check;
	/**
	 * check set method
	 * 
	 * Pre-conditions:	boolean that defines if a unit
	 * 					actually moved or attacked
	 * Post-conditions:	-
	 */
	public void setCheck(boolean check)
	{
		this.check = check;
	}
	/**
	 * check get method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	returns the boolean check
	 */
	public boolean getCheck()
	{
		return check;
	}
	/**
	 * The move function that all MovablePieces
	 * are allowed to do.
	 * 
	 * Pre-conditions:	The source and destination 
	 *  				PieceButtons
	 * Post-conditions:	The destination PieceButton
	 * 					hosts the source PieceButton's
	 * 					MovablePiece along with its image.
	 */
	public void moveTo(PieceButton from, PieceButton to)
	{	
		if((to.getx() == from.getx()+1 && to.gety() == from.gety()) || (to.getx() == from.getx()-1 && to.gety() == from.gety()) || (to.gety() == from.gety()+1 && to.getx() == from.getx()) || (to.gety() == from.gety()-1 && to.getx() == from.getx()))
		{
			setCheck(true);
			Piece tmPiece = to.getPiece();
			to.setPiece(from.getPiece());
			to.setIcon(from.getIcon());
			from.setPiece(tmPiece);
			from.setIcon(null);
		}

	}
	/**
	 * The attack function that allows a unit
	 * to attack an adjacent enemy unit.
	 * 
	 * Pre-conditions:	The source and attack 
	 * 					destination PieceButtons
	 * Post-conditions:	The destination PieceButton
	 * 					now has the source PieceButton's
	 * 					MovablePiece along with its image.
	 */					
	public void attack(PieceButton ally, PieceButton enemy)
	{	
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
}
