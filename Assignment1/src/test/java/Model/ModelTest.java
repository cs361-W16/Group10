package Model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Codysseus on 1/21/2016.
 */
public class ModelTest {

    /*@Test
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
    public void testDrawCardSpecific(){
        Deck stack = new Deck();
        Card temp = stack.draw();

        assertEquals('C', temp.getSuit());
        assertEquals(13, temp.getFace());
    }

    @Test
    public void testCard(){
        Card temp = new Card();
        assertEquals(0, temp.getSuit());
        assertEquals(0, temp.getFace());

        temp.setSuit('A');
        temp.setFace(1);

        assertEquals('A', temp.getSuit());
        assertEquals(1, temp.getFace());
    }
    */
    /**
     * Created by Natasha Anisimova
     */
    @Test
    public void testshuffle(){
        //Need code here to test the shuffle function, make sure the cards are not NULL
        Deck tempdeck = new Deck();
        //for (int i =0; i < 13; i++){
        //    for(int i = 0; i < 4; i++){
                //assertEquals(,temp.getSuit());
        //Checking all the cards
        for(int i=0; i <52; i++){
            Card onecard = tempdeck.draw();
            Assert.assertNotNull(onecard.getSuit());
            Assert.assertNotNull(onecard.getFace());
         //   }
        }
    }

    //@Test
    //public void testcardsinshuffle(){
      //  Deck anothertempdeck = new Deck();
        //for(int i=0; i<52; i++){
            //Make sure that the suit is at least equal to one of the possible suits
            //assertEquals("C" || "H" || "D" || "S",anothertempdeck.draw().getSuit());

        //}
    //}
}
