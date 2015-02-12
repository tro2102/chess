package com.github.tro2102.chess;

/**
 * Created on 2/12/15.
 *
 * @author Taylor Owens
 */
public class Position {
    private int xPos;
    private int yPos;

    public Position(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
