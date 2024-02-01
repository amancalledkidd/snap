package snap.cardgame;

import java.util.ArrayList;

public class CardGame {
    ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;

    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = newDeck();
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

    public void getDeck() {
        for (Card card: deckOfCards) {
            System.out.println(card);
        }
    }
}
