
package com.jad.controller;

import com.jad.model.Foret;
import com.jad.view.ForetView;

public class ForetController {
    private Foret foret;
    private ForetView view;

    public ForetController(Foret foret, ForetView view) {
        this.foret = foret;
        this.view = view;
    }

    public void lancer() {
        foret.generer();
        view.afficher(foret);
    }
}