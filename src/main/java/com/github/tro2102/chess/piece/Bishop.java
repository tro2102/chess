package com.github.tro2102.chess.piece;

import com.github.tro2102.chess.Color;

public class Bishop extends Piece {

	// Use same 
	public Bishop( Color t)
	{
		super(t);
	}

    @Override
    public boolean getMoveType() {
        return true;
    }

    @Override
    protected boolean isValidForPiece(int x1, int y1, int x2, int y2) {
        return false;
    }

    @Override
    protected String getStringRepresentation() {
        return "b";
    }
}