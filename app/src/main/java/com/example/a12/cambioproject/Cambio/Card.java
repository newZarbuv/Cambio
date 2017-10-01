package com.example.a12.cambioproject.Cambio;

/**
 * Created by windows on 12/09/2017.
 */

public class Card {
//card shapes
    public enum Card_Shape{
        SPADE, CLUB, DIAMOND, HEART
    }

    public enum Card_Rank{
        ACE, TWO, THREE, FOUR, FIVE, SIX , SEVEN , EIGHT, NINE, TEN , JACK, QUEEN, KING, JOKER
    }

    Card_Shape _cardShape;
    Card_Rank _cardRank;

    public Card(Card_Shape shape,Card_Rank value){
        _cardShape = shape;
        _cardRank = value;
    }

    public Card(){
    }

    public Card_Shape getCardShape(){
        return _cardShape;
    }

    public int getCardValue(){
        return _cardRank.ordinal()+1;
    }
}
