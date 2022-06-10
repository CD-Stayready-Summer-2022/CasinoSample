package com.stayready.games.cards.card;

import com.stayready.games.cards.Game;
import com.stayready.games.cards.deck.Deck;

public abstract class CardGame implements Game {
    protected Deck deck;

    public CardGame(){
        this.deck = new Deck();
        deck.shuffle();
    }
}
