package org.example;

import java.util.Random;

public class Card {
    private suitsOf4 suit;
    private int value;

    Random random = new Random();

    public Card (suitsOf4 suit, int value) {
        this.suit = suit;
        this.value = random.nextInt(13) + 1;
    }

    public enum suitsOf4{
        heart,
        diamond,
        club,
        spade
    }




}
