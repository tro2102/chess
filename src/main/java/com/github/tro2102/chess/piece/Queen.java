package com.github.tro2102.chess.piece;

import com.github.tro2102.chess.Team;

public class Queen extends Piece {

	// Use same 
	public Queen(Team t)
	{
		super(t);
	}

    @Override
    protected boolean isValidForPiece(int x1, int y1, int x2, int y2) {
        return false;
    }

    @Override
    protected String getStringRepresentation() {
        return "Q";
    }
}