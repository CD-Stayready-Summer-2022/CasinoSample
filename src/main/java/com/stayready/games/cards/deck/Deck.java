package com.stayready.games.cards.deck;

import com.stayready.games.cards.card.Card;
import com.stayready.games.cards.card.CardSuit;
import com.stayready.games.cards.card.CardValue;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        buildDeck();
    }

    private void buildDeck(){
        for(CardSuit suit : CardSuit.values()){
            for(CardValue value : CardValue.values()){
                Card card = new Card(value, suit);
                cards.add(card);
            }
        }
    }

    public Card takeCardFromDeck(){
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }

    public Integer cardsRemaining(){
        return cards.size();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }


}
