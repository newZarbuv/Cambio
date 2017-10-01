package com.example.a12.cambioproject.Cambio;

/**
 * Created by windows on 18/09/2017.
 */


public class CambioCard extends Card {
    /*
    The card action represent the moves that player cad make with the card.
    Peek (7 and 8) — Look at one of your own cards;
    Spy (9 and 10) — Look at one of another player's cards (make sure no one else sees what it is);
    Swap (Jack and Queen) — Swap one of your own cards with one of another's (but no peeking! Neither the swapper nor the swappee may look at either of the swapped cards).
    SMART_SWAP (K of spade)
    */
    public enum Card_Action{
        PEEK, SPY , SWAP ,SMART_SWAP, DEFAULT
    }

    Card_Action _cardAction;

    CardPosition _position;  //the position of the card on player "board"

    int _cardPoints;   //the value of the card

    boolean _hasReviled = false;  //set true is the player that hold the card saw the card.

    public CambioCard(Card_Shape shape,Card_Rank value){
        super(shape, value);
        setCardAction();
    }

    //set card points value , whrn king of heart is 0 and joker is -1, all the other
    //card get the value as the number they represent (ace-1, two -2 etc.)
    private void setCardPoints() {
        if (_cardRank == Card_Rank.JOKER) {
            _cardPoints = -1;
        } else if (_cardRank == Card_Rank.KING && (_cardShape == Card_Shape.HEART)) {
            _cardPoints = 0;
        } else {
            _cardPoints = _cardRank.ordinal() + 1;  //the value is the ordinal location by enum definition.
        }
    }

    //setting the card action follow the game logic
    private void setCardAction() {
        if (_cardRank==Card_Rank.QUEEN || _cardRank==Card_Rank.JACK){
            _cardAction = Card_Action.SWAP;
        }
        else if (_cardRank==Card_Rank.NINE || _cardRank==Card_Rank.TEN){
            _cardAction = Card_Action.SPY;
        }
        else if (_cardRank==Card_Rank.SEVEN || _cardRank==Card_Rank.EIGHT){
            _cardAction = Card_Action.PEEK;
        }
        else if (_cardRank==Card_Rank.KING && (_cardShape==Card_Shape.SPADE || _cardShape==Card_Shape.CLUB)){
            _cardAction = Card_Action.SMART_SWAP;
        }
        else{
            _cardAction = Card_Action.DEFAULT;
        }
    }

    public void setPosition(CardPosition p){
        _position = new CardPosition(p.getX(),p.get_y());
    }

    public void setPosition(int x, int y){
        _position = new CardPosition(x,y);
    }

    public Card_Action getCardAction(){
        return _cardAction;
    }

    public CardPosition getCardPosition(){
        return _position;
    }

    public int getCardValue(){
        return this._cardPoints;
    }

    public boolean hasReviled(){
        return _hasReviled;
    }
}
