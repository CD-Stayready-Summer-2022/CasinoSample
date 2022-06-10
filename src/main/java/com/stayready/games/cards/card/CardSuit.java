package com.stayready.games.cards.card;

public enum CardSuit {
    CLUB("Club"), SPADE("Spade"), HEART("Heart"), DIAMOND("Diamond");

    public final String name;

    CardSuit(String name){
        this.name = name;
    }
}
