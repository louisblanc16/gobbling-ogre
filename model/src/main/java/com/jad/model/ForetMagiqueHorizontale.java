
package com.jad.model;

public class ForetMagiqueHorizontale extends Foret {

    public ForetMagiqueHorizontale(int largeur, int hauteur) {
        super(largeur, hauteur);
    }

    @Override
    protected boolean estUneBordureBloquante(int x, int y) {
        return y == 0 || y == hauteur - 1;
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
        return y;
    }
}
