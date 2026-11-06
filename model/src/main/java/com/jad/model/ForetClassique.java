
package com.jad.model;

public class ForetClassique extends Foret {

    public ForetClassique(int largeur, int hauteur) {
        super(largeur, hauteur);
    }

    @Override
    protected boolean estUneBordureBloquante(int x, int y) {
        return x == 0 || x == largeur - 1
            || y == 0 || y == hauteur - 1;
    }

    @Override
    protected int adapterX(int x) {
        return x;
    }

    @Override
    protected int adapterY(int y) {
        return y;
    }
}
