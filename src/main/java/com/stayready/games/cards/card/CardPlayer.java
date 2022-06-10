package com.stayready.games.cards.card;

import com.stayready.Player;

import java.util.Objects;

public class CardPlayer extends Player {
    private Hand hand;

    public CardPlayer(String name) {
        super(name);
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

}
