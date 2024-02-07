package snap.card;

public enum CardSuit {
    Hearts("♡"),
    Diamonds("♢"),
    Spades("♤"),
    Clubs("♧");

    private final String unicodeStr;

    CardSuit(String unicodeStr) {
        this.unicodeStr = unicodeStr;
    }

    public String getUnicodeStr() {
        return unicodeStr;
    }
}
