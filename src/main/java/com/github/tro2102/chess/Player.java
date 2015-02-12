package com.github.tro2102.chess;

import com.github.tro2102.chess.piece.Piece;

import java.util.Set;

public class Player {

    Set<Piece> pieces;

    public Player(Set<Piece> pieces) {
        this.pieces = pieces;
    }

    public Set<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(Set<Piece> pieces) {
        this.pieces = pieces;
    }
}
