package com.example.a12.cambioproject.Cambio;

import java.util.HashMap;
import java.util.List;

/**
 * Created by windows on 19/09/2017.
 */

public class AppSimplePlayer extends APlayer {

    CambioCard _currentCard;    //the card that the player hold on his turn

    @Override
    public void play(CambioCard card) {
        int points = this.getPoints();
        if (points <= 5) {
            declareCambio(points);
            return;
        }

        CambioCard cardOnBaord  = GameLocalManager.getCardOnBoard();
        _playerCards = GameLocalManager.getPlayerCards(this._name);   //get the plaer cards after updating..
        _currentCard = card;
        PlayMove playmove = null;

        //check if we can "stick" card. fpr example  - if on the board we have 7 and we know that one of our
        //own card is 7, we stick it .
        for (int cardI = 0 ; cardI<_playerCards.size(); cardI++) {
            CambioCard playerCard = _playerCards.get(cardI);
            if (playerCard.hasReviled() && playerCard.getCardValue() == cardOnBaord.getCardValue()) {
                playmove = new PlayMoveStick(this);
                return;
            }
        }


        //create concrete instance of playMove follow the required action
        switch (card.getCardAction()) {
            case DEFAULT:
                playmove = new PlayMoveTakeSimpleCardStrategy(this);   // Check whether to take the card or throw it
                break;
            case PEEK:
                playmove = new PlayMovePeek(this);
                break;
            case SPY:
                playmove = new PlayMoveSpy(this);
                break;
            case SWAP:
                playmove = new PlayMoveSwap(this);
                break;
            case SMART_SWAP:
                playmove = new PlayMoveSmartSwap(this);
                break;
        }

        playmove.activateCardAction();   //activate the move
    }


    private boolean takeCardSimpleStrategy() {
        return false;

    }


    private void stickCard(int cardI) {
    }

    private void declareCambio(int points) {
    }

    @Override
    public boolean hasCambioed() {
        return false;
    }

    @Override
    public List<CambioCard> getPlayerCards() {
        return null;
    }
}
