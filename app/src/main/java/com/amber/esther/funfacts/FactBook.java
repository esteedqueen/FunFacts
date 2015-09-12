package com.amber.esther.funfacts;

import java.util.Random;

/**
 * Created by eit on 9/11/15.
 */
public class FactBook {
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "blah blah blah",
            "Treehouse is not atually in a tree",
            "Life is tasty",
            "Azonto Fiesta"
    };
    public String getFact(){
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Randum number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        return fact;
    }
}
