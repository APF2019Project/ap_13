package logic;

import java.util.ArrayList;

public class Collection {
    Account owner;
    ArrayList<Card> cards;
    boolean hasCard(int cardID){}
    boolean hasCard(Card card){}
    void addCardToCollection(Card card){
        cards.add(card);
    }

    public Card getCards(Card card) {

    }

    public Card getCards(int cardID){

    }
}
