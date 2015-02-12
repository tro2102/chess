package com.github.tro2102.chess;

import com.github.tro2102.chess.piece.*;

public class Board {

	private Piece mainBoard[][];
	
	public Board(int x, int y)
	{
		mainBoard = new Piece[x][y];
		this.populateBoard();
	}
	// fill board with pieces in standard starting positions.
	// NOTE: this is hard-coded for an 8x8 standard chess 
	//       board. If the board size is different, there
	//       will need to be a different population algorithm
	public void populateBoard()
	{
		//Populate "main" pieces
		for (int i = 0; i < 2; i++)
		{
			int row = i*7;
			mainBoard[row][0] = new Rook(Team.values()[i]);
			mainBoard[row][7] = new Rook(Team.values()[i]);
			mainBoard[row][1] = new Knight(Team.values()[i]);
			mainBoard[row][6] = new Knight(Team.values()[i]);
			mainBoard[row][2] = new Bishop(Team.values()[i]);
			mainBoard[row][5] = new Bishop(Team.values()[i]);
			mainBoard[row][3] = new Queen(Team.values()[i]);
			mainBoard[row][4] = new King(Team.values()[i]);
		}
		//populate pawns
		for (int j = 0; j <= 7; j++)
		{
			mainBoard[1][j] = new Pawn(Team.WHITE);
			mainBoard[6][j] = new Pawn(Team.BLACK);
		}
	}
	
	// Display very simple graphic representation of board
	public void printBoard()
	{
		System.out.println("  0  1  2  3  4  5  6  7 ");
		System.out.println(" -------------------------");
		for (int i = 0; i < 8; i++)
		{
			System.out.print(i+"|");
			for (int j = 0; j < 8; j++)
			{
				System.out.print("" + (mainBoard[i][j] != null ? mainBoard[i][j].toString() : "      ") + "|");
			}
			System.out.print("\n");
		}
		System.out.println(" -------------------------");
	}
	
	public void movePiece(int x1, int y1, int x2, int y2)
	{
		if (x1 > -1 && x1 < 8 && y1 > -1 && y1 < 8)
		{
			if (this.isValidMove(x1, y1, x2, y2))
			{
				if (mainBoard[x1][y1].getTeam() == mainBoard[x2][y2].getTeam())
				{
					System.out.println("That space is already occupied by your own team.");
				}
				else
				{
					// Move Piece to new location
					// ignoring potential 'remainingPieces'
					// integer
					mainBoard[x2][y2] = mainBoard[x1][y1];
					// fill old spot with empty space
					mainBoard[x1][y1] = null;
				}
			}
			else
			{
				System.out.println("That was not a valid move");
			}
		}
		else
		{
			System.out.println("Please enter a valid board coordinate");
		}
	}
	
	// Checks for move validity by calling for the Piece to check
	// it's geometric validity and then analyzing the board to
	// check for blocking pieces 
	public boolean isValidMove(int x1, int y1, int x2, int y2) {
        Piece movingPiece = mainBoard[x1][y1];
        boolean geoValid = movingPiece.isValidMove(x1, y1, x2, y2);

        return geoValid && (!movingPiece.getMoveType() || this.checkPath(x1, y1, x2, y2));
    }
	
	// Check move path (must be straight and valid (geometrically)
	// at this point) for pieces which will block movement
	public boolean checkPath(int x1, int y1, int x2, int y2)
	{
		int difx = x2 - x1;
		int dify = y2 - y1;
		// Check for 1-space move to avoid incorrect functionality
		// of following checks
		if (Math.abs(difx) == 1 || Math.abs(dify) == 1)
		{
			return true;
		}
		// Horizontal Movement
		if (x1 == x2)
		{
			if (y1 < y2)
			{
				for (int i = y1+1; i < y2; i++)
				{
					if (mainBoard[x1][i] != null)
					{
						return false;
					}
				}
				return true;
			}
			else
			{
				for (int i = y2+1; i < y1; i++)
				{
					if (mainBoard[x1][i] != null)
					{
						return false;
					}
				}
				return true;
			}
		}
		// Vertical Movement
		else if (y1 == y2)
		{
			if (x1 < x2)
			{
				for (int i = x1+1; i < x2; i++)
				{
					if (mainBoard[i][y1] != null)
					{
						return false;
					}
				}
				return true;
			}
			else
			{
				for (int i = x2+1; i < x1; i++)
				{
					if (mainBoard[i][y1] != null)
					{
						return false;
					}
				}
				return true;
			}
		}
		// Diagonal Movement
		else
		{
			System.out.println("Diag");
			// redundant check
			if (Math.abs(difx) != Math.abs(dify))
			{
				return false;
			}
			if (difx > 0)
			{
				// southeast
				if (dify > 0)
				{
					for (int i = 1; i < difx; i++)
					{
						if (mainBoard[x1+i][y1+i] != null)
						{
							return false;
						}
					}
				}
				// northeast
				else
				{
					for (int i = 1; i < difx; i++)
					{
						if (mainBoard[x1+i][y1-i] != null)
						{
							return false;
						}
					}
				}
			}
			else
			{
				// southwest
				if (dify > 0)
				{
					for (int i = 1; i < dify; i++)
					{
						if (mainBoard[x1-i][y1+i] != null)
						{
							return false;
						}
					}
				}
				// northwest
				else
				{
					for (int i = 1; i < Math.abs(difx); i++)
					{
						if (mainBoard[x1-i][y1-i] != null)
						{
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}
