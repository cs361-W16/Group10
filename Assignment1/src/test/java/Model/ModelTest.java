package Model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Codysseus on 1/21/2016.
 */
public class ModelTest {

    @Test
    public void testHasFullDeck(){
        Deck stack = new Deck();

        assertEquals(52, stack.getCount());
    }
    @Test
    public void testCardCountAfterDraw1(){
        Deck stack = new Deck();
        stack.draw();

        assertEquals(51, stack.getCount());
    }
    @Test
    public void testCardCountAfterDraw2(){
        Deck stack = new Deck();
        stack.draw();
        stack.draw();

        assertEquals(50, stack.getCount());
    }
    @Test
    public void testCardDraw(){
        Deck stack = new Deck();
        Card temp = new Card();
        Card temp2 = stack.draw();

        temp.setFace(13);
        temp.setSuit('C');

        assertEquals(temp.getSuit(), temp2.getSuit());
        assertEquals(temp.getFace(), temp2.getFace());
    }
    @Test
    public void testCardSpecific(){
        Deck stack = new Deck();
        Card temp = stack.draw();

        assertEquals('C', temp.getSuit());
        assertEquals(13, temp.getFace());
    }
}
