
package com.jad.main;

import com.jad.model.Foret;
import com.jad.model.ForetClassique;
import com.jad.view.ForetView;
import com.jad.controller.ForetController;

public class Main {

    public static void main(String[] args) {
        Foret foret = new ForetClassique(15, 10);

        ForetView view = new ForetView();

        ForetController controller =
            new ForetController(foret, view);

        controller.lancer();
    }
}
