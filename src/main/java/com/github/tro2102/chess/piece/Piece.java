package com.github.tro2102.chess.piece;

import com.github.tro2102.chess.Color;
import com.github.tro2102.chess.Position;

public abstract class Piece {

	private Color color;
    private Position position;
	
	// A proper piece cannot get instantiated without a team
	public Piece(Color t)
	{
		color = t;
	}

	/*--------GETTERS-------*/
	public Color getColor()
	{
		return color;
	}
	public abstract boolean getMoveType();

    /*---------MOVEMENT------*/
    public final boolean isValidMove(int x1, int y1, int x2, int y2) {
        return isWithinBounds(x2, y2) && isValidForPiece(x1, y1, x2, y2);
    }
    protected final boolean isWithinBounds(int x2, int y2)
	{
		//Check if goal is within board bounds
        return x2 > -1 && x2 < 8 && y2 > -1 && y2 < 8;
    }
    protected abstract boolean isValidForPiece(int x1, int y1, int x2, int y2);

    /*---------DISPLAY--------*/
    protected abstract String getStringRepresentation();
	public final String toString()
	{
		return getStringRepresentation() + getColor();
	}
}
