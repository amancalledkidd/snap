package snap.cardgame;

import snap.card.Card;
import snap.card.CardRanks;
import snap.card.CardSuit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class CardGame {
    ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;

    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = newDeck();
    }

    public String getName() {
        return name;
    }

    public void setDeckOfCards(ArrayList<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public ArrayList<Card> newDeck()  {
        ArrayList<Card> deck = new ArrayList<>();
        for (CardSuit suit: CardSuit.values()){
            for(CardRanks ranks: CardRanks.values()){
                deck.add(new Card(suit, ranks.getSymbol(), ranks.getValue()));
            }
        }
        return deck;
    }

    public ArrayList<Card> sortDeckInNumberOrder(){
        return (ArrayList<Card>) deckOfCards.stream()
                .sorted((a,b) -> a.getValue() - b.getValue())
                .collect(Collectors.toList());
    }

    public ArrayList<Card> sortDeckIntoSuits(){
        return (ArrayList<Card>) deckOfCards.stream()
                .sorted((a,b) -> a.getSuit().compareTo(b.getSuit()))
                .collect(Collectors.toList());
    }

    public ArrayList<Card> shuffleDeck(){
        ArrayList<Card> randomDeck = new ArrayList<>(deckOfCards);
        Collections.shuffle(randomDeck);
        return randomDeck;
    }


    public void getDeck() {
        for (Card card: deckOfCards) {
            System.out.println(card);
        }
    }
}
