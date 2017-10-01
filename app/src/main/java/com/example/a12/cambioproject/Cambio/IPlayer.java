package com.example.a12.cambioproject.Cambio;

import java.util.List;

/**
 * Created by windows on 18/09/2017.
 */

public interface IPlayer {

    public void play(CambioCard card);

    public int getPoints();

    public boolean hasCambioed();

    public List<CambioCard> getPlayerCards();

    public String getPlayerName();
}
