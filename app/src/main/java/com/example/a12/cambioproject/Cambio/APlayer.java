package com.example.a12.cambioproject.Cambio;

import java.util.List;

/**
 * Created by windows on 18/09/2017.
 */

public abstract class APlayer implements IPlayer {

    int _points;
    List<CambioCard> _playerCards;
    String _name;

    String _avatarPath;

    @Override
    public int getPoints() {
        int points=0;
        for (Card card: _playerCards
             ) {
            points+=card.getCardValue();

        }

        return points;
    }


    public String getPlayerName(){
        return _name;
    }


}
