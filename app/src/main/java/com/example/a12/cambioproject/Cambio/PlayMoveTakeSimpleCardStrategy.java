package com.example.a12.cambioproject.Cambio;

import java.util.List;

/**
 * Created by windows on 19/09/2017.
 */

public class PlayMoveTakeSimpleCardStrategy extends PlayMove {


    public PlayMoveTakeSimpleCardStrategy(APlayer player) {
        super(player);
    }


    @Override
    public void activateCardAction() {
        GameLocalManager.playerAcceptCardMove(_player);
    }
}
