package com.amber.esther.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by eit on 9/11/15.
 */
public class ColorWheel {
    public String[] mColors = {
    "#39add1", // light blue
    "#3079ab", // dark blue
    "#c25975", // mauve
    "#e15258", // red
    "#f9845b", // orange
    "#838cc7", // lavender
    "#7d669e" // purple
    };
    public int getColor(){
        String color = "";
        // Randomly select a color
        Random randomGenerator = new Random(); // Construct a new Randum number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}