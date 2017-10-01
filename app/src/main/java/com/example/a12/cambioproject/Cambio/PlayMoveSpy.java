package com.example.a12.cambioproject.Cambio;

import java.util.List;

/**
 * Created by windows on 19/09/2017.
 */

public class PlayMoveSpy extends PlayMove {


    public PlayMoveSpy(APlayer player){
        super(player);
    }

    @Override
    public void activateCardAction() {

        GameLocalManager.playerSpyMove(_player);

    }

}
