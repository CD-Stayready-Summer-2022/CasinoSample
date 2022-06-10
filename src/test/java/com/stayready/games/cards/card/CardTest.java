package com.stayready.games.cards.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {

    @Test
    @DisplayName("Card Constructor Test")
    public void constructorTest(){
        Card card = new Card(CardValue.ACE, CardSuit.SPADE);
        String expected = "Suit: Spade, Value: Ace";
        String actual = card.toString();
        Assertions.assertEquals(expected, actual);
    }
}
