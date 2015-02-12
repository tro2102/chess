public class King extends Piece {

	// Use same 
	public King(int t)
	{
		super(t);
	}
	
	public String toString()
	{
		return "K"+this.getTeam();
	}
}