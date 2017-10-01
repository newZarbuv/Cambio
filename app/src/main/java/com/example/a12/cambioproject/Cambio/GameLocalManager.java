package com.example.a12.cambioproject.Cambio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import java.util.Stack;

/**
 * Created by windows on 20/09/2017.
 */

public class GameLocalManager {

    // the private players cards
    private static HashMap<String,ArrayList<CambioCard>> _playersCards;
    //the knowing (by SPY or by seeing player changing cards) the opponents cards - priority to SWAP
    private static HashMap<String,HashMap<String,ArrayList<CambioCard>>> _knowingOppCards;

    ArrayList<APlayer> _players;

    CardDeck _cardDeck;

    private  static  Stack<CambioCard> _cardsOnBoard;   //the board center cards

    public GameLocalManager(){
        _cardDeck = new CardDeck();
        _playersCards = new HashMap<String,ArrayList<CambioCard>>();
        _knowingOppCards = new HashMap<String,HashMap<String,ArrayList<CambioCard>>>();
        _players = new ArrayList<APlayer>();
        _cardsOnBoard = new Stack<CambioCard>();

    }

    public static CambioCard getCardOnBoard() {
        return _cardsOnBoard.peek();
    }

    public void initializeGame(int numberOfPlayer){

    }

    public void startGame(){

        int playerTurn = 0;

        while(true){
            CambioCard card  = _cardDeck.getCard();
            APlayer curPlayer = _players.get(playerTurn);
            curPlayer.play(card);

        }
    }

    public static ArrayList<CambioCard> getPlayerCards(String name){
        return _playersCards.get(name);
    }

    public static void playerPeekMove(APlayer player) {

    }

    public static void playerSmartSwapMove(APlayer player) {

    }

    public static void playerSpyMove(APlayer player) {

    }

    public static void playerStickMove(APlayer player) {

    }

    public static void playerSwpMove(APlayer player) {

    }

    public static void playerAcceptCardMove(APlayer player) {

    }
}
