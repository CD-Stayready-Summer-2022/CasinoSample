package com.stayready.games.cards.deck;

import com.stayready.games.cards.card.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeckTest {
    private    Deck deck;

    @BeforeEach
    public void setUp(){
        this.deck = new Deck();
    }

    @Test
    public void constructorTest(){
        Integer expected = 52;
        Integer actual = deck.cardsRemaining();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void takeCardFromDeckTest01(){
        Card card = deck.takeCardFromDeck();
        Integer expected = 51;
        Integer actual = deck.cardsRemaining();
        Assertions.assertNotNull(card);
        Assertions.assertEquals(expected,actual);
    }
}
