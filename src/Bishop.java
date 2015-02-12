public class Bishop extends Piece {

	// Use same 
	public Bishop( int t)
	{
		super(t);
	}
	
	public String toString()
	{
		return "b"+this.getTeam();
	}
}