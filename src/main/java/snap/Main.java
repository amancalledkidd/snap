package snap;

import snap.cardgame.CardGame;

public class Main {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame("Test");
        cardGame.newDeck();
        cardGame.getDeck();
        cardGame.setDeckOfCards(cardGame.shuffleDeck());
        cardGame.getDeck();
        cardGame.setDeckOfCards(cardGame.sortDeckIntoSuits());
        cardGame.getDeck();
        cardGame.setDeckOfCards(cardGame.sortDeckInNumberOrder());
        cardGame.getDeck();
        cardGame.setDeckOfCards(cardGame.newDeck());
        cardGame.getDeck();
    }
}
