public class Knight extends Piece {

	// Use super 
	public Knight(int t)
	{
		super(t);
		this.setMoveType(false);
	}
	
	public String toString()
	{
		return "k"+this.getTeam();
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
			
			if (Math.abs(xdif) == 2)
			{
				if (Math.abs(ydif) == 1)
				{
					return true;
				}
			}
			else if (Math.abs(xdif) == 1)
			{
				if (Math.abs(ydif) == 2)
				{
					return true;
				}
			}
		}
		return false;
	}
}