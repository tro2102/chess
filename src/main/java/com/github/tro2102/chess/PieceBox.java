package com.github.tro2102.chess;

import com.github.tro2102.chess.piece.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PieceBox {

    private Map<Color, Set<Piece>> pieces = new HashMap<>(Color.values().length);
    private Set<Piece> deadPieces = new HashSet<>(16);

    public PieceBox(){
        for(Color t : Color.values()) {
            pieces.put(t, populatePieces(t));
        }
    }

    public Set<Piece> getPieces(Color color) {
        return pieces.get(color);
    }

    protected Set<Piece> populatePieces(Color color) {
        Set<Piece> pieces = new HashSet<>(8);
        pieces.add( new Rook(color));
        pieces.add( new Rook(color));
        pieces.add( new Knight(color));
        pieces.add( new Knight(color));
        pieces.add( new Bishop(color));
        pieces.add( new Bishop(color));
        pieces.add( new Queen(color));
        pieces.add( new King(color));
        return pieces;
    }

}
