package Cards;
import java.util.List;

/**
 * Implementation of the Player
 * @author csd2967
 *
 */
public class Player 
{
	/**
	 * Name is the name of the player,
	 * turn defines if it is the player's turn
	 * or not, and units is the number of units
	 * of the player that are still in the game
	 */
	private String Name;
	private boolean turn;
	private int units;
	/**
	 * This method adds all the Player's Pieces
	 * 
	 *  Pre-conditions:	The list with all the Pieces
	 *	Post-conditions: Creates all the Player's Pieces
	 */
	public void addPieces(List<Piece> L)
	{
		if(this.getName() == "P1")
		{
			Yeti Ay1 = new Yeti();
			Yeti Ay2 = new Yeti();
			Dragon Adr1 = new Dragon();
			Mage Am1 = new Mage();
			Knight Ak1 = new Knight();
			Knight Ak2 = new Knight();
			BeastRider Abr1 = new BeastRider();
			BeastRider Abr2 = new BeastRider();
			BeastRider Abr3 = new BeastRider();
			Sorceress Aso1 = new Sorceress();
			Sorceress Aso2 = new Sorceress();
			Elf Ae1 = new Elf();
			Elf Ae2 = new Elf();
			Dwarf Ad1 = new Dwarf();
			Dwarf Ad2 = new Dwarf();
			Dwarf Ad3 = new Dwarf();
			Dwarf Ad4 = new Dwarf();
			Dwarf Ad5 = new Dwarf();
			Scout Asc1 = new Scout();
			Scout Asc2 = new Scout();
			Scout Asc3 = new Scout();
			Scout Asc4 = new Scout();
			Slayer Asl1 = new Slayer();
			Trap At1 = new Trap();
			Trap At2 = new Trap();
			Trap At3 = new Trap();
			Trap At4 = new Trap();
			Trap At5 = new Trap();
			Trap At6 = new Trap();
			Flag Af1 = new Flag();
			//Add to the board. The order counts
			L.add(Ay2);
			L.add(Ak1);
			L.add(At2);
			L.add(Ad5);
			L.add(Af1);
			L.add(At4);
			L.add(Ay1);
			L.add(Abr1);
			L.add(Ad3);
			L.add(Aso2);
			
			L.add(Ae1);
			L.add(Ad2);
			L.add(At3);
			L.add(Asl1);
			L.add(Ae2);
			L.add(Abr3);
			L.add(Adr1);
			L.add(At6);
			L.add(Asc3);
			L.add(Ak2);
			
			L.add(Ad1);
			L.add(Aso1);
			L.add(Asc1);
			L.add(Am1);
			L.add(At5);
			L.add(Asc4);
			L.add(Ad4);
			L.add(Asc2);
			L.add(At1);
			L.add(Abr2);
		}
		else if(this.getName() == "P2")
		{
			LavaBeast Blb1 = new LavaBeast();
			LavaBeast Blb2 = new LavaBeast();
			Dragon Bdr1 = new Dragon();
			Mage Bm1 = new Mage();
			Knight Bk1 = new Knight();
			Knight Bk2 = new Knight();
			BeastRider Bbr1 = new BeastRider();
			BeastRider Bbr2 = new BeastRider();
			BeastRider Bbr3 = new BeastRider();
			Sorceress Bso1 = new Sorceress();
			Sorceress Bso2 = new Sorceress();
			Elf Be1 = new Elf();
			Elf Be2 = new Elf();
			Dwarf Bd1 = new Dwarf();
			Dwarf Bd2 = new Dwarf();
			Dwarf Bd3 = new Dwarf();
			Dwarf Bd4 = new Dwarf();
			Dwarf Bd5 = new Dwarf();
			Scout Bsc1 = new Scout();
			Scout Bsc2 = new Scout();
			Scout Bsc3 = new Scout();
			Scout Bsc4 = new Scout();
			Slayer Bsl1 = new Slayer();
			Trap Bt1 = new Trap();
			Trap Bt2 = new Trap();
			Trap Bt3 = new Trap();
			Trap Bt4 = new Trap();
			Trap Bt5 = new Trap();
			Trap Bt6 = new Trap();
			Flag Bf1 = new Flag();
			//Set owner
			//Add to the board. The order counts
			L.add(Bsc3);
			L.add(Bt1);
			L.add(Blb2);
			L.add(Bm1);
			L.add(Bd2);	
			L.add(Bk2);
			L.add(Bsc4);
			L.add(Bbr1);
			L.add(Bsc2);
			L.add(Bt4);
			
			L.add(Bsc1);
			L.add(Bbr3);
			L.add(Bso2);
			L.add(Bt6);
			L.add(Be2);
			L.add(Bd1);
			L.add(Bbr2);
			L.add(Blb1);
			L.add(Be1);
			L.add(Bd5);
			
			L.add(Bt5);
			L.add(Bdr1);
			L.add(Bd4);
			L.add(Bsl1);
			L.add(Bk1);
			L.add(Bt3);
			L.add(Bf1);
			L.add(Bt2);
			L.add(Bd3);
			L.add(Bso1);
		}
	}
	/**
	 * Name get method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions: returns the player's name
	 */
	public String getName() 
	{
		return Name;
	}
	/**
	 * Name set method
	 * 
	 * Pre-conditions:	the name of the player
	 * Post-conditions: Sets the player's name
	 */
	public void setName(String name) 
	{
		Name = name;
	}
	/**
	 * turn get method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions: returns true if it is this
	 * 					players turn, false otherwise
	 */
	public boolean isTurn() 
	{
		return turn;
	}
	/**
	 * turn set method
	 * 
	 * Pre-conditions:	-
	 * Post-conditions: Sets the units name
	 */
	public void setTurn(boolean turn) 
	{
		this.turn = turn;
	}
	/**
	 * Units get method
	 * 
	 * Pre-conditions:	-	
	 * Post-conditions: returns the amount of units
	 * 					of the player that are still
	 * 					in play
	 */
	public int getUnits() 
	{
		return units;
	}
	/**
	 * Units set method
	 * 
	 * Pre-conditions:	units can be >= 0 and <= 30
	 * Post-conditions: Sets the total units count
	 */
	public void setUnits(int units) 
	{
		this.units = units;
	}	
	public Player(String name, List<Piece> List)
	{
		setName(name);
		this.addPieces(List);	//Creates the List of Pieces

		for(int i=0; i<List.size()/2; i++)
		{	
			List.get(i).setOwnerName("P1");
		}
		for(int i=List.size()/2; i<List.size(); i++)
		{
			List.get(i).setOwnerName("P2");
		}
	}
}
