import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * This is a Card class that represents a single card:
 * 1. Card has suit;
 * 2. Card has rank;
 * 3. Card can return a value;
 */

public class Card {

    public String suit;
    public String rank;

    public Card(String r, String s) {
         rank = r;
         suit = s;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        if (rank.equals("10") || rank.equals("J") || rank.equals("Q") || rank.equals("K") ) {return 10;}
        else if (rank.equals("A")) {return 1;}
        else {return Integer.valueOf(rank);}
    }

    public boolean isA() {
        if (rank.equals("A")) {return true;}
        else return false;
    }

}

