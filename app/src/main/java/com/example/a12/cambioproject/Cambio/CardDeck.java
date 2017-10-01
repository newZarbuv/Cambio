package com.example.a12.cambioproject.Cambio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

/**
 * Created by windows on 12/09/2017.
 */

//TODO: testing all methods.
public class CardDeck {

    Stack<CambioCard> _allCards = new Stack<>();
    //HashSet<Card> _cardsInGame = new HashSet<>(); //contain all the cards witch already in play(on table) and not in the deck

    public CardDeck(){

        //put all cards in set
        //TODO: add JOKERS
        for(Card.Card_Rank rank : Card.Card_Rank.values())
            for(Card.Card_Shape shape : Card.Card_Shape.values())
                _allCards.add(new CambioCard(shape,rank));
    }

    //TODO: Check if converting and shuffle works.
    private void shuffle(){
        ArrayList<CambioCard> deckAsList = new ArrayList<CambioCard>(_allCards);
        Collections.shuffle(deckAsList);
        _allCards.addAll(deckAsList);

    }

    //this function return 4 cards. when game start for each player we call to this function
    public CambioCard[] get4CardForPlayer(){
        CambioCard[] cards = new CambioCard[4];
        for(int i = 0 ; i<4 ; i++){
            cards[i]=_allCards.pop();
        }
        return cards;
    }

    //function to draw new card.
    public CambioCard getCard(){
        return _allCards.pop();
    }




}
