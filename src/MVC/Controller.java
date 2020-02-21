package MVC;
/**
 * Implementation of the game controller 
 * @author csd2967
 *
 */
import java.util.ArrayList;
import java.util.List;
import Cards.*;

public class Controller
{
	/**
	 * The main function of the game controller.
	 * Creates the 2 Players and the View
	 */
	public static void main(String args[])
	{
		List<Piece> L = new ArrayList<Piece>();		
		Player A = new Player("P1", L);
		Player B = new Player("P2", L);
		//First to play is B.
		B.setTurn(true);
		A.setTurn(false);		
		View V = new View(L, A, B);
	}
}
