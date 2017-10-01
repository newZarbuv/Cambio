package com.example.a12.cambioproject.Cambio;

import java.util.List;

/**
 * Created by windows on 19/09/2017.
 */

public class PlayMovePeek extends PlayMove {
    public PlayMovePeek(APlayer player) {
        super(player);
    }

    @Override
    public void activateCardAction() {

        //TODO: here we write the logic condition if the player want to make the move?

        GameLocalManager.playerPeekMove(_player);


    }
}
