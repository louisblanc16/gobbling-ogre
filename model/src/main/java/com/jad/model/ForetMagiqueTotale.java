
package com.jad.model;

public class ForetMagiqueTotale extends Foret {

    public ForetMagiqueTotale(int largeur, int hauteur) {
        super(largeur, hauteur);
    }

    @Override
    protected boolean estUneBordureBloquante(int x, int y) {
        return false;
    }

    @Override
    protected int adapterX(int x) {
        if (x < 0) {
            return largeur - 1;
        }
        if (x >= largeur) {
            return 0;
        }
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
