package MVC;
/**
 * Implementation of the graphical user interface
 * @author csd2967
 * 
 */
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;

import Cards.*;

public class View extends JFrame
{
	/**
	 * The View constructor.
	 * Creates the game frame and adds the Board.
	 * 
	 * Pre-conditions:	Requires the 2 Players and
	 * 					the list of Pieces
	 * Post-conditions:	Creates the GUI
	 */
	View(List<Piece> List,Player a, Player b)
	{	
		JFrame frame = new JFrame("Stratego Ice vs Fire");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new GridLayout(8, 10));	
	    Board B = new Board(List, frame, a, b);	   
	    frame.setSize(1024, 768);
	    frame.setVisible(true);
	}
}
