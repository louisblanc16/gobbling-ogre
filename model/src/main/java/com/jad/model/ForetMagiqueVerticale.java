
package com.jad.model;

public class ForetMagiqueVerticale extends Foret {

    public ForetMagiqueVerticale(int largeur, int hauteur) {
        super(largeur, hauteur);
    }

    @Override
    protected boolean estUneBordureBloquante(int x, int y) {
        return x == 0 || x == largeur - 1;
    }

    @Override
    protected int adapterX(int x) {
        return x;
    }

    @Override
    protected int adapterY(int y) {
        if (y < 0) {
            return hauteur - 1;
        }
        if (y >= hauteur) {
            return 0;
        }
        return y;
    }
}
