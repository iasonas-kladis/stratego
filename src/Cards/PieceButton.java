package Cards;
/**
 * Implementation of the PieceButtons that create the Board.
 * @author csd2967
 *
 */

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class PieceButton extends JButton
{
	/**
	 * Pawn is the PieceButtons Piece.
	 * mPawn and flag are used to indicate whether
	 * the PieceButton has a Flag or a MovablePiece
	 * set in it. s, y are the buttons coordinates.
	 */
	private MovablePiece mPawn;
	private Piece Pawn;
	private Flag flag;
	private int s, y;
	/**
	 * This method shows the Player his units.
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	Returns the proper image for
	 * 					each Piece.
	 */
	public ImageIcon setImageIcon()	
	{ 
		try
        {
			if(Pawn.getOwnerName() == "P1")
			{
        		if(Pawn instanceof BeastRider)
        		{			
        			return new ImageIcon(ImageIO.read(new File("resources/beastRiderB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Dragon)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/dragonB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Dwarf)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/dwarfB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Elf)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/elfB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Flag)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/flagB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Knight)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/knightB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Yeti)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/yeti.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Mage)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/mageB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Scout)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/scoutB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Slayer)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/slayerB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Sorceress)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/sorceressB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Trap)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/trapB.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		
			}	
        	else if(Pawn.getOwnerName() == "P2")
			{
        		if(Pawn instanceof BeastRider)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/beastRiderR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Dragon)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/dragonR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Dwarf)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/dwarfR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Elf)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/elfR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Flag)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/flagR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Knight)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/knightR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof LavaBeast)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/lavaBeast.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Mage)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/mageR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Scout)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/scoutR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Slayer)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/slayerR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Sorceress)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/sorceressR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		}
        		else if(Pawn instanceof Trap)
        		{
        			return new ImageIcon(ImageIO.read(new File("resources/trapR.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        		} 		
			}
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
	/**
	 * This method shows the enemy Player his
	 * opponents back side of cards.
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	Returns the proper hidden
	 * 					side Icon for each Piece.
	 */
	public ImageIcon setBackIcon()
	{
		try
		{
			if(Pawn.getOwnerName() == "P1")
			{
				return new ImageIcon(ImageIO.read(new File("resources/blueHidden.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
			}
			else if(Pawn.getOwnerName() == "P2")
			{
				return new ImageIcon(ImageIO.read(new File("resources/redHidden.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
			}
		}
		catch(IOException e)
        {
            e.printStackTrace();
        }
        return null;
	}
	/**
	 * Piece set method
	 * 
	 * Pre-conditions:	the Piece to be set for
	 * 					the current PieceButton
	 * Post-conditions:	sets the Piece
	 */
	public void setPiece(Piece p)
	{
		Pawn = p;
	}
	/**
	 * The Piece get method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	returns the PieceButton's Piece
	 */
	public Piece getPiece()
	{
		return Pawn;
	}
	/**
	 * set x method
	 * 
	 * Pre-conditions:	the x coordinate
	 * Post-conditions:	sets the x coordinate
	 */
	public void setx(int x)
	{
		this.s = x;	
	}
	/**
	 * get x method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	returns the x coordinate
	 */
	public int getx()
	{
		return s;
	}
	/**
	 * set y method
	 * 
	 * Pre-conditions:	the y coordinate
	 * Post-conditions:	sets the y coordinate
	 */
	public void sety(int y)
	{
		this.y = y;		
	}
	/**
	 * get y method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	returns the y coordinate
	 */
	public int gety()
	{
		return y;
	}
	/**
	 * Sets the MovablePiece if it is an instance of it
	 * 
	 * Pre-conditions:	the Piece to be tested
	 * Post-conditions:	sets the MovablePiece
	 */
	public void setMovablePiece(Piece p)
	{
		mPawn = (MovablePiece)p;
	}
	/**
	 * MovablePiece get method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	returns the MovablePiece
	 */
	public MovablePiece getMovablePiece()
	{
		return mPawn;
	}
	/**
	 * Sets the Flag if it is an instance of it
	 * 
	 * Pre-conditions:	the Piece to be tested
	 * Post-conditions:	sets the Flag
	 */
	public void setFlag(Piece p)
	{
		flag = (Flag)p;
	}
	/**
	 * Flag get method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions:	returns the Flag
	 */
	public Flag getFlag()
	{
		return flag;
	}
	/**
	 * The PieceButton constructor
	 * Sets the buttons Piece and MovablePiece,
	 * Flag if they are of that type. Also
	 * sets the image.
	 */
	public PieceButton(Piece p)
	{
		this.setPiece(p);
		if(p instanceof MovablePiece)
		{
			setMovablePiece(p);
		}
		if(p instanceof Flag)
		{
			setFlag(p);
		}
		this.setIcon(setImageIcon());
	}
}
