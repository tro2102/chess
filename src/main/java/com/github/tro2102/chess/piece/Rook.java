package com.github.tro2102.chess.piece;

import com.github.tro2102.chess.Color;

public class Rook extends Piece {

	public Rook(Color t)
	{
		super(t);
	}

    @Override
    public boolean getMoveType() {
        return true;
    }

    @Override
    protected boolean isValidForPiece(int x1, int y1, int x2, int y2) {
        int xdif = x2 - x1;
        int ydif = y2 - y1;

        //Check geometry of move
        return (xdif != 0 && ydif == 0) ||
                (xdif == 0 && ydif != 0);
    }

    @Override
    protected String getStringRepresentation() {
        return "r";
    }
}
