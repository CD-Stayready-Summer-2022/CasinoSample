package com.stayready.games.cards.deck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeckTest {

    @Test
    public void constructorTest(){
        Deck deck = new Deck();
        Integer expected = 52;
        Integer actual = deck.cardsRemaining();
        Assertions.assertEquals(expected, actual);
    }
}
