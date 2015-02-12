
public class Rook extends Piece {

	// Use same 
	public Rook(int t)
	{
		super(t);
	}
	
	public String toString()
	{
		return "r"+this.getTeam();
	}
	
	public boolean isValidMove(int x1, int y1, int x2, int y2)
	{
		// make sure goal is within the board
		if (super.isValidMove(x1, y1, x2, y2) == false)
		{
			return false;
		}
		else
		{
			int xdif = x2 - x1;
			int ydif = y2 - y1;
			
			//Check geometry of move
			if ((xdif != 0 && ydif == 0)  ||
					(xdif == 0 && ydif != 0))
			{
				return true;
			}
			else
			{
				System.out.println("Not valid for rook");

				return false;
			}
		}
	}
}
