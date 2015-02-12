AUTHOR:Taylor Owens 
email :tro2102@gmail.com
date  :12/25/2011

This program was written in Java using the 
Eclipse IDE for Java Developers 
version Indigo Service Release 1.

FILES: 

/src/Bishop.java
/src/Board.java
/src/ChessGame.java
/src/King.java
/src/Knight.java
/src/Pawn.java
/src/Piece.java
/src/Queen.java
/src/Rook.java
/bin/Bishop.java
/bin/Board.java
/bin/ChessGame.java
/bin/King.java
/bin/Knight.java
/bin/Pawn.java
/bin/Piece.java
/bin/Queen.java
/bin/Rook.java
/README.txt

PROGRAM NOTES:

Design for this program stayed basically identical to what we discussed in your office with one change - the pieces themselves no longer have any knowledge of their position on the board - that information was being stored in both the Piece and the Board, which was redundant. It is now only stored in the Board.

I've made a basic assumption, in this implementation of the check. I feel it is fairly reasonable. The assumption is as follows:

There are two different types of moves that can be made:
    1) Straight lines -- these are moves as made by any piece in 
       standard chess, with the exception of the knight. These moves
       must have a clear path to their target in order to successfully
       reach it.
    2) Non-straight lines -- like a standard knight's move. These moves
       are considered "teleporters", because they do not consider the path
       travelled - pieces can "jump" in order to reach their target.

I've implemented a validity checker for the Rook and the Knight pieces to show my implementation of both both types of moves. Other funtionality, like keeping track of remaining pieces on each team or tracking "check"s, is not implemented, as you suggested it wasn't necessary. I'd be happy to add this functionality, if you'd like.

TO RUN:

1)Ensure you have a JRE installed on your computer.
2)In a terminal or command prompt, navigate to the /bin folder.
3)Enter "java ChessGame" to begin running the program. A rudimentary
  chess board will be displayed as a text output.

TO COMPILE (if necessary):

1)Ensure you have a JRE installed on your computer.
2)Navigate to the /src folder.
3)Enter "javac *.java" to compile.
