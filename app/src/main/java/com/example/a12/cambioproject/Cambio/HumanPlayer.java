package com.example.a12.cambioproject.Cambio;

import java.util.List;

/**
 * Created by windows on 19/09/2017.
 */

public class HumanPlayer extends APlayer {
    @Override
    public void play(CambioCard card) {
        GameLocalManager.getPlayerCards(this._name);



    }




    @Override
    public boolean hasCambioed() {
        return false;
    }

    @Override
    public List<CambioCard> getPlayerCards() {
        return null;
    }
}
