package snap.cardgame;

public class Card {
    private String suit;
    private String symbol;
    private int value;


    @Override
    public String toString() {
        return getClass().getSimpleName() + value +  " of " + suit + symbol ;
    }
}
