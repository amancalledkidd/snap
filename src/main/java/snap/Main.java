package snap;

import snap.cardgame.CardGame;
import snap.gamerunner.GameRunner;

public class Main {
    public static void main(String[] args) {
        GameRunner gameRunner = new GameRunner();
        gameRunner.snapInit();
        gameRunner.initialiseGame();
        gameRunner.snapLoop();
    }
}
