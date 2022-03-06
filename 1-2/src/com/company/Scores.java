package com.company;

public class Scores {
    public double score;
    public int multi;
    public void results(double avg){
        if (avg>=12) System.out.println("you have passed");
        if (avg<12) System.out.println("you have failed");
    }
}
