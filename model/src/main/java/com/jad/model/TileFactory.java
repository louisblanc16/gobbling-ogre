
package com.jad.model;

public class TileFactory {

    public static Tile creerArbreAleatoire() {
        int choix = (int) (Math.random() * 3);

        if (choix == 0) {
            return Tile.CHENE;
        } else if (choix == 1) {
            return Tile.ACACIA;
        } else {
            return Tile.SAPIN;
        }
    }

    public static Tile creerCaseInterieure() {
        int choix = (int) (Math.random() * 4);

        if (choix == 0) {
            return creerArbreAleatoire();
        } else {
            return Tile.EMPTY;
        }
    }
}
