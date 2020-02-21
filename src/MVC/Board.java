package MVC;
import java.awt.Font;
import java.awt.Color;
import java.util.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

import Cards.*;

/**
 * Implementation of the Board where the game is played.
 * @author csd2967
 *
 */
public class Board 
{	
	/**
	 * Player a, b and JFrame frame are used to as pass by value
	 * variables that are used for the proper Controller class function.
	 * iconSelected is used to identify if the source PieceButton
	 * is clicked, selectedButton is the source PieceButton and button[][]
	 * is the array used so that a reference point is created for
	 * each PieceButton.
	 */
	private Player a, b;
	private JFrame frame;
	private boolean iconSelected;
	private PieceButton selectedButton;
    private PieceButton[][] button = new PieceButton[8][10];
    public PieceButton getButton(int x, int y)
    {
    	return button[x][y];
    }
    /**
	 * The Board constructor
	 */
	public Board(List<Piece> List, JFrame frame, Player a, Player b)
	{
		this.a = a;
		this.b = b;
		this.frame = frame;
	    CardListener click = new CardListener();
	    for(int i=0; i<8; i++)	//Here all the PieceButtons are created and added to the main frame
	    {
	    	for(int j=0; j<10; j++)
	    	{ 		
	    		if(i>=0 && i <3)
	    		{
	    			button[i][j] = new PieceButton(List.get(10*(i)+j));
	    			button[i][j].setx(i);
	    			button[i][j].sety(j);
	    			button[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
	    			button[i][j].addMouseListener(click);		
	    			button[i][j].setIcon(button[i][j].setBackIcon());	//Hidden at first.	
	    			this.frame.add(button[i][j]);
	    		}
	    		else if(i>=3 && i<5)
	    		{
	    			empty land = new empty();
	    			
	    			button[i][j] = new PieceButton(land);
	    			button[i][j].setx(i);
	    			button[i][j].sety(j);
	    			button[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
	    			if(j==2 || j==3 || j==6 || j==7)
	    			{	
	    				button[i][j].setVisible(false);
	    			}
	    			else
	    			{
	    				button[i][j].addMouseListener(click);
	    			}
	    			frame.add(button[i][j]);
	    		}
	    		else
	    		{
	    			button[i][j] = new PieceButton(List.get(10*(i-2)+j));
	    			button[i][j].setx(i);
	    			button[i][j].sety(j);
	    			button[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
	    			button[i][j].addMouseListener(click);
	    			this.frame.add(button[i][j]);
	    		}
	    		
	    	}
	    }   
	}
	/**
	 * This is how all the PieceButtons act, and 
	 * where the turns change. Every change is made
	 * by the CardListener, as the game is played by mouse.
	 */
	private class CardListener implements MouseListener
	{
		public void mouseClicked(MouseEvent e)
		{
			PieceButton pB = ((PieceButton) e.getSource());	//The clicked PieceButton
			if(iconSelected && !pB.equals(selectedButton) && selectedButton.getPiece().getOwnerName() != pB.getPiece().getOwnerName())
			{
				if(pB.getPiece().getOwnerName() == "GameMaster" && a.isTurn())	
				{
					selectedButton.getMovablePiece().moveTo(selectedButton, pB);	//Move
					if(selectedButton.getMovablePiece().getCheck() == true)
					{
						b.setTurn(true);
						a.setTurn(false);
						selectedButton.getMovablePiece().setCheck(false);
					}
				}
				else if(pB.getPiece().getOwnerName() == "GameMaster" && b.isTurn())	
				{
					selectedButton.getMovablePiece().moveTo(selectedButton, pB);	//Move
					if(selectedButton.getMovablePiece().getCheck() == true)
					{
						b.setTurn(false);
						a.setTurn(true);
						selectedButton.getMovablePiece().setCheck(false);
					}
				}
				else if(pB.getPiece().getOwnerName() == "P2" && a.isTurn())
				{
					selectedButton.getMovablePiece().attack(selectedButton, pB);	//Attack
					if(selectedButton.getMovablePiece().getCheck() == true)
					{
						b.setTurn(true);
						a.setTurn(false);
						selectedButton.getMovablePiece().setCheck(false);
					}				
				}
				else if(pB.getPiece().getOwnerName() == "P1" && b.isTurn())
				{
					selectedButton.getMovablePiece().attack(selectedButton, pB);	//Attack
					if(selectedButton.getMovablePiece().getCheck() == true)
					{
						b.setTurn(false);
						a.setTurn(true);
						selectedButton.getMovablePiece().setCheck(false);
					}
				}		
				selectedButton.setBorder(BorderFactory.createLineBorder(Color.black)); 
                iconSelected=false;
            	/*Icon changes per turn*/
                if(a.isTurn())
				{
                	for(int i=0; i<8; i++)
                	{
                		for(int j=0; j<10; j++)
                		{
                			if(button[i][j].getPiece().getOwnerName() == "P2")
                			{
                				button[i][j].setIcon(button[i][j].setBackIcon());
                			}
                			else if(button[i][j].getPiece().getOwnerName()== "P1")
                			{
                				button[i][j].setIcon(button[i][j].setImageIcon());
                			}
                		}
                	}
					//System.out.println("A turn");			
				}
				else if(b.isTurn())
				{
                	for(int i=0; i<8; i++)
                	{
                		for(int j=0; j<10; j++)
                		{
                			if(button[i][j].getPiece().getOwnerName() == "P1")
                			{
                				button[i][j].setIcon(button[i][j].setBackIcon());		
                			}
                			else if(button[i][j].getPiece().getOwnerName() == "P2")
                			{
                				button[i][j].setIcon(button[i][j].setImageIcon());
                			}
                		}
                	}
					//System.out.println("B turn");
				}
                for(int i=0; i<8; i++)
            	{
            		for(int j=0; j<10; j++)
            		{
            			if(button[i][j].getPiece() instanceof Flag)
            			{
            				if(button[i][j].getFlag().isCaptured() == true)	//Victory
            				{
            					JFrame win = new JFrame();
            					JButton message;
            					if(button[i][j].getPiece().getOwnerName() == "P1")
            					{
            						message = new JButton("Red won!");
            						message.setBackground(Color.RED);
            					}
            					else
            					{
            						message = new JButton("Blue won!");
            						message.setBackground(Color.BLUE);
            					}
            					message.setFont(new Font("Arial", Font.PLAIN, 40));
            					message.setEnabled(false);
            					win.add(message);
            					win.setSize(300, 100);
            					win.setLocationRelativeTo(null);
            					win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            					win.setVisible(true);
            					frame.setVisible(false);
            					frame.dispose();
            				}
            			}
            		}
            	}
                
			}
			else if(!iconSelected && pB.getPiece().getOwnerName() != "GameMaster" && pB.getPiece() instanceof MovablePiece)
			{
				if(pB.getPiece().getOwnerName() == "P1" && a.isTurn())
				{
					iconSelected=true;
					selectedButton = pB;
					selectedButton.setMovablePiece(selectedButton.getPiece());
					pB.setBorder(BorderFactory.createLineBorder(Color.YELLOW,3));
				}
				else if(pB.getPiece().getOwnerName() == "P2" && b.isTurn())
				{
					iconSelected=true;
					selectedButton = pB;
					selectedButton.setMovablePiece(selectedButton.getPiece());
					pB.setBorder(BorderFactory.createLineBorder(Color.YELLOW,3));
				}
			}
			else
			{
                if(iconSelected)
                {
                    System.out.println("You have already selected your piece. Make a move or attack an enemy!");
                }
                else
                {
                	System.out.println("Please select one of your pieces that can move!");
                }
            }
		}
	    public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
	}
}
