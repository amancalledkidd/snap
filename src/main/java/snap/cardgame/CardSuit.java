package snap.cardgame;

public enum CardSuit {
    Hearts("U+2665"),
    Diamonds("U+2666"),
    Spades("U+2660"),
    Clubs("U+2663");

    private final String unicodeImage;

    CardSuit(String unicodeImage) {
        this.unicodeImage = unicodeImage;
    }

    public String getUnicodeImage() {
        return unicodeImage;
    }
}
