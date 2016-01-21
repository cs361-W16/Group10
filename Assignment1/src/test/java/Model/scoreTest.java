package Model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paul on 1/21/16.
 */
public class scoreTest {

    /* Test if score initializes to 0 */
    @Test
    public void testInitScore() {

        score myScore = new score();
        myScore.initScore();
        assertEquals(0,myScore.getScore());
    }

    /* Test adding to the score once after initializing */
    @Test
    public void testAddScore() {

        score myScore = new score();
        myScore.initScore();
        myScore.addScore();
        assertEquals(1,myScore.getScore());
    }

    /* Test adding twice to the score after initializing */
    @Test
    public void testAddTwice() {

        score myScore = new score();
        myScore.initScore();
        myScore.addScore();
        myScore.addScore();
        assertEquals(2,myScore.getScore());
    }

}