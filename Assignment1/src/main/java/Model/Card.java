package Model;

/**
 * Created by Codysseus on 1/21/2016.
 */
public class Card {
    private char suit;
    private int face;

    public Card(){
        suit = 0;
        face = 0;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }
}
