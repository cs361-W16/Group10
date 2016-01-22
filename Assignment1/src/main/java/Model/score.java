package Model;

/**
 * Created by paul on 1/20/16.
 */
public class score {

    /* Int to keep track of score */
    private int score;

    /* Initialize the score to zero */
    public void initScore () {
        this.score = 0;
    }

    /* Get the value of int score */
    public int getScore () {
        return this.score;
    }

    /* Add 1 to the current score */
    public void addScore () {
        this.score += 1;
    }

}
