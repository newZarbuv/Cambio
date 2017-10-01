package com.example.a12.cambioproject.Cambio;

/**
 * Created by windows on 18/09/2017.
 */
//class to describe the position of the card.
// for example - (0,0) is the top-left (1,0) is the button-left and so on.
public class CardPosition {

    int _x;
    int _y;

    public CardPosition(int x, int y){
        _x = x;
        _y=y;
    }

    public int getX(){
        return _x;
    }

    public int get_y(){
        return _y;
    }
}
