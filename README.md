This project represents a _very_ basic implementation of an OO design of a simple chess game. It is meant to be used as a point of reference for interview answers.

PROGRAM NOTES:

I've made a basic assumption, in this implementation of the check. I feel it is fairly reasonable. The assumption is as follows:

There are two different types of moves that can be made:
    1) Straight lines -- these are moves as made by any piece in 
       standard chess, with the exception of the knight. These moves
       must have a clear path to their target in order to successfully
       reach it.
    2) Non-straight lines -- like a standard knight's move. These moves
       are considered "teleporters", because they do not consider the path
       travelled - pieces can "jump" in order to reach their target.

I've implemented a validity checker for the Rook and the Knight pieces to show my implementation of both both types of moves. Other funtionality, like keeping track of remaining pieces on each team or tracking "check"s, is not implemented.