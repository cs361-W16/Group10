package Model;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by Codysseus on 1/21/2016.
 */
public class Deck {
        private int count;
        private Card[] cards;

        public Deck(){
                count = 52;
                cards = new Card[count];

                int i = 0;
                char[] suits = {'H', 'D', 'S', 'C'};
                for(int s = 0; s < 4; s++){
                        for(int f = 1; f < 14; f++){
                                cards[i] = new Card();
                                cards[i].setSuit(suits[s]);
                                cards[i].setFace(f);
                                i++;
                        }
                }
        }
        public int getCount(){
                return count;
        }

        public Card draw() {
                count-=1;
                Card temp = null;
                if(count >= 0)
                        temp = cards[count];

                return temp;
        }
}
