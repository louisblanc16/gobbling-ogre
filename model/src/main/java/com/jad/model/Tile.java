
package com.jad.model;

public enum Tile {
    EMPTY(true, '.'),
    CHENE(false, 'C'),
    ACACIA(false, 'A'), 
    SAPIN(false, 'S');

    private boolean passable;
    private char symbole;

    Tile(boolean passable, char symbole) {
        this.passable=passable;
        this.symbole=symbole;
    }

    public boolean isPassable(){
        return this.passable;}

    public char getSymbole() {
        return this.symbole;}
}
