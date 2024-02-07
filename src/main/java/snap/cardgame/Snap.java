package snap.cardgame;

import snap.player.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Snap extends CardGame {
    private String lastCard;
    private String currentCard = "X";
    private ArrayList<Player> playerList = new ArrayList<>();
    private Player activePlayer;


    public Snap(String name) {
        super(name);
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void playerInit () {
        Collections.shuffle(playerList);
        activePlayer = playerList.get(0);
        System.out.println(activePlayer.getName() + " to go first!");
    }

    public void addPlayer (Player newPlayer) {
        playerList.add(newPlayer);
    }

    public void nextPlayersTurn() {
        if (playerList.isEmpty()) {
            System.out.println("Player list is empty. Cannot proceed to the next player's turn.");
            return;
        }

        int currentIndex = playerList.indexOf(activePlayer);
        int nextPlayer = (currentIndex + 1) % playerList.size();

        // Set the new active player and update the turn flags
        playerList.get(currentIndex).setPlayerTurn(false);
        playerList.get(nextPlayer).setPlayerTurn(true);
        activePlayer = playerList.get(nextPlayer);

        System.out.println("It's now " + activePlayer.getName() + "'s turn.");
    }

    public void showCards() {
        System.out.println("Previous card: " + lastCard + " New card: " + currentCard);
    }

    public void printPlayersTurn() {
        System.out.println("Player " + activePlayer.getId() + " / " + activePlayer.getName() + " it's your turn!");
    }

    public void dealCard() {
        lastCard = currentCard;

        if (deckOfCards.isEmpty()) {
            setDeckOfCards(newDeck());
            setDeckOfCards(shuffleDeck());
        }
        currentCard = deckOfCards.get(0).getSymbol();
        deckOfCards.remove(0);
    }
    public boolean cardsMatch() {
        return Objects.equals(currentCard, lastCard);
    }


    public void gameOver() {
        if (activePlayer != null) {
            System.out.println("Congratulations " + activePlayer.getName() + " two cards match you win");
        } else {
            System.out.println("Congratulations two cards match you win");
        }

    }

}
