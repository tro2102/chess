package com.github.tro2102.chess;

import java.util.Scanner;

public class ChessGame {

    private PieceBox pieceBox;
    private Player player1;
    private Player player2;
    private Board board;

    public ChessGame() {
        pieceBox = new PieceBox();
        board = new Board(8,8);
        player1 = new Player(pieceBox.getPieces(Color.BLACK));
        player2 = new Player(pieceBox.getPieces(Color.WHITE));
    }

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Board newBoard = new Board(8, 8);
		newBoard.printBoard();
		while (true)
		{
			System.out.println("Please enter a valid move.");
			System.out.println("Enter the row of the piece you wish to move.");
			int x1 = in.nextInt();
			System.out.println("Enter the column of the piece you wish to move.");
			int y1 = in.nextInt();
			System.out.println("Enter the row of the space to which you wish to move.");
			int x2 = in.nextInt();
			System.out.println("Enter the column of the space to which you wish to move.");
			int y2 = in.nextInt();
			
			newBoard.movePiece(x1, y1, x2, y2);
			newBoard.printBoard();
		}
	}
}
