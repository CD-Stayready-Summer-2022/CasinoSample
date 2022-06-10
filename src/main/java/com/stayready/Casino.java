package com.stayready;

import com.stayready.games.cards.GoFish;
import com.stayready.games.cards.card.Card;
import com.stayready.games.cards.card.CardPlayer;

import java.util.Scanner;

public class Casino {
    private Scanner scanner;

    public Casino(){
        scanner = new Scanner(System.in);
    }

    public void start(){
        System.out.println("Player 1 whats is your name?");
        String name1 = scanner.next();
        System.out.println("Player 2 whats is your name?");
        String name2 = scanner.next();
        GoFish goFish = new GoFish(new CardPlayer(name1), new CardPlayer(name2));
        goFish.startGame();
    }

    public static void main(String[] args) {
        new Casino().start();
    }
}
