package com.example.a12.cambioproject.Cambio;

/**
 * Created by windows on 19/09/2017.
 */

public class PlayMoveStick extends PlayMove {
    public PlayMoveStick(APlayer player) {
        super(player);
    }

    @Override
    public void activateCardAction() {
        GameLocalManager.playerStickMove(_player);
    }
}
