package snap;

import snap.cardgame.CardGame;

public class Main {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame("Test");
        cardGame.newDeck();
        cardGame.getDeck();
    }
}
