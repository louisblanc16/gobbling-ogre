
package com.jad.model;

public abstract class Foret {
    protected Tile[][] cases;
    protected int largeur;
    protected int hauteur;

    public Foret(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.cases = new Tile[hauteur][largeur];
    }

    public void generer() {
        for (int y = 0; y < hauteur; y++) {
            for (int x = 0; x < largeur; x++) {
                if (estUneBordureBloquante(x, y)) {
                    cases[y][x] =
                        TileFactory.creerArbreAleatoire();
                } else {
                    cases[y][x] =
                        TileFactory.creerCaseInterieure();
                }
            }
        }
    }

    protected abstract boolean
        estUneBordureBloquante(int x, int y);

    protected abstract int adapterX(int x);
    protected abstract int adapterY(int y);

    public Tile getCase(int x, int y) {
        x = adapterX(x);
        y = adapterY(y);

        if (x < 0 || x >= largeur ||
            y < 0 || y >= hauteur) {
            return null;
        }

        return cases[y][x];
    }

    public boolean isPassable(int x, int y) {
        Tile tile = getCase(x, y);
        return tile != null && tile.isPassable();
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }
}
