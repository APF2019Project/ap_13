package logic;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int size;

    public void setSize(int size) {
        this.size = size;
    }

    void addCard(){}
    void handleHand(){}
    void removeCard(Card card){
        cards.remove(card);
    }
}
