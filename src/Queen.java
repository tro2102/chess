public class Queen extends Piece {

	// Use same 
	public Queen(int t)
	{
		super(t);
	}
	
	public String toString()
	{
		return "q"+this.getTeam();
	}
}