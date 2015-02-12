
public class Piece {

	private int team;
	
	private boolean moveIsStraight;
	
	// A proper piece cannot get instantiated without a
	// starting position and a team
	public Piece(int t)
	{
		team = t;
		moveIsStraight = true;
	}

	/*--------GETTERS-------*/
	public int getTeam()
	{
		return team;
	}
	public boolean getMoveType()
	{
		return moveIsStraight;
	}
	
	/*--------SETTERS-------*/
	public void setTeam(int t)
	{
		team = t;
	}
	public void setMoveType(boolean straight)
	{
		moveIsStraight = straight;
	}
	
	
	public boolean isValidMove(int x1, int y1, int x2, int y2)
	{
		//Check if moving a blank space
		if (this.getTeam() == 2){
			System.out.println("Space");
			return false;
		}
		//Check if goal is within board bounds
		if (x2 > -1 && x2 < 8 && y2 > -1 && y2 < 8)
		{
			return true;
		}
		
		return false;
	}
	
	public String toString()
	{
		return "  ";
	}
}
