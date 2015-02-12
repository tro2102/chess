package com.github.tro2102.chess.piece;

import com.github.tro2102.chess.Team;

public abstract class Piece {

	private Team team;
	private boolean moveIsStraight;
	
	// A proper piece cannot get instantiated without a
	// starting position and a team
	public Piece(Team t)
	{
		team = t;
		moveIsStraight = true;
	}

	/*--------GETTERS-------*/
	public Team getTeam()
	{
		return team;
	}
	public boolean getMoveType()
	{
		return moveIsStraight;
	}
	
	/*--------SETTERS-------*/
	public void setTeam(Team t)
	{
		team = t;
	}
	public void setMoveType(boolean straight)
	{
		moveIsStraight = straight;
	}

    /*-----TO IMPLEMENT-----*/
    protected abstract boolean isValidForPiece(int x1, int y1, int x2, int y2);
    protected abstract String getStringRepresentation();

    /*---------UTILITY------*/
    public final boolean isValidMove(int x1, int y1, int x2, int y2) {
        return isWithinBounds(x2, y2) && isValidForPiece(x1, y1, x2, y2);
    }
    protected final boolean isWithinBounds(int x2, int y2)
	{
		//Check if goal is within board bounds
        return x2 > -1 && x2 < 8 && y2 > -1 && y2 < 8;
    }
	
	public final String toString()
	{
		return getStringRepresentation() + getTeam();
	}
}
