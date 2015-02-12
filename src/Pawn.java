public class Pawn extends Piece {

	// Use super 
	public Pawn(int t)
	{
		super(t);
	}
	
	public String toString()
	{
		return "p"+this.getTeam();
	}
}