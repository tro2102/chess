package com.github.tro2102.chess.piece;

import com.github.tro2102.chess.Team;

public class Knight extends Piece {

	// Use super 
	public Knight(Team t)
	{
		super(t);
		this.setMoveType(false);
	}

    @Override
    protected boolean isValidForPiece(int x1, int y1, int x2, int y2) {
        int xDiff = Math.abs(x2 - x1);
        int yDiff = Math.abs(y2 - y1);

        return (xDiff == 2 && yDiff ==1) || (xDiff == 1 && yDiff ==2);
    }

    @Override
    protected String getStringRepresentation() {
        return "k";
    }
}