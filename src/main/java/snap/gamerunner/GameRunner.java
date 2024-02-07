package snap.gamerunner;

import snap.cardgame.CardGame;
import snap.cardgame.Snap;
import snap.commands.SnapCommands;
import snap.player.Player;

public class GameRunner {
    SnapCommands commands = new SnapCommands();
    Snap cardGame = new Snap("Test");

    public void snapInit() {
        cardGame.newDeck();
        cardGame.setDeckOfCards(cardGame.shuffleDeck());
    }

    public void initialiseGame() {
        System.out.println("\nWelcome to Snap!\n\n");
        System.out.println("How many players would like to join?");
        int players = commands.getIntegerInput(6);
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + " Enter your name");
            Player player = new Player(commands.getStringInput(), i + 1);
            cardGame.addPlayer(player);
        }
    }

    public void snapLoop(){
        cardGame.playerInit();
        while(true) {
            if(commands.pressEnter()) {
                cardGame.dealCard();
                cardGame.showCards();
                if(cardGame.cardsMatch()) {
                    cardGame.gameOver();
                    break;
                }
            }
            cardGame.nextPlayersTurn(); // Move to the next player if no match is found.
        }
    }
}
