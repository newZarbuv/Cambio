package com.example.a12.cambioproject.Cambio;

/**
 * Created by windows on 19/09/2017.
 */

public abstract class PlayMove {

    APlayer _player;

    public abstract void activateCardAction();

    public PlayMove(APlayer player){
        _player = player;
    }
}
