package Model;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by Codysseus on 1/21/2016.
 */
public class Deck {
        private int count;
        private Card[] cards;
	//public void shuffle();

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
		//Shuffle cards here
		shuffle();
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

	/**
	*Created by Natasha Anisimova
	*/

	public void shuffle() {
	    for ( int i = cards.length-1; i > 0; i-- ) {
	            int rand = (int)(Math.random()*(i+1));
	            Card temp = cards[i];
	            cards[i] = cards[rand];
	            cards[rand] = temp;
            }
	    cardsUsed = 0;
        }
}
/*not sure how to access the positions of the cards at the moment, the ___ are where that information goes though
 ____[] faceup = new ___;
faceup[0]=(bottom of c1);
faceup[1]=(bottom of c2);
faceup[2]=(bottom of c3);
faceup[3]=(bottom of c4);
while(faceup.length!=0){
    faceup=findmatches(faceup);
 }
 also not positive how to do pointers in java, other than that they're apparently called references
____[] findmatches(____ []){
int nomatch = 0;
 int i=1;
while(nomatch!=3){
    if(faceup[0].(card class..?).getSuit()==faceup[i].(card class..?).getSuit()){
        if(faceup[0].(card class..?).getFace()< faceup[i].(card class..?).getFace()){
            *faceup[0]=NULL;
            pfaceup[0]=(whatever card was above the last one deleted);
            i=1;
            nomatch=0;
        }
        else{
            *faceup[i]=NULL;
            faceup[i]=(whatever card was above the last one deleted);
            i=1;
            nomatch=0;
        }
    }
    else{
        nomatch++;
        i++;
    }
    }
 for (int j = 0 ; j != 2; j++) {
    faceup[j] = faceup[j+1];
 }
faceup[3]=NULL;
 return faceup;
 }



*/