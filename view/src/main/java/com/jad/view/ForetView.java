
package com.jad.view;

import com.jad.model.Foret;
import com.jad.model.Tile;

public class ForetView {

    public void afficher(Foret foret) {
        for (int y = 0; y < foret.getHauteur(); y++) {
            for (int x = 0; x < foret.getLargeur(); x++) {
                Tile tile = foret.getCase(x, y);

                System.out.print(tile.getSymbole());
            }
            System.out.println();
        }
    }
}

